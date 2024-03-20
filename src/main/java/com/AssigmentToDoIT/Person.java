package com.AssigmentToDoIT;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        if (firstName == null)
            throw new IllegalArgumentException("First name cannot be null");
        this.firstName = firstName;
        if (lastName == null)
            throw new IllegalArgumentException("Last name cannot be null");
        this.lastName = lastName;
        if (email == null)
            throw new IllegalArgumentException("Email name cannot be null");
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setFirstName(String firstName) {
        if (firstName == null)
            throw new IllegalArgumentException("First name cannot be null");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null)
            throw new IllegalArgumentException("Last name cannot be null");
        this.lastName = lastName;
    }

    public void setEmailName(String email) {
        if (email == null)
            throw new IllegalArgumentException("Email cannot be null");
        this.email = email;
    }

    public String getSummary() {
        return "{" +
                "id: " + firstName + " " + lastName +
                ", email: " + email +
                "}";

    }
}
