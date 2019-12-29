package com.tarotdt.pas.common.model;

import java.util.Date;

public class Collection {
	private Long id;
	private String fullModelId;
	private String algorithmsType;
	private String name;
	private Long userId; //收藏人
	private Date collectionDate;
	private String enable;
	private String projectId;
	private String datasetId;
	private String taskId;

	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullModelId() {
		return fullModelId;
	}

	public void setFullModelId(String fullModelId) {
		this.fullModelId = fullModelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public Date getCollectionDate() {
		return collectionDate;
	}

	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
	}

	public String getEnable() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public String getAlgorithmsType() {
		return algorithmsType;
	}

	public void setAlgorithmsType(String algorithmsType) {
		this.algorithmsType = algorithmsType;
	}

}
