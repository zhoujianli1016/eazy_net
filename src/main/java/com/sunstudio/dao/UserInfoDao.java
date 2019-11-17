package com.sunstudio.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sunstudio.pojo.UserInfoPojo;

/** 用户信息持久层
 * @author Lsatin
 * @date 2019年8月24日
 */
@Repository
public interface UserInfoDao {

	/**
	 * 获取所有用户信息
	 * @return
	 */
	List<UserInfoPojo> selectAllUsers();
	
	/**
	 * 查询单个用户
	 * @param user 用户
	 * @return
	 */
	UserInfoPojo selectUser(UserInfoPojo user);
	
	/**
	 * 批量修改
	 * @param userList 多个用户
	 * @return
	 */
	List<UserInfoPojo> updateUsers(List<UserInfoPojo> userList);
	
	/**
	 * 修改单个用户
	 * @param user 单个用户
	 * @return
	 */
	UserInfoPojo updateUser(UserInfoPojo user);
	
	
	/**
	 * 批量删除用户
	 * @param users 多个用户
	 * @return
	 */
	void deleteUsers(List<UserInfoPojo> users);
	
	/**
	 * 添加用户
	 * @param user 用户信息
	 * @return
	 */
	int insertUser(UserInfoPojo user);
	
}
