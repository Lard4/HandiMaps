package com.example.handimaps;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.example.handimaps.DataService;
import com.example.handimaps.Route;
import com.example.handimaps.User;

public class DynamoDBService implements DataService {
    public DynamoDBService() {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
    }

    @Override
    public Route SelectRoute(int routeId) {

    }

    @Override
    public void InsertRoute(Route route) {

    }

    @Override
    public User SelectUser(int userId) {
        return null;
    }

    @Override
    public void InsertUser(User user) {

    }
}
