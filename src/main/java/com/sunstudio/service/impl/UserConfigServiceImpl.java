package com.sunstudio.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunstudio.dao.UserConfigDao;
import com.sunstudio.pojo.UserConfigPojo;
import com.sunstudio.service.UserConfigService;

/**
 * @author Lsatin
 * @date 2019年9月7日
 */
@Service
public class UserConfigServiceImpl implements UserConfigService {

	@Resource
	private UserConfigDao userConfigDao;
	
	public int login(String name, String password) {
		UserConfigPojo pojo = userConfigDao.getUserByNameAndPassword(name, password);
		if (null != pojo) {
			if (pojo.getName().isEmpty()) {
				return -1;
			} else if (pojo.getPassword().isEmpty()) {
				return -2;
			} else if (!pojo.getName().isEmpty() && !pojo.getPassword().isEmpty()) {
				return 0;
			}
		}
		return -3;
	}

	public int logOut(String name, String password) {
		UserConfigPojo pojo = userConfigDao.getUserByNameAndPassword(name, password);
		if (pojo.getName().isEmpty()) {
			return -1;
		} else if (pojo.getPassword().isEmpty()) {
			return -2;
		} else if (!pojo.getName().isEmpty() && !pojo.getPassword().isEmpty()) {
			return 1;
		}
		return 0;
	}

}
