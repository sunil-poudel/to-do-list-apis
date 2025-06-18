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
    public void saveOrUpdate(Task task) {
        entityManager.merge(task);
    }


}
