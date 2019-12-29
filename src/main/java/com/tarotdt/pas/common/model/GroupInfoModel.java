package com.tarotdt.pas.common.model;

import java.util.Date;
import java.util.List;

public class GroupInfoModel {
	//分组ID
	private Long groupId;
	//分组名称
	private String groupName;
	//分组备注说明
	private String describeText;
	//创建用户ID
	private Long creator;
	//创建用户
	private String creatorName;
	//创建时间
	private Date createDate;
	//修改用户ID
	private Long operator;
	//修改时间
	private Date updateDate;
	//是否删除
	private String delState;
	//组下所有用户
	private String userNameList;
	//分组下用户id集合
	 private List<Long> userIdList;

	public GroupInfoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupInfoModel(Long groupId, String groupName, String describeText, Long creator, Date createDate,
			Long operator, Date updateDate, String delState) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.describeText = describeText;
		this.creator = creator;
		this.createDate = createDate;
		this.operator = operator;
		this.updateDate = updateDate;
		this.delState = delState;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getDescribeText() {
		return describeText;
	}

	public void setDescribeText(String describeText) {
		this.describeText = describeText;
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

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getUserNameList() {
		return userNameList;
	}

	public void setUserNameList(String userNameList) {
		this.userNameList = userNameList;
	}

	public List<Long> getUserIdList() {
		return userIdList;
	}

	public void setUserIdList(List<Long> userIdList) {
		this.userIdList = userIdList;
	}
}
