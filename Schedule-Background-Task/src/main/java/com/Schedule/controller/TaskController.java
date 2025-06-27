package com.Schedule.controller;

import com.Schedule.model.Task;
import com.Schedule.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/all")
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/create")
    public Task createTask(@RequestBody Task task) {
        return taskService.saveTask(task);
    }
}
