package com.tarotdt.pas.common.heartbeat;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Cmder implements Serializable {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String nodeID;
    private String error;
    private Map<String, Object> info = new HashMap<String, Object>();
 
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
 
    public Map<String, Object> getInfo() {
        return info;
    }
 
    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }
}