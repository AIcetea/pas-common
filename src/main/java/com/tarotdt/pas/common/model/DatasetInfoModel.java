package com.tarotdt.pas.common.model;

import java.util.Date;

public class DatasetInfoModel {
    private String id;
    // datasetId
    private String datasetId;
    // 原始文件名
    private String fileName;
    // 文件类型
    private String fileType;
    // 文件大小
    private String fileSize;
    // 文件保存路径
    private String datasetPath;
    // 算法类型
    private String model;
    // 行业
    private String industry;
    // 说明
    private String description;
    // 执行计划id
    private String taskId;
    // 项目id
    private Long projectId;
    // 标签
    private String tag;
    // 创建人
    private Long creator;
    // 创建时间
    private Date createDate;
    // 删除状态
    private String delState;
    // 创建人
    private String creatorName;
    
    private String realName;
    // HDFS主机IP
    private String hdfsHost;
    // HDFS端口
    private String hdfsPort;
    // 数据源类型
    private String datasetType;

    public String getDatasetType() {
        return datasetType;
    }

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }
    public DatasetInfoModel(String datasetId, Long projectId) {
        super();
        this.datasetId = datasetId;
        this.projectId = projectId;
    }

    public DatasetInfoModel(Long projectId, String datasetId, String model, String industry, String description,
            String taskId, String tag) {
        super();
        this.projectId = projectId;
        this.datasetId = datasetId;
        this.model = model;
        this.industry = industry;
        this.description = description;
        this.taskId = taskId;
        this.tag = tag;
    }

    public DatasetInfoModel(String datasetId, String fileName, String fileType, String fileSize, String datasetPath,
            Long projectId) {
        super();
        this.datasetId = datasetId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.datasetPath = datasetPath;
        this.projectId = projectId;
        //this.creator = creator;
    }
    public DatasetInfoModel(String datasetId, String fileName, String fileType, String fileSize, String datasetPath,
            Long projectId,Long creator) {
        super();
        this.datasetId = datasetId;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.datasetPath = datasetPath;
        this.projectId = projectId;
        this.creator = creator;
    }


    public DatasetInfoModel(String datasetId, String hdfsHost, String hdfsPort, String fileName, String fileType,
            String fileSize, String datasetPath, Long projectId, Long creator) {
        super();
        this.datasetId = datasetId;
        this.hdfsHost = hdfsHost;
        this.hdfsPort = hdfsPort;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.datasetPath = datasetPath;
        this.projectId = projectId;
        this.creator = creator;
    }

    public DatasetInfoModel() {
        super();
        // TODO Auto-generated constructor stub
    }

    /*
     * public DatasetInfoModel(String datasetId, String fileName, String
     * fileType, String fileSize, String datasetPath, String model, String
     * industry, String description, String taskId, Long projectId, String tag,
     * Long creator, Date createDate, String delState) { super(); this.datasetId
     * = datasetId; this.fileName = fileName; this.fileType = fileType;
     * this.fileSize = fileSize; this.datasetPath = datasetPath; this.model =
     * model; this.industry = industry; this.description = description;
     * this.taskId = taskId; this.projectId = projectId; this.tag = tag;
     * this.creator = creator; this.createDate = createDate; this.delState =
     * delState; }
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getDatasetPath() {
        return datasetPath;
    }

    public void setDatasetPath(String datasetPath) {
        this.datasetPath = datasetPath;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Long getCreator() {
        return creator;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getDelState() {
        return delState;
    }

    public void setDelState(String delState) {
        this.delState = delState;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getHdfsHost() {
		return hdfsHost;
	}

	public void setHdfsHost(String hdfsHost) {
		this.hdfsHost = hdfsHost;
	}

	public String getHdfsPort() {
		return hdfsPort;
	}

	public void setHdfsPort(String hdfsPort) {
		this.hdfsPort = hdfsPort;
	}
    

}
