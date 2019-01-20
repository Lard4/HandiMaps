package com.example.handimaps;

public class MockDBService implements DataService {
    @Override
    public Route SelectRoute(int routeId) {
        Route rtn = new Route();
        rtn.setStart_location("35.2809 -120.6628");
        rtn.setEnd_location("35.2754 -120.6644");
        rtn.setIntermediate_loc("");
        rtn.setMade_by_user(1);
        rtn.setNotes("Easy trip; slightly busy");
        rtn.setRatings("{ slope : 0, difficulty : 15, hazzard : false };");
        rtn.setRoute_id(1);
        rtn.setTime("10:24");
        return rtn;
    }

    @Override
    public void InsertRoute(Route route) {
        return;
    }

    @Override
    public User SelectUser(int userId) {
        User user = new User();
        user.setUser_id(1);
        user.setUser_name("test");
        user.setPoints(10);
        return user;
    }

    @Override
    public void InsertUser(User user) {
        return;
    }
}
