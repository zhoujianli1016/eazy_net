package com.sunstudio.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sunstudio.basic.dao.BasicDao;
import com.sunstudio.pojo.UserInfoPojo;

/**
 * 用户信息持久层
 * 
 * @author Lsatin
 * @date 2019年8月24日
 */
@Repository
public interface UserInfoDao extends BasicDao<UserInfoPojo, Long> {

	void inserts(@Param(value = "params") List<UserInfoPojo> params);
	
	List<UserInfoPojo> selects(@Param(value = "params") Object[] params);
	
}
