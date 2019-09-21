package com.sunstudio.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.sunstudio.pojo.UserConfigPojo;


/** 用户设置持久层
 * @author Lsatin
 * @date 2019年8月24日
 */
@Repository
public interface UserConfigDao {

	/**
	 * 获取用户根据登录名和登录密码<br/>
	 * @param name 登录名
	 * @param password 登录密码
	 * @return
	 */
	UserConfigPojo getUserByNameAndPassword(@Param("name")String name, @Param("password")String password);
	
}
