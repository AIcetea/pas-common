package com.tarotdt.pas.common.model;

public class SmartDummyJobForm {
	private String projectId;
	private String userId;
	private String dataSetId;
	private String model;
	private String industry;
	private String target;
	private String description;
	private String taskId;
	private String tag;

	public SmartDummyJobForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartDummyJobForm(String projectId, String userId, String dataSetId, String model, String industry,
			String target, String description, String taskId, String tag) {
		super();
		this.projectId = projectId;
		this.userId = userId;
		this.dataSetId = dataSetId;
		this.model = model;
		this.industry = industry;
		this.target = target;
		this.description = description;
		this.taskId = taskId;
		this.tag = tag;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDataSetId() {
		return dataSetId;
	}

	public void setDataSetId(String dataSetId) {
		this.dataSetId = dataSetId;
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

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
