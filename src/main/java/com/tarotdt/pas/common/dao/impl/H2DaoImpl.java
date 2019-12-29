package com.tarotdt.pas.common.dao.impl;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tarotdt.pas.common.dao.H2Dao;

public class H2DaoImpl implements H2Dao {

	private SqlSessionFactory sqlSessionFactory;

	public H2DaoImpl() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		this.sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	/**
	 * 查询接口
	 * 
	 * @param sql
	 *          ddbs为id h2为查询sql
	 * @return 返回集合
	 */
	public List<Map<String, Object>> select(String sql) {
		SqlSession session = sqlSessionFactory.openSession();
		List<Map<String, Object>> list = session.selectList("select", sql);
		session.close();
		return list;
	}

	/**
	 * 存储接口
	 * 
	 * @param id
	 *          ddbs使用
	 * @param sql
	 *          ddbs为存储数据,h2为存储sql
	 * @return
	 */
	public void save(String id, String sql) {
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("insert", sql);
		session.commit();
		session.close();
	}

	/**
	 * 删除接口
	 * 
	 * @param sql
	 *          ddbs为删除id,h2为删除sql
	 */
	public void detele(String sql) {
		SqlSession session = sqlSessionFactory.openSession();
		session.delete("delete", sql);
		session.close();
	}

	/**
	 * 修改接口
	 * 
	 * @param sql
	 *          ddbs新增修改同接口,h2为删除sql
	 */
	public void update(String sql) {
		SqlSession session = sqlSessionFactory.openSession();
		session.update("update", sql);
		session.close();
	}

	/**
	 * 关闭连接 ddbs使用,h2不需要使用
	 */
	public void close() {

	}

}
