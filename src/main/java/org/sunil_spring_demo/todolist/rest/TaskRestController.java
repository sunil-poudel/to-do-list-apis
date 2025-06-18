package org.sunil_spring_demo.todolist.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.sunil_spring_demo.todolist.dao.TaskDAO;
import org.sunil_spring_demo.todolist.entity.Task;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
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

    @PostMapping("/tasks")
    public void save(@RequestBody Task task){
        task.setId(0);
        taskDAO.saveOrUpdateTask(task);
    }

    @PutMapping("/tasks")
    public void update(@RequestBody Task task){
        taskDAO.saveOrUpdateTask(task);
    }

    @DeleteMapping("/tasks/{id}")
    public String delete(@PathVariable int id){
        return taskDAO.deleteTask(id);
    }


}
