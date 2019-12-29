package com.tarotdt.pas.common.model;

public class ServiceSaveForm {
	private String userId;
	private String projectId;
	private String datasetId;
	private String type;
	private boolean useJava;
	private String modelId;

	public ServiceSaveForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ServiceSaveForm(String userId, String projectId, String datasetId, String type, boolean useJava,
			String modelId) {
		super();
		this.userId = userId;
		this.projectId = projectId;
		this.datasetId = datasetId;
		this.type = type;
		this.useJava = useJava;
		this.modelId = modelId;
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

	public String getDatasetId() {
		return datasetId;
	}

	public void setDatasetId(String datasetId) {
		this.datasetId = datasetId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isUseJava() {
		return useJava;
	}

	public void setUseJava(boolean useJava) {
		this.useJava = useJava;
	}

	public String getModelId() {
		return modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
	}
	
}
