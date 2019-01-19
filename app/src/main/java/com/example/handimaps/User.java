package com.example.handimaps;

public class User {
    private int user_id;
    private String user_name;
    private int points;

    public User() {}

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int id) {
        user_id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String name) {
        user_name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int p) {
        points = p;
    }
}