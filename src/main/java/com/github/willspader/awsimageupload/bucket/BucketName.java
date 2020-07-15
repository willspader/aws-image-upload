package com.github.willspader.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("aws-image-upload");

    private final String bucketName;

    BucketName(final String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }

}
