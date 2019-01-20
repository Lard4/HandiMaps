package com.example.handimaps;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.Table;

public class DynamoDBService implements DataService {
    private Table userTable;
    private Table routeTable;

    public DynamoDBService() {
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
        DynamoDB dynamoDB = new DynamoDB(client);
        userTable = dynamoDB.getTable("User");
        routeTable = dynamoDB.getTable("Route");
    }

    @Override
    public Route SelectRoute(int routeId) {
        Item item = routeTable.getItem("route_id", routeId);
        Route rtn = new Route();
        rtn.setEnd_location(item.get("end_location").toString());
        rtn.setIntermediate_loc(item.get("intermediate_loc").toString());
        rtn.setStart_location(item.get("start_location").toString());
        //rtn.setMade_by_user(item.get("made_by_user").());
        return rtn;
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
