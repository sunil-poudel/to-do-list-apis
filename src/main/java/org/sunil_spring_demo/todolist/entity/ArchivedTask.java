package org.sunil_spring_demo.todolist.entity;


import jakarta.persistence.*;

@Entity
@Table(name="archived_task")
public class ArchivedTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="date")
    private String date;

    @Column(name="description")
    private String Description;

    public ArchivedTask() {

    }

    public ArchivedTask(String title, String date, String description) {
        this.title = title;
        this.date = date;
        Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Task {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}

