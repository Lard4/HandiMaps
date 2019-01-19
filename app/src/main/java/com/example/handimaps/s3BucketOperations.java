package com.example.handimaps;

import org.json.JSONObject;

public class s3BucketOperations {
    // Given a JSON object uploads object to s3Bucket via aws s3 SDK
    public void uploadObject(JSONObject jsonObject){

    }

    // Given a object_key as a String, delete the key within the s3 bucket
    public void deleteObject(String object_key){

    }

    // Given nothing, list all objects in the s3 bucket
    public static void listObject(){
//        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
//        ListObjectsV2Result result = s3.listObjectsV2(bucket_name);
//        List<S3ObjectSummary> objects = result.getObjectSummaries();
//        for (S3ObjectSummary os: objects) {
//            System.out.println("* " + os.getKey());
//        }
    }

}
