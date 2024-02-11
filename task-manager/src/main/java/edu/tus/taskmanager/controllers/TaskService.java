package edu.tus.taskmanager.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.tus.taskmanager.dao.TaskRepository;
import edu.tus.taskmanager.dto.Task;

@RestController
@Service
public class TaskService
{

    @Autowired
    TaskRepository taskRepo;

    @GetMapping("/tasks")
    List<Task> getAllTasks()
    {
        return taskRepo.queryByPriority(1);
    }

    @GetMapping("/demo3")
    Task getTaskByTargetDate()
    {
        LocalDate date = LocalDate.of(2022, 02, 20);
        return taskRepo.findFirstByTargetDate(date);
    }

//	@GetMapping("/tasks")
//	Page<Task> getTasksByPage(Pageable pageable){
//		Page<Task> taskPage=taskRepo.findAll(pageable);
//		return taskPage;
//
//	}

    @GetMapping("/demo1") //printing 4 elements
    public void demo1()
    {
        PageRequest firstPageWithFourElements = PageRequest.of(0, 4, Sort.by("targetDate"));
        Page<Task> page = taskRepo.findAll(firstPageWithFourElements);
        printPage(page);
    }

    @GetMapping("/demo2") //sort by priority
    public void demo2()
    {
        List<Task> taskList = taskRepo.findAll(Sort.by("priority").and(Sort.by("targetDate")));
        printTasks(taskList);
    }

    private void printTasks(List<Task> taskList)
    {
        for (Task task : taskList)
        {
            System.out.println(task.toString());
        }

    }

    private void printPage(Page page)
    {
        List<Task> taskList = page.getContent();
        long totalItems = page.getTotalElements();
        int totalPages = page.getTotalPages();
        System.out.println("Total Items " + totalItems);
        System.out.println("Total Pages " + totalPages);
        for (Task task : taskList)
        {
            System.out.println(task.toString());
        }

    }

}