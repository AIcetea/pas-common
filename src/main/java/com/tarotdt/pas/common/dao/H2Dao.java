package com.tarotdt.pas.common.dao;

import java.util.List;
import java.util.Map;

public interface H2Dao {
	/**
	 * 查询接口
	 * 
	 * @param sql
	 *            ddbs为id h2为查询sql
	 * @return 返回集合
	 */
	public List<Map<String, Object>> select(String sql);

	/**
	 * 存储接口
	 * 
	 * @param id
	 *            ddbs使用
	 * @param sql
	 *            ddbs为存储数据，h2为存储sql
	 * @return
	 */
	public void save(String id, String sql);

	/**
	 * 删除接口
	 * 
	 * @param sql
	 *            ddbs为删除id,h2为删除sql
	 */
	public void detele(String sql);

	/**
	 * 修改接口
	 * 
	 * @param sql
	 *            ddbs新增修改同接口,h2为删除sql
	 */
	public void update(String sql);

	/**
	 * 关闭连接 ddbs使用,h2不需要使用
	 */
	public void close();
}
