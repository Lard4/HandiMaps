package com.example.handimaps;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.example.handimaps.DataService;
import com.example.handimaps.Route;
import com.example.handimaps.User;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DynamoDBService implements DataService {
    public DynamoDBService() {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
    }

    @Override
    public Route SelectRoute(int routeId) {
        throw new NotImplementedException();
    }

    @Override
    public void InsertRoute(Route route) {
        throw new NotImplementedException();
    }

    @Override
    public User SelectUser(int userId) {
        throw new NotImplementedException();
    }

    @Override
    public void InsertUser(User user) {
        throw new NotImplementedException();
    }
}
