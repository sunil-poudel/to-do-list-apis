package org.sunil_spring_demo.todolist.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sunil_spring_demo.todolist.dao.TaskDAO;
import org.sunil_spring_demo.todolist.entity.Task;

import java.util.List;

@RestController
@RequestMapping("/apis")
public class TaskRestController {
    private TaskDAO taskDAO;
    @Autowired
    public TaskRestController(TaskDAO taskDAO){
        this.taskDAO = taskDAO;
    }

    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
        return taskDAO.getAllTasks();
    }

    @GetMapping("/tasks/{id}")
    public Task getTaskById(@PathVariable int id){
        return taskDAO.getTaskById(id);
    }



}
