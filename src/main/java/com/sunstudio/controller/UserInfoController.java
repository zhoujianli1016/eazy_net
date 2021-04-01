package com.sunstudio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunstudio.basic.controller.AbstractController;
import com.sunstudio.pojo.UserInfoPojo;
import com.sunstudio.service.UserInfoService;

/** 用户信息控制层
 * @author Lsatin 2019年8月24日
 */
@ControllerAdvice
@RequestMapping(value = "/user")
public class UserInfoController extends AbstractController<UserInfoPojo, UserInfoService<UserInfoPojo>> {

	private UserInfoService<UserInfoPojo> userInfoService;
	
	@Override
	protected UserInfoService<UserInfoPojo> getService() {
		return userInfoService;
	}
	
	@Autowired
	@Override
	protected void setService(UserInfoService<UserInfoPojo> service) {
		if (LOGGER.isTraceEnabled()) {
			LOGGER.trace("{} 注入service：{}", getClass().getTypeName(), service.getClass().getTypeName());
		}
		this.userInfoService = service;
	}
	
}
