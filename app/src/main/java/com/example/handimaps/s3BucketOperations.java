package com.example.handimaps;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ListObjectsV2Result;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import org.json.JSONObject;

import java.util.List;

public class s3BucketOperations {

    private static String bucket_name = "camp-poly-hacks-2019-green-tea";

    // Given a JSON object uploads object to s3Bucket via aws s3 SDK
    public void uploadObject(JSONObject jsonObject, String route_id){
        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
        try {
            s3.putObject(bucket_name,route_id, jsonObject.toString());
        } catch (AmazonServiceException e) {
            System.err.println(e.getErrorMessage());
            System.exit(1);
        }

    }

    // Given a object_key as a String, delete the key within the s3 bucket
    public void deleteObject(String object_key){
        //TODO: delete an object
    }

    // Given nothing, list all objects in the s3 bucket
    public static void listObject(){
        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
        ListObjectsV2Result result = s3.listObjectsV2(bucket_name);
        List<S3ObjectSummary> objects = result.getObjectSummaries();
        for (S3ObjectSummary os: objects) {
            System.out.println("* " + os.getKey());
        }
    }

}
