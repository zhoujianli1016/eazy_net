package com.sunstudio.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunstudio.basic.pojo.PreBatchSaveHandlePojo;
import com.sunstudio.basic.service.AbstractService;
import com.sunstudio.dao.UserInfoDao;
import com.sunstudio.pojo.UserInfoPojo;
import com.sunstudio.service.UserInfoService;

/**
 * 用户信息service实现类
 * 
 * @author Lsatin
 * @date 2019年8月24日
 */
@Service(value = "userInfoService")
public class UserInfoServiceImpl extends AbstractService<UserInfoPojo, UserInfoDao> implements UserInfoService<UserInfoPojo> {

	private UserInfoDao userInfoDao;

	@Autowired
	@Override
	protected void setDao(UserInfoDao dao) {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("{} 注入dao：{}", getClass().getTypeName(), dao.getClass().getTypeName());
		}
		this.userInfoDao = dao;
	}

	@Override
	protected UserInfoDao getDao() {
		return userInfoDao;
	}

	@Override
	protected UserInfoPojo preSave(UserInfoPojo param) {
		Objects.requireNonNull(param, "保存的用户信息为空");
		List<UserInfoPojo> select = userInfoDao.select(new UserInfoPojo(param.getUsername()));
		if (Objects.nonNull(select) && select.size() > 0) {
			param.setId(select.get(0).getId());
		}
		return param;
	}

	/** 
	 * 批量保存前
	 * <p>1.检查<code>params</code>是否为空</p>
	 * <p>2.筛选出<code>id</code>不为空实体，标记在<code>PreBatchSaveHandlePojo.renewal</code></p>
	 * <p>3.筛选<code>UserInfoPojo.username</code>在数据库中存在数据，标记在<code>PreBatchSaveHandlePojo.renewal</code></p>
	 * <p>4.筛选<code>UserInfoPojo.username</code>在数据库中不存在数据，标记在<code>PreBatchSaveHandlePojo.inserts</code></p>
	 */
	@Override
	protected PreBatchSaveHandlePojo<UserInfoPojo> preBatchSave(List<UserInfoPojo> params) {
		Objects.requireNonNull(params, "批量保存的用户信息为空");
		PreBatchSaveHandlePojo<UserInfoPojo> result = new PreBatchSaveHandlePojo<>();
		result.setPreTotal(params.size());
		
		List<UserInfoPojo> updateList = params.stream().filter(e -> Objects.nonNull(e.getId())).collect(Collectors.toList());
		
		Object[] queryList = params.stream().map(e -> e.getUsername()).toArray();
		List<UserInfoPojo> existList = userInfoDao.selects(queryList);
		List<UserInfoPojo> insertList = params.stream()
				.filter(p -> !existList.stream()
						.map(UserInfoPojo :: getUsername)
						.anyMatch(e -> Objects.equals(e, p.getUsername())))
				.collect(Collectors.toList());
		updateList.addAll(existList.stream()
				.filter(e -> params.stream()
						.map(UserInfoPojo :: getUsername)
						.anyMatch(p -> Objects.equals(e.getUsername(), p)))
				.collect(Collectors.toList()));
		result.setRenewal(updateList);
		result.setInserts(insertList);
		return result;
	}

	@Override
	public UserInfoPojo save(UserInfoPojo param) {
		preSave(param);
		if (Objects.isNull(param.getId())) {
			param.setId(userInfoDao.insert(param));
		} else {
			userInfoDao.update(param);
		}
		return param;
	}

	@Override
	public List<UserInfoPojo> batchSave(List<UserInfoPojo> params) {
		PreBatchSaveHandlePojo<UserInfoPojo> preBatchSave = preBatchSave(params);
		List<UserInfoPojo> result = new ArrayList<>();
		List<UserInfoPojo> renewal = preBatchSave.getRenewal();
		List<UserInfoPojo> inserts = preBatchSave.getInserts();
		renewal.stream().forEach(e -> {
			userInfoDao.update(e);
		});
		if (Objects.nonNull(inserts) && inserts.size() > 0) {
			userInfoDao.inserts(inserts);
		}
		result.addAll(renewal);
		result.addAll(inserts);
		return result;
	}

}
