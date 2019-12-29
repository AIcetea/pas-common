package com.tarotdt.pas.common.service.impl;



import com.tarotdt.pas.common.dao.impl.DDBSDaoImpl;

public class DDBSService  {
	
	private DDBSDaoImpl ddbsDaoImpl;
	
	public DDBSService(String url,String bucket,String bucketpassword) throws Exception {
		this.ddbsDaoImpl = DDBSDaoImpl.getInstance(url, bucket, bucketpassword);
	}

	public  String select(String id) {
		return ddbsDaoImpl.getJsonById(id);
	}

	public void save(String id, String json) {
		ddbsDaoImpl.insertOrUpdata(json, id);
	}

	public void detele(String id) {
		ddbsDaoImpl.delete(id);
	}

	public void update(String id,String json) {
		ddbsDaoImpl.insertOrUpdata(json, id);
	}

	public String view(String design, String view){
		return ddbsDaoImpl.view(design, view);
	}
	
	public void close() {
		//ddbsDaoImpl.close();
	}
}
