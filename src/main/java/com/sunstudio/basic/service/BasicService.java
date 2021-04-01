package com.sunstudio.basic.service;

import java.io.Serializable;
import java.util.List;

/**
 * 基础service
 * <p>提供默认方法：list</p>
 * @author Lsatin
 * @date 2021年3月29日
 */
public interface BasicService<T, PK extends Serializable> {

	/**
	 * 列表
	 * @return {@link List<T>} 列表实体
	 */
	List<T> list();
	
	/**
	 * 按条件查询
	 * @param param 实体
	 * @return {@link List<T>} 列表实体
	 */
	List<T> query(T param);
	
	/**
	 * 按主键查询
	 * @param id 主键
	 * @return {@link T} 实体
	 */
	T get(PK id);
	
	/**
	 * 保存
	 * <p>存在主键为更新，反之新增</p>
	 * @param param 实体
	 * @return {@link T} 保存实体
	 */
	abstract T save(T param);
	
	/**
	 * 批量保存
	 * <p>存在主键为更新，反之新增</p>
	 * @param params 实体集
	 * @return {@link List<T>} 实体集
	 */
	abstract List<T> batchSave(List<T> params);
	
}
