package com.sunstudio.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunstudio.dao.UserInfoDao;
import com.sunstudio.pojo.UserInfoPojo;
import com.sunstudio.service.UserInfoService;

/** 用户信息service实现类
 * @author Lsatin
 * @date 2019年8月24日
 */
@Service(value = "userInfoService")
public class UserInfoServiceImpl implements UserInfoService {
	
	@Resource
	private UserInfoDao userInfoDao;

	public List<UserInfoPojo> queryAllUsers() {
		return userInfoDao.selectAllUsers();
	}

	public UserInfoPojo queryUserInfo(UserInfoPojo user) {
		return userInfoDao.selectUser(user);
	}

	public UserInfoPojo saveUser(UserInfoPojo user) {
		if (user.getId().isEmpty()) {
			return null;
		} else {
			return userInfoDao.updateUser(user);
		}
	}

	public List<UserInfoPojo> saveUserBatch(List<UserInfoPojo> users) {
		return userInfoDao.updateUsers(users);
	}

}
