package com.tarotdt.pas.common.service.aliyun;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.DeleteObjectsRequest;
import com.aliyun.oss.model.DeleteObjectsResult;
import com.tarotdt.pas.common.model.AliFileSystemParamModel;

public class AliyunDeleteService {

    private static Logger logger = Logger.getLogger(AliyunDeleteService.class);

    public static Boolean deleteOSSFile(AliFileSystemParamModel aliFileSystemConfig, String aliFilePath) {

        OSS client = new OSSClientBuilder().build(aliFileSystemConfig.getEndpoint(),
                aliFileSystemConfig.getAccessKeyId(), aliFileSystemConfig.getAccessKeySecret());

        try {
            List<String> keys = new ArrayList<String>();
            keys.add(aliFileSystemConfig.getKeyRoot() + aliFilePath);
            DeleteObjectsResult deleteObjectsResult = client
                    .deleteObjects(new DeleteObjectsRequest(aliFileSystemConfig.getBucketName()).withKeys(keys));
            List<String> deletedObjects = deleteObjectsResult.getDeletedObjects();
            if (null != deletedObjects && !deletedObjects.isEmpty()) {
                return true;
            }
            return false;
        } catch (OSSException oe) {
            logger.error("Caught an OSSException, which means your request made it to OSS, "
                    + "but was rejected with an error response for some reason.");
            logger.error("Error Message: " + oe.getErrorCode());
            logger.error("Error Code:       " + oe.getErrorCode());
            logger.error("Request ID:      " + oe.getRequestId());
            logger.error("Host ID:           " + oe.getHostId());
            return false;
        } catch (ClientException ce) {
            logger.error("Caught an ClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with OSS, "
                    + "such as not being able to access the network.");
            logger.error("Error Message: " + ce.getMessage());
            return false;
        } finally {
            client.shutdown();
        }
    }
}
