package com.tarotdt.pas.common.dao;

import java.util.List;

import com.tarotdt.ddbs.client.java.Bucket;

public interface DDBSDao {
	/**
	 * 增加或修改接口
	 * @param json 需要保存的json
	 * @param id 数据库key值
	 */
	public void insertOrUpdata(String json,String id);
	
	/**
	 * 查询接口
	 * @param id 数据库key值
	 * @return 返回结合
	 */
	public String getJsonById(String id);
	
	/**
	 * 删除接口 
	 * @param id 数据库key值
	 */
	public void delete(String id);
	
	/**
	 * 查询视图
	 * @param design
	 * @param view
	 * @return 返回json.toString(); 
	 */
	public String view(String design,String view);
	
	/**
	 * 连接
	 * @param urlList url集合
	 * @param bucketName bucket名称
	 * @param bucketPassword bucket密码 没有传空值
	 * @return Bucket
	 */
	public Bucket connect(List<String> urlList,String bucketName,String bucketPassword);
	
	/**
	 * 使用N1ql查询
	 * @param N1ql
	 * @return
	 */
	public String N1qlQuery(String N1ql);
	
	/**
	 * 关闭连接
	 */
	public void close();
}
