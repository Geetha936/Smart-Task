package com.Smart.demo.controllers;

import com.Smart.demo.Entity.Task;
import com.Smart.demo.Repositories.TaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private  final TaskRepository taskRepository;

    public  TaskController(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public  void  createTask(@RequestBody Task task){
        taskRepository.save(task);
    }
}
