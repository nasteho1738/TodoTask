package com.AssigmentToDoIT;

import java.util.Objects;

public class ToDoItemTask {
    private int id;
    private boolean assigned;
    private ToDoItem toDoItem;
    private Person assignee;

    public ToDoItemTask(int id, ToDoItem todoItem, Person assignee) {
        this.id = id;
        this.toDoItem = todoItem;
        this.assignee = assignee;
        this.assigned = assignee !=null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public ToDoItem  getToDoItem() {
        return toDoItem;
    }

    public void setTodoItem(ToDoItem todoItem) {
        this.toDoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        this.assigned = assignee != null;
    }

    public String getSummary() {
        return String.format("Task ID: %d, Task: %s, Assigned: %s", id, toDoItem, assigned ? "Yes" : "No");
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        ToDoItemTask that = (ToDoItemTask) o;
        return id == that.id &&
                Objects.equals(toDoItem, that.toDoItem) &&
                Objects.equals(assignee, that.assignee);
    }

