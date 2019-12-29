package com.tarotdt.pas.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AliUpdateConfig {
    @Value("${aliyunUpdateFileSystem.endpoint:/}")
    private String endpoint;
    @Value("${aliyunUpdateFileSystem.accessKeyId:/}")
    private String accessKeyId;
    @Value("${aliyunUpdateFileSystem.accessKeySecret:/}")
    private String accessKeySecret;
    @Value("${aliyunUpdateFileSystem.bucketName:/}")
    private String bucketName;
    @Value("${aliyunUpdateFileSystem.keyRoot:/}")
    private String keyRoot;

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getKeyRoot() {
        return keyRoot;
    }

    public void setKeyRoot(String keyRoot) {
        this.keyRoot = keyRoot;
    }
}
