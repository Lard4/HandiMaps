package com.example.handimaps;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

public class DynamoDBService implements DataService {
    public DynamoDBService() {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
    }

    @Override
    public Route SelectRoute(int routeId) {
        return null;
    }

    @Override
    public void InsertRoute(Route route) {

    }

    @Override
    public User SelectUser(int userId) {

    }

    @Override
    public void InsertUser(User user) {

    }
}
