package com.example.listviewhw;

public class FridayModel {
    private String name;
    private String firstName;
    private int age;

    public FridayModel(String name, String firstName, int age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
