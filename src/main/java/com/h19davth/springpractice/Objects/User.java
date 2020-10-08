package com.h19davth.springpractice.Objects;

public class User {
    private String name;
    private int age;
    private String picture;
    private final int userID;
    private static int id = 0;

    public User(String name, int age, String picture) {
        this.name = name;
        this.age = age;
        this.picture = picture;
        this.userID = ++id;
    }

    public User(User u) {
        this.name = u.name;
        this.age = u.age;
        this.userID = u.userID;
    }

    public User(){
        userID = ++id;
    }

    public int getUserID(){
        return this.userID;
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
}
