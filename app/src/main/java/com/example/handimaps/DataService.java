package com.example.handimaps;

public interface DataService {
    Route SelectRoute(int routeId);
    void InsertRoute(Route route);
    User SelectUser(int userId);
    void InsertUser(User user);
}