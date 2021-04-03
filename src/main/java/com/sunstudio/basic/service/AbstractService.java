package com.sunstudio.basic.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sunstudio.basic.dao.BasicDao;
import com.sunstudio.basic.pojo.PreBatchSaveHandlePojo;

/**
 * 抽象service实现类
 * @author Lsatin
 * @date 2021年3月29日
 */
public abstract class AbstractService<T, D extends BasicDao<T, Long>> implements BasicService<T, Long> {

	/** Log4j */
	protected final static Logger LOGGER = LogManager.getLogger();
	
	/**
	 * 注入持久层
	 * @param dao 持久层
	 */
	protected abstract void setDao(D dao);
	
	/**
	 * 获取持久层
	 * @return {@link D} 持久层
	 */
	protected abstract D getDao();
	
	/**
	 * 保存前
	 * @param param 实体
	 * @return {@link T} 实体
	 */
	protected abstract T preSave(T param);
	
	/**
	 * 批量保存前
	 * <p>将列表实体区分出更新、新增</p>
	 * <p>新增：insert</p>
	 * <p>更新：update</p>
	 * @param params 实体集
	 * @return {@link PreBatchSaveHandlePojo<T>} 列表实体（）
	 */
	protected abstract PreBatchSaveHandlePojo<T> preBatchSave(List<T> params);
	
	/* (non-Javadoc)
	 * @see com.sunstudio.basic.service.BasicService#list()
	 */
	@Override
	public List<T> list() {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("{} 执行列表方法", getClass().getCanonicalName());
		}
		return getDao().select(null);
	}

	/* (non-Javadoc)
	 * @see com.sunstudio.basic.service.BasicService#query(java.lang.Object)
	 */
	@Override
	public List<T> query(T param) {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("{} 执行查询方法", getClass().getCanonicalName());
		}
		return getDao().select(param);
	}

	/* (non-Javadoc)
	 * @see com.sunstudio.basic.service.BasicService#get(java.lang.Long)
	 */
	@Override
	public T get(Long id) {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("{} 执行列表方法：{}", getClass().getCanonicalName(), id);
		}
		return getDao().selectByPrimaryKey(id);
	}
	
}
