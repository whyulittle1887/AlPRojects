package edu.tus.taskmanager.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private int priority;
    private boolean isDone;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "target_Date", columnDefinition = "DATE")
    private LocalDate targetDate;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getPriority()
    {
        return priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public boolean isDone()
    {
        return isDone;
    }

    public void setDone(boolean isDone)
    {
        this.isDone = isDone;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public LocalDate getTargetDate()
    {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate)
    {
        this.targetDate = targetDate;
    }

    @Override
    public String toString()
    {
        return "Task [id=" + id + ", description=" + description + ", priority=" + priority + ", isDone=" + isDone
                + ", status=" + status + ", targetDate=" + targetDate + "]";
    }


}
