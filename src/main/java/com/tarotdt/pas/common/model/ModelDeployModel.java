package com.tarotdt.pas.common.model;

import java.util.Date;

/**
 *
 */
public class ModelDeployModel {
	private String id;
	private String fullModelId;
	private String algorithmsType;
	private String projectId;
	private String datasetId;
	private String taskId;
	private String modelName;
	private String creator;
	private Date createDate;
	private String creatorName;
	private String realName;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullModelId() {
		return fullModelId;
	}
	public void setFullModelId(String fullModelId) {
		this.fullModelId = fullModelId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getCreatorName() {
		return creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getDatasetId() {
		return datasetId;
	}
	public void setDatasetId(String datasetId) {
		this.datasetId = datasetId;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getAlgorithmsType() {
		return algorithmsType;
	}
	public void setAlgorithmsType(String algorithmsType) {
		this.algorithmsType = algorithmsType;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}	
	
}
