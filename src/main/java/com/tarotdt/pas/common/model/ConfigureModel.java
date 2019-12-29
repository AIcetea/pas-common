package com.tarotdt.pas.common.model;

import java.util.List;

public class ConfigureModel {
	private String bucket;
	private String bucketPassWord;
	private String dataSourceType;
	private String path;
	private List<String> urlList;

	public ConfigureModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConfigureModel(String bucket, String bucketPassWord, String dataSourceType, String path,
			List<String> urlList) {
		super();
		this.bucket = bucket;
		this.bucketPassWord = bucketPassWord;
		this.dataSourceType = dataSourceType;
		this.path = path;
		this.urlList = urlList;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getBucketPassWord() {
		return bucketPassWord;
	}

	public void setBucketPassWord(String bucketPassWord) {
		this.bucketPassWord = bucketPassWord;
	}

	public String getDataSourceType() {
		return dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public List<String> getUrlList() {
		return urlList;
	}

	public void setUrlList(List<String> urlList) {
		this.urlList = urlList;
	}

}
