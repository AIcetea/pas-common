package com.tarotdt.pas.common.service.impl;

import java.util.List;
import java.util.Map;

import com.tarotdt.pas.common.dao.impl.H2DaoImpl;
import com.tarotdt.pas.common.service.SourceService;

public class H2Service implements SourceService {

	private H2DaoImpl h2DaoImpl;

	public H2Service() throws Exception {
		this.h2DaoImpl = new H2DaoImpl();
	}

	/**
	 * 查询接口
	 * 
	 * @param sql
	 *            ddbs为id h2为查询sql
	 * @return 返回集合
	 */
	public List<Map<String, Object>> select(String sql) {
		return h2DaoImpl.select(sql);
	}

	/**
	 * 存储接口
	 * 
	 * @param id
	 *            ddbs使用
	 * @param sql
	 *            ddbs为存储数据，h2为存储sql
	 * @return
	 */
	public void save(String id, String sql) {
		h2DaoImpl.save(id, sql);
	}

	/**
	 * 删除接口
	 * 
	 * @param sql
	 *            ddbs为删除id,h2为删除sql
	 */
	public void detele(String sql) {
		h2DaoImpl.detele(sql);
	}

	/**
	 * 修改接口
	 * 
	 * @param sql
	 *            ddbs新增修改同接口,h2为删除sql
	 */
	public void update(String sql) {
		h2DaoImpl.update(sql);
	}

	/**
	 * 关闭连接 ddbs使用,h2不需要使用
	 */
	public void close() {

	}

}
