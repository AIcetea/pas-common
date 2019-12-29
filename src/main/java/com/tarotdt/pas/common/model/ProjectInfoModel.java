package com.tarotdt.pas.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectInfoModel {
	//项目ID
	private Long projectId;
	//项目编号
	private String projectNumber;
	//项目名称
	private String projectName;
	//项目备注说明
	private String describeText;
	//是否共享
	private int isShare;
	//创建用户ID
	private Long creator;
	//创建用户名称
	private String creatorName;
	//创建时间
	private Date createDate;
	//修改用户ID
	private Long operator;
	//修改时间
	private Date updateDate;
	//是否删除
	private String delState;
	//用户id集合
	private List<Long> userIdList;
	//dataset总数
	private int countDateset;
	//权限保存状态
	private String effectType;
	
	

	public ProjectInfoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public ProjectInfoModel(Long projectId, String projectNumber, String projectName, String describeText, int isShare,
			Long creator, Date createDate, Long operator, Date updateDate, String delState) {
		super();
		this.projectId = projectId;
		this.projectNumber = projectNumber;
		this.projectName = projectName;
		this.describeText = describeText;
		this.isShare = isShare;
		this.creator = creator;
		this.createDate = createDate;
		this.operator = operator;
		this.updateDate = updateDate;
		this.delState = delState;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescribeText() {
		return describeText;
	}

	public void setDescribeText(String describeText) {
		this.describeText = describeText;
	}

	public int getIsShare() {
		return isShare;
	}

	public void setIsShare(int isShare) {
		this.isShare = isShare;
	}

	public Long getCreator() {
		return creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getOperator() {
		return operator;
	}

	public void setOperator(Long operator) {
		this.operator = operator;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getDelState() {
		return delState;
	}

	public void setDelState(String delState) {
		this.delState = delState;
	}

	public List<Long> getUserIdList() {
		return userIdList;
	}

	public void setUserIdList(List<Long> userIdList) {
		this.userIdList = userIdList;
	}

	public int getCountDateset() {
		return countDateset;
	}

	public void setCountDateset(int countDateset) {
		this.countDateset = countDateset;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getEffectType() {
		return effectType;
	}

	public void setEffectType(String effectType) {
		this.effectType = effectType;
	}
}
