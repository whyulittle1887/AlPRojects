package edu.tus.taskmanager.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.tus.taskmanager.dto.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>
{
    List<Task> findByPriority(int priority);

    List<Task> queryByPriority(int priority);

    Task findFirstByTargetDate(LocalDate targetDate);


}
