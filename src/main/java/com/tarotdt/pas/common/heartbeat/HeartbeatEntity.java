package com.tarotdt.pas.common.heartbeat;

import java.io.Serializable;

public class HeartbeatEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long time;
	private String nodeID;
	private String error;
	private String nodeId;
	private int maxProcessNum;
	private String nodeEngineType;
	private String freeProcessNum;
	private String allProcessNum;
	private String workingProcessNum;
	private String ip;
	private int port ;
	private String login;

	public String getNodeID() {
		return nodeID;
	}

	public void setNodeID(String nodeID) {
		this.nodeID = nodeID;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeEngineType() {
		return nodeEngineType;
	}

	public void setNodeEngineType(String nodeEngineType) {
		this.nodeEngineType = nodeEngineType;
	}

	public String getFreeProcessNum() {
		return freeProcessNum;
	}

	public void setFreeProcessNum(String freeProcessNum) {
		this.freeProcessNum = freeProcessNum;
	}

	public String getAllProcessNum() {
		return allProcessNum;
	}

	public void setAllProcessNum(String allProcessNum) {
		this.allProcessNum = allProcessNum;
	}

	public String getWorkingProcessNum() {
		return workingProcessNum;
	}

	public void setWorkingProcessNum(String workingProcessNum) {
		this.workingProcessNum = workingProcessNum;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getMaxProcessNum() {
		return maxProcessNum;
	}

	public void setMaxProcessNum(int maxProcessNum) {
		this.maxProcessNum = maxProcessNum;
	}

	
	
}