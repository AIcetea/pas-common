package com.tarotdt.pas.common.model;

public class JsonRoleModel {
	private String type;
	private String datasetId;
	private String userId;
	private String projectId;

	public JsonRoleModel(String type, String datasetId, String userId, String projectId) {
		super();
		this.type = type;
		this.datasetId = datasetId;
		this.userId = userId;
		this.projectId = projectId;
	}

	public JsonRoleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDatasetId() {
		return datasetId;
	}

	public void setDatasetId(String datasetId) {
		this.datasetId = datasetId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

}
