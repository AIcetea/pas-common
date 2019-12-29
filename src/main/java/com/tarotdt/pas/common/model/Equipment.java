package com.tarotdt.pas.common.model;

import java.util.Date;

/**
 * 设备注册
 * 
 * @author 
 *
 */
public class Equipment {
	private String id;
	private String equipmentCode;
	private String equipmentType;
	private String orgTaxCode;
	private String organizationName;
	private String orgAddress;
	private String orgIphoneNumber;
	private String connectionUserName;
	private String iphone;  
	private Date creatDate;
	private String xPoint;
	private String yPoint;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEquipmentCode() {
		return equipmentCode;
	}
	public void setEquipmentCode(String equipmentCode) {
		this.equipmentCode = equipmentCode;
	}
	public String getEquipmentType() {
		return equipmentType;
	}
	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}
	public String getOrgTaxCode() {
		return orgTaxCode;
	}
	public void setOrgTaxCode(String orgTaxCode) {
		this.orgTaxCode = orgTaxCode;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrgAddress() {
		return orgAddress;
	}
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}
	public String getOrgIphoneNumber() {
		return orgIphoneNumber;
	}
	public void setOrgIphoneNumber(String orgIphoneNumber) {
		this.orgIphoneNumber = orgIphoneNumber;
	}
	public String getConnectionUserName() {
		return connectionUserName;
	}
	public void setConnectionUserName(String connectionUserName) {
		this.connectionUserName = connectionUserName;
	}
	public String getIphone() {
		return iphone;
	}
	public void setIphone(String iphone) {
		this.iphone = iphone;
	}
	public Date getCreatDate() {
		return creatDate;
	}
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	public String getxPoint() {
		return xPoint;
	}
	public void setxPoint(String xPoint) {
		this.xPoint = xPoint;
	}
	public String getyPoint() {
		return yPoint;
	}
	public void setyPoint(String yPoint) {
		this.yPoint = yPoint;
	}
	
}
