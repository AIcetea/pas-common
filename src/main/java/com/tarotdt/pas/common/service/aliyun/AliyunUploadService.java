package com.tarotdt.pas.common.service.aliyun;

import java.io.InputStream;

import org.apache.log4j.Logger;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.CompleteMultipartUploadResult;
import com.aliyun.oss.model.UploadFileRequest;
import com.aliyun.oss.model.UploadFileResult;
import com.tarotdt.pas.common.model.AliFileSystemParamModel;
public class AliyunUploadService {

    private static Logger logger = Logger.getLogger(AliyunUploadService.class);

    /**
     * 上传文件到阿里OOS（阿里OOS的upload目录下的对应project和dataset目录）
     * 
     * @param aliFileSystemConfig
     *            阿里OOS的基础配置
     * @param aliFilePath
     *            阿里OOS上文件的位置
     *            （根目录在aliFileSystemConfig中存放，此处的目录是从用户id开始， 即{userId}/{projectId}/{datasetId}/{fileName}）
     * @param uploadLocalFilePath
     *            本地需要上传的文件路径，即本地SaaS版的路径${pasHome}/upload/{projectId}/{datasetId}/initial.csv
     * @return
     */
    public static Boolean uploadFileToOOS(AliFileSystemParamModel aliFileSystemConfig, String aliFilePath,
            String uploadLocalFilePath) {
        OSS ossClient = new OSSClientBuilder().build(aliFileSystemConfig.getEndpoint(),
                aliFileSystemConfig.getAccessKeyId(), aliFileSystemConfig.getAccessKeySecret());
        try {
            // 这里aliFileSystemConfig.getKeyRoot() + aliFilePath是文件在阿里OOS上的完整路径
            UploadFileRequest uploadFileRequest = new UploadFileRequest(aliFileSystemConfig.getBucketName(),
                    aliFileSystemConfig.getKeyRoot() + aliFilePath);
            // The local file to upload---it must exist.
            uploadFileRequest.setUploadFile(uploadLocalFilePath);
            // Sets the concurrent upload task number to 5.
            uploadFileRequest.setTaskNum(5);
            // Sets the part size to 1MB.
            uploadFileRequest.setPartSize(1024 * 1024 * 1);
            // Enables the checkpoint file. By default it's off.
            uploadFileRequest.setEnableCheckpoint(true);

            UploadFileResult uploadResult = ossClient.uploadFile(uploadFileRequest);

            CompleteMultipartUploadResult multipartUploadResult = uploadResult.getMultipartUploadResult();
            logger.info(multipartUploadResult.getETag());
            return true;
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
        } catch (Throwable e) {
            logger.error("upload aliFileSystem failed");
            e.printStackTrace();
            return false;
        } finally {
            ossClient.shutdown();
        }
    }

    public static Boolean uploadStreamToOOS(AliFileSystemParamModel aliFileSystemConfig, String aliFilePath,
            InputStream inputStream) {
        OSS ossClient = new OSSClientBuilder().build(aliFileSystemConfig.getEndpoint(),
                aliFileSystemConfig.getAccessKeyId(), aliFileSystemConfig.getAccessKeySecret());
        try {
            /**
             * Note that there are two ways of uploading an object to your
             * bucket, the one by specifying an input stream as content source,
             * the other by specifying a file.
             */

            /*
             * Upload an object to your bucket from an input stream
             */
            ossClient.putObject(aliFileSystemConfig.getBucketName(), aliFileSystemConfig.getKeyRoot() + aliFilePath,
                    inputStream);
            return true;
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
        } catch (Throwable e) {
            logger.error("upload aliFileSystem failed");
            e.printStackTrace();
            return false;
        } finally {
            ossClient.shutdown();
        }
    }
}
