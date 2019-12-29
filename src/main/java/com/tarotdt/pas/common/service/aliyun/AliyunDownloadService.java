package com.tarotdt.pas.common.service.aliyun;

import java.util.List;

import org.apache.log4j.Logger;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.DownloadFileRequest;
import com.aliyun.oss.model.DownloadFileResult;
import com.aliyun.oss.model.ListObjectsRequest;
import com.aliyun.oss.model.OSSObjectSummary;
import com.aliyun.oss.model.ObjectListing;
import com.aliyun.oss.model.ObjectMetadata;
import com.tarotdt.pas.common.model.AliFileSystemParamModel;

public class AliyunDownloadService {

    private static Logger logger = Logger.getLogger(AliyunDownloadService.class);
    /**
     * 从阿里的OOS下载数据集文件到本地指定目录（阿里目录下upload下的对应project和dataset目录）
     * 
     * @param aliFileSystemConfig
     *            阿里OOS的基础配置
     * @param aliFilePath
     *            阿里OOS上文件的位置
     *            （根目录在aliFileSystemConfig中存放，此处的目录是从用户id开始， 即{userId}/{projectId}/{datasetId}/{fileName}）
     * @param downloadLocalFilePath
     *            下载到本地的文件路径，即${pasHome}/upload/{projectId}/{datasetId}/initial.csv
     * @return
     */
    public static Boolean downloadFileFromOOS(AliFileSystemParamModel aliFileSystemConfig, String aliFilePath,
            String downloadLocalFilePath) {

        OSS ossClient = new OSSClientBuilder().build(aliFileSystemConfig.getEndpoint(),
                aliFileSystemConfig.getAccessKeyId(), aliFileSystemConfig.getAccessKeySecret());

        try {
            // 在阿里OOS上存放文件的路径，此路径不包含文件名，只是文件的前缀路径，即 upload/{userId}/{projectId}/{datasetId}/
            String keyPrefix = aliFileSystemConfig.getKeyRoot() + aliFilePath;
            // 获取OOS上指定路径上的所有文件
            ObjectListing objectListing = ossClient
                    .listObjects(new ListObjectsRequest(aliFileSystemConfig.getBucketName()).withPrefix(keyPrefix));
            List<OSSObjectSummary> sums = objectListing.getObjectSummaries();
            String aliFileAbsolutePath = "";
            for (OSSObjectSummary s : sums) {
                // 限定大小，这里过滤掉文件夹
                if (s.getSize() > 0) {
                    // 获取文件的绝对路径，即upload/{userId}/{projectId}/{datasetId}/{fileName}.csv
                    aliFileAbsolutePath = s.getKey();
                    break;
                }
            }
            if (aliFileAbsolutePath.equals("")) {
                throw new OSSException("找不到文件？说明有可能没上传成功，赶紧看看阿里云上有没有文件");
            }
            // 这里aliFileSystemConfig.getKeyRoot() + aliFilePath是文件在阿里OOS上的完整路径
            DownloadFileRequest downloadFileRequest = new DownloadFileRequest(aliFileSystemConfig.getBucketName(),
                    aliFileAbsolutePath);
            // Sets the local file to download to
            downloadFileRequest.setDownloadFile(downloadLocalFilePath);
            // Sets the concurrent task thread count 5. By default it's 1.
            downloadFileRequest.setTaskNum(5);
            // Sets the part size, by default it's 100K.
            downloadFileRequest.setPartSize(1024 * 1024 * 1);
            // Enable checkpoint. By default it's false.
            downloadFileRequest.setEnableCheckpoint(true);

            DownloadFileResult downloadResult = ossClient.downloadFile(downloadFileRequest);

            ObjectMetadata objectMetadata = downloadResult.getObjectMetadata();
            logger.info(objectMetadata.getETag());
            logger.info(objectMetadata.getLastModified());
            logger.info(objectMetadata.getUserMetadata().get("meta"));
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
            e.printStackTrace();
            return false;
        } finally {
            ossClient.shutdown();
        }
    }
}
