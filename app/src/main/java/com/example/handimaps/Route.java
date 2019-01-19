package com.example.handimaps;

public class Route {
    private int route_id;
    private String start_location;
    private String end_location;
    private String intermediate_loc;
    private String ratings;
    private int made_by_user;
    private String time;
    private String notes;

    public Route() {}

    public int getRoute_id() {
        return route_id;
    }

    public void setRoute_id(int id) {
        route_id = id;
    }

    public String getStart_location() {
        return start_location;
    }

    public void setStart_location(String loc) {
        start_location = loc;
    }

    public String getEnd_location() {
        return end_location;
    }

    public void setEnd_location(String loc) {
        end_location = loc;
    }

    public String getIntermediate_loc() {
        return intermediate_loc;
    }

    public void setIntermediate_loc(String loc) {
        intermediate_loc = loc;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String r) {
        ratings = r;
    }

    public int getMade_by_user() {
        return made_by_user;
    }

    public void setMade_by_user(int user_id) {
        made_by_user = user_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String t) {
        time = t;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String n) {
        notes = n;
    }
}