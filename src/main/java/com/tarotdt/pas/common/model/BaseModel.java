package com.tarotdt.pas.common.model;

public class BaseModel {
	private String sourceFileName;
	private String sourceFileType;
	private String sourceFilePath;
	private String sampleFile;
	private String sampleFilePath;
	private Integer fileSize;
	private String sampleMethod;
	private Integer sampleSize;

	public BaseModel(String sourceFileName, String sourceFileType, String sourceFilePath, String sampleFile,
			String sampleFilePath, Integer fileSize, String sampleMethod, Integer sampleSize) {
		super();
		this.sourceFileName = sourceFileName;
		this.sourceFileType = sourceFileType;
		this.sourceFilePath = sourceFilePath;
		this.sampleFile = sampleFile;
		this.sampleFilePath = sampleFilePath;
		this.fileSize = fileSize;
		this.sampleMethod = sampleMethod;
		this.sampleSize = sampleSize;
	}

	public BaseModel(String sourceFileType, String sourceFilePath, String sourceFileName) {
		super();
		this.sourceFileType = sourceFileType;
		this.sourceFilePath = sourceFilePath;
		this.sourceFileName = sourceFileName;

	}

	public BaseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSourceFileName() {
		return sourceFileName;
	}

	public void setSourceFileName(String sourceFileName) {
		this.sourceFileName = sourceFileName;
	}

	public String getSourceFileType() {
		return sourceFileType;
	}

	public void setSourceFileType(String sourceFileType) {
		this.sourceFileType = sourceFileType;
	}

	public String getSourceFilePath() {
		return sourceFilePath;
	}

	public void setSourceFilePath(String sourceFilePath) {
		this.sourceFilePath = sourceFilePath;
	}

	public String getSampleFile() {
		return sampleFile;
	}

	public void setSampleFile(String sampleFile) {
		this.sampleFile = sampleFile;
	}

	public String getSampleFilePath() {
		return sampleFilePath;
	}

	public void setSampleFilePath(String sampleFilePath) {
		this.sampleFilePath = sampleFilePath;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

	public String getSampleMethod() {
		return sampleMethod;
	}

	public void setSampleMethod(String sampleMethod) {
		this.sampleMethod = sampleMethod;
	}

	public Integer getSampleSize() {
		return sampleSize;
	}

	public void setSampleSize(Integer sampleSize) {
		this.sampleSize = sampleSize;
	}
}
