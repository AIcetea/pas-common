package com.tarotdt.pas.common.model;

public class BaseContentModel {
	// 选择算法
	private String model;
	// 行业
	private String industry;
	// 说明
	private String description;
	//taskId
	private String taskId;
	//标签
	private String tag;

	public BaseContentModel(String model, String industry, String description, String taskId, String tag) {
		this.model = model;
		this.industry = industry;
		this.description = description;
		this.taskId = taskId;
		this.tag = tag;
	}

	public BaseContentModel() {
		// TODO Auto-generated constructor stub
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

}
