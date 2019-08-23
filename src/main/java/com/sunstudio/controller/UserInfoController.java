package com.sunstudio.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sunstudio.pojo.UserInfoPojo;
import com.sunstudio.service.UserInfoService;

/** 用户控制层
 * @author Lsatin
 * @date 2019年8月24日
 */
@Controller
@RequestMapping(value = "/user")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	@ResponseBody
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<UserInfoPojo> user(){
		return userInfoService.queryAllUsers();
	}
	
}
