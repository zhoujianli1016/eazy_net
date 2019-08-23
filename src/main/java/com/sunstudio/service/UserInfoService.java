package com.sunstudio.service;

import java.util.List;

import com.sunstudio.pojo.UserInfoPojo;

/** 用户信息service
 * @author Lsatin
 * @date 2019年8月24日
 */
public interface UserInfoService {

	/**
	 * 查询所有用户
	 * @return
	 */
	List<UserInfoPojo> queryAllUsers();
	
	/**
	 * 查询单个用户，根据【主键id、用户名、业务删除是/否、性别】
	 * @param user 用户
	 * @return
	 */
	UserInfoPojo queryUserInfo(UserInfoPojo user);
	
	/**
	 * 注册用户
	 * @param user
	 */
	void register(UserInfoPojo user);
	
	/**
	 * 保存用户
	 * @return
	 */
	UserInfoPojo saveUser(UserInfoPojo user);
	
	/**
	 * 批量保存用户
	 * @param users
	 * @return
	 */
	List<UserInfoPojo> saveUserBatch(List<UserInfoPojo> users);
	
}
