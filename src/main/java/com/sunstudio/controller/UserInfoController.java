package com.sunstudio.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunstudio.service.UserConfigService;
import com.sunstudio.service.UserInfoService;

/** 用户控制层
 * @author Lsatin
 * @date 2019年8月24日
 */
@Controller
@RequestMapping(value = "/user")
public class UserInfoController {

	@Resource
	private UserInfoService userInfoService;
	
	@Resource
	private UserConfigService userConfigService;
	
	@RequestMapping(value = "/login")
	public String login() {
		return "user/login";
	}
	
	@RequestMapping(value = "/login/in", method = RequestMethod.POST)
	public String login(@RequestParam(value = "name") String name, @RequestParam(value = "password")String password){
		int code = userConfigService.login(name, password);
		return code + "";
	}
	
}
