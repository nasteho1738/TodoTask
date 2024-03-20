package com.AssigmentToDoIT;

import java.time.LocalDate;
public class ToDoItem {
    private int id;
    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;
    public ToDoItem(int id, String title, String description, LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        this.title = title == null || title.isEmpty() ? "No title" : title;
        this.description = description;
        this.deadLine = deadLine == null ? LocalDate.now() : deadLine;
        this.done = done;
        this.creator = creator;
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
        if(title == null) {
            throw new IllegalArgumentException(" Title cannot be null");
        } else {
            this.title = title;
        }
      //  this.title = title == null || title.isEmpty() "No title" : title;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }
}
