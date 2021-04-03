package com.sunstudio.basic.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 基础DAO
 * <p>提供默认方法：select、selectByPrimaryKey、update、insert、delete、deleteByPrimaryKey...</p>
 * @author Lsatin
 * @date 2021年3月29日
 */
public interface BasicDao<T, PK extends Serializable> {
	
	Integer count(T param);

	/**
	 * 查询
	 * @param param 实体
	 * @return {@link T} 列表实体
	 */
	List<T> select(T param);
	
	/**
	 * 查询根据主键
	 * @param id 主键
	 * @return {@link T} 实体
	 */
	T selectByPrimaryKey(PK id);
	
	/**
	 * 更新
	 * @param param 实体
	 */
	void update(T param);
	
	/**
	 * 插入
	 * @param param 实体
	 * @return {@link Long} 主键
	 */
	Long insert(T param);
	
	/**
	 * 删除
	 * @param param 实体
	 */
	void delete(T param);
	
	/**
	 * 删除根据主键
	 * @param id 主键
	 */
	void deleteByPrimaryKey(PK id);
	
}
