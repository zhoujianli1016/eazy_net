package com.sunstudio.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sunstudio.dao.UserConfigDao;
import com.sunstudio.dao.UserInfoDao;
import com.sunstudio.enums.AccountLoginStateEnum;
import com.sunstudio.enums.AccountLogoutStateEnum;
import com.sunstudio.pojo.RegistPojo;
import com.sunstudio.pojo.UserConfigPojo;
import com.sunstudio.pojo.UserInfoPojo;
import com.sunstudio.service.UserConfigService;

/** 用户设置service实现类
 * @author Lsatin 2019年9月7日
 */
@Service
public class UserConfigServiceImpl implements UserConfigService {

	@Resource
	private UserConfigDao userConfigDao;
	
	@Resource
	private UserInfoDao userInfoDao;
	
	public int login(String name, String password) {
		try {
			UserConfigPojo pojo = userConfigDao.selectByNameAndPassword(name, password);
			if (null != pojo) {
				if (pojo.getName().isEmpty()) {
					return AccountLoginStateEnum.WRONG.getCode();
				} else if (pojo.getPassword().isEmpty()) {
					return AccountLoginStateEnum.WARNING.getCode();
				} else if (!pojo.getName().isEmpty() && !pojo.getPassword().isEmpty()) {
					return AccountLoginStateEnum.SUCCESSFUL.getCode();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return AccountLoginStateEnum.ERROR.getCode();
		}
		return AccountLoginStateEnum.WRONG.getCode();
	}

	public int logout(String name, String password) {
		try {
			UserConfigPojo pojo = userConfigDao.selectByNameAndPassword(name, password);
			if (pojo.getName().isEmpty()) {
				return AccountLogoutStateEnum.WRONG.getCode();
			} else if (pojo.getPassword().isEmpty()) {
				return AccountLogoutStateEnum.WARNING.getCode();
			} else if (!pojo.getName().isEmpty() && !pojo.getPassword().isEmpty()) {
				return AccountLogoutStateEnum.SUCCESSFUL.getCode();
			}
		} catch (Exception e) {
			e.printStackTrace();
			return AccountLogoutStateEnum.ERROR.getCode();
		}
		return AccountLogoutStateEnum.WRONG.getCode();
	}

	public String register(RegistPojo pojo) {
		UserInfoPojo userInfo = new UserInfoPojo();
		UserConfigPojo userConfig = new UserConfigPojo();

		userInfo.setNickName(pojo.getNickName());
		
		userConfig.setName(pojo.getLoginName());
		userConfig.setPassword(pojo.getRegisterPassword());
		userInfoDao.insertUser(userInfo);
		userConfig.setUserInfoId(userInfo.getId());
		return String.valueOf(userConfigDao.insertUser(userConfig));
	}

}
