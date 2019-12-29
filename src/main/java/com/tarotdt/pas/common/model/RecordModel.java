package com.tarotdt.pas.common.model;

import java.util.Date;

/**
 * 记录过程类
 * 
 * @author lir
 *
 */
public class RecordModel {
	// 记录过程名称
	private String recordName;
	// 记录状态
	private Integer code;
	// 记录问题描述
	private String msg;
	// 记录时间
	private Date date;

	public RecordModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecordModel(String recordName, Integer code, String msg, Date date) {
		super();
		this.recordName = recordName;
		this.code = code;
		this.msg = msg;
		this.date = date;
	}

	public String getRecordName() {
		return recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
