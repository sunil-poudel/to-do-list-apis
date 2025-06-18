package org.sunil_spring_demo.todolist.dao;

import org.sunil_spring_demo.todolist.entity.Task;

import java.util.List;

public interface TaskDAO {
    List<Task> getAllTasks();
    Task getTaskById(int id);
    void saveOrUpdate(Task task);
}
