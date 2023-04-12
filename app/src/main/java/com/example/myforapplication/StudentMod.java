package com.example.myforapplication;



public class StudentMod {
    private String name;
    private int age;

    private int Id;

    public StudentMod(int id, String name, int age ) {
        this.name = name;
        this.age = age;
        Id = id;
    }

    public StudentMod() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "customerModel{" +
                "name=" + name +
                ", age=" + age +
                ", Id=" + Id +
                '}';
    }
