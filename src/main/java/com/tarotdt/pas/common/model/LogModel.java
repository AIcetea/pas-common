package com.tarotdt.pas.common.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件日志类
 * 
 * @author lir
 *
 */
public class LogModel {
	// 文件对应唯一值
	private String id;
	// 文件名称
	private String fileName;
	// 文件类型
	private String fileType;
	// 文件处理过程状态
	private String fileState;
	//文件状态说明
	private String fileMsg;
	// 运行状态
	private String runState;
	//是否进行过样本数据处理
	private boolean isSample;
	//是否存在样本数据json
	private boolean isSampleJson;
	//是否存储分析数据json
	private boolean isAnalysisJson;
 	// 记录执行过程
	private List<RecordModel> recoreList = new ArrayList<RecordModel>();

	public LogModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public LogModel(String id, String fileName, String fileType, String fileState, String fileMsg, String runState,
			boolean isSample, boolean isSampleJson, boolean isAnalysisJson, List<RecordModel> recoreList) {
		super();
		this.id = id;
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileState = fileState;
		this.fileMsg = fileMsg;
		this.runState = runState;
		this.isSample = isSample;
		this.isSampleJson = isSampleJson;
		this.isAnalysisJson = isAnalysisJson;
		this.recoreList = recoreList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getFileState() {
		return fileState;
	}

	public void setFileState(String fileState) {
		this.fileState = fileState;
	}

	public List<RecordModel> getRecoreList() {
		return recoreList;
	}

	public void setRecoreList(List<RecordModel> recoreList) {
		this.recoreList = recoreList;
	}

	public String getRunState() {
		return runState;
	}

	public void setRunState(String runState) {
		this.runState = runState;
	}

	public boolean isSample() {
		return isSample;
	}

	public void setSample(boolean isSample) {
		this.isSample = isSample;
	}

	public boolean isSampleJson() {
		return isSampleJson;
	}

	public void setSampleJson(boolean isSampleJson) {
		this.isSampleJson = isSampleJson;
	}

	public String getFileMsg() {
		return fileMsg;
	}

	public void setFileMsg(String fileMsg) {
		this.fileMsg = fileMsg;
	}

	public boolean isAnalysisJson() {
		return isAnalysisJson;
	}

	public void setAnalysisJson(boolean isAnalysisJson) {
		this.isAnalysisJson = isAnalysisJson;
	}

}
