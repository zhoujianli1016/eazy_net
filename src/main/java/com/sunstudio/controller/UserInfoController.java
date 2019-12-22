package com.sunstudio.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunstudio.pojo.RegistPojo;
import com.sunstudio.service.UserConfigService;
import com.sunstudio.service.UserInfoService;

/** 用户信息控制层
 * @author Lsatin 2019年8月24日
 */
@ControllerAdvice
@RequestMapping(value = "/user")
public class UserInfoController {

	@Resource
	private UserInfoService userInfoService;
	
	@Resource
	private UserConfigService userConfigService;
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public String register(RegistPojo pojo) {
		return userConfigService.register(pojo);
	}
	
}
