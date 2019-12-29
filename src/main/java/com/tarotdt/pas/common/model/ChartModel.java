package com.tarotdt.pas.common.model;

/**
 * 图形类
 * 
 * @author lir
 *
 */
public class ChartModel {
	// 对应文件唯一值
	private String fileId;
	// 图形唯一值
	private String chartId;
	// 模型内容json文件
	private String contentText;
	// 模型名称
	private String chartsName;

	public ChartModel(String fileId, String chartId, String contentText, String chartsName) {
		super();
		this.fileId = fileId;
		this.chartId = chartId;
		this.contentText = contentText;
		this.chartsName = chartsName;
	}

	public ChartModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getChartId() {
		return chartId;
	}

	public void setChartId(String chartId) {
		this.chartId = chartId;
	}

	public String getContentText() {
		return contentText;
	}

	public void setContentText(String contentText) {
		this.contentText = contentText;
	}

	public String getChartsName() {
		return chartsName;
	}

	public void setChartsName(String chartsName) {
		this.chartsName = chartsName;
	}

}
