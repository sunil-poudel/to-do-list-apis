package org.sunil_spring_demo.todolist.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.sunil_spring_demo.todolist.entity.Task;

import java.util.List;

@Repository
public class TaskDAOImpl implements TaskDAO{
    private EntityManager entityManager;

    @Autowired
    public TaskDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Task> getAllTasks() {
        TypedQuery<Task> query = entityManager.createQuery(
                "FROM Task", Task.class
        );
        return query.getResultList();
    }

    @Override
    public Task getTaskById(int id) {
        return entityManager.find(Task.class, id);
    }

    @Override
    @Transactional
    public Task saveOrUpdateTask(Task task) {
        return entityManager.merge(task);
    }

    @Transactional
    @Override
    public Task deleteTask(int id) {
        Task task = entityManager.find(Task.class, id);
        entityManager.remove(task);
        return task;
    }


}
