package com.tarotdt.pas.common.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;

import com.tarotdt.ddbs.client.java.Bucket;
import com.tarotdt.ddbs.client.java.Cluster;
import com.tarotdt.ddbs.client.java.DDBSCluster;
import com.tarotdt.ddbs.client.java.document.JsonDocument;
import com.tarotdt.ddbs.client.java.document.json.JsonObject;
import com.tarotdt.ddbs.client.java.document.json.JsonArray;
import com.tarotdt.ddbs.client.java.view.ViewQuery;
import com.tarotdt.ddbs.client.java.view.ViewResult;
import com.tarotdt.ddbs.client.java.view.ViewRow;
import com.tarotdt.pas.common.dao.DDBSDao;

public class DDBSDaoImpl implements DDBSDao {

	private static DDBSDaoImpl instance;

	public static synchronized DDBSDaoImpl getInstance(String url, String bucket, String bucketpassword)
			throws Exception {
		if (instance == null) {
			instance = new DDBSDaoImpl(url, bucket, bucketpassword);
		}
		try{
			instance.bucket.get("1");
		}catch(Exception e){
			instance = new DDBSDaoImpl(url, bucket, bucketpassword);
		}
		return instance;
	}

	private Bucket bucket;

	public DDBSDaoImpl(String url, String bucket, String bucketpassword) throws Exception {
		// String url = FileUtil.getProperties("ddbs.url");
		// String bucket = FileUtil.getProperties("ddbs.bucket");
		// String bucketpassword =
		// FileUtil.getProperties("ddbs.bucketpassword");
		// System.out.println("url:" + url + " bucket:" + bucket + "
		// bucketpassword" + bucketpassword);
		Cluster cluster = DDBSCluster.create(url);
		this.bucket = cluster.openBucket(bucket, bucketpassword);
	}

	/**
	 * 增加或修改接口
	 * 
	 * @param json
	 *            需要保存的json
	 * @param id
	 *            数据库key值
	 */
	public void insertOrUpdata(String json, String id) {
		JsonObject j = JsonObject.fromJson(json);
		bucket.upsert(JsonDocument.create(id, j));
	}

	/**
	 * 查询接口
	 * 
	 * @param id
	 *            数据库key值
	 * @return 返回json.toString();
	 */
	public String getJsonById(String id) {
		JsonDocument jd = bucket.get(id);
		if (jd != null) {
			return jd.content().toString();
		} else {
			return null;
		}
	}

	public static void main(String args[]) {
		String url = "";
		String bucketString = "";
		String bucketpassword = "";
		try {
			DDBSDaoImpl DDBSDaoImpl = new DDBSDaoImpl(url, bucketString, bucketpassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 删除接口
	 * 
	 * @param id
	 *            数据库key值
	 */
	public void delete(String id) {
		bucket.remove(id);
	}

	/**
	 * 查询视图
	 * 
	 * @param design
	 * @param view
	 * @return 返回json.toString();
	 */
	public String view(String design, String view) {
		List<Object> list = new ArrayList<Object>();
		ViewResult result = bucket.query(ViewQuery.from(design, view));
		for (ViewRow row : result) {
			if(row!=null&&row.document()!=null&&row.document().content()!=null){
				list.add(row.document().content());
			//map.put(row.id(), row.document().content());
			}
		}
		JsonObject jb = JsonObject.from(new HashMap<String ,Object>());
		jb.put("result", JsonArray.from(list));
		return jb.toString();
	}

	
	
	/**
	 * 连接
	 * 
	 * @param urlList
	 *            url集合
	 * @param bucketName
	 *            bucket名称
	 * @param bucketPassword
	 *            bucket密码 没有传空值
	 * @return Bucket
	 */
	public Bucket connect(List<String> urlList, String bucketName, String bucketPassword) {
		Cluster cluster = DDBSCluster.create(urlList);
		Bucket bucket = null;
		if (bucketPassword == null) {
			bucket = cluster.openBucket(bucketName);
		} else {
			bucket = cluster.openBucket(bucketName, bucketPassword);
		}
		return bucket;
	}

	/**
	 * 使用N1ql查询
	 * 
	 * @param N1ql
	 * @return
	 */
	public String N1qlQuery(String N1ql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		bucket.close();
	}

}
