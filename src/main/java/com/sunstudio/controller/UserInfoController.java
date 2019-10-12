package com.sunstudio.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sunstudio.enums.UserEnum;
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
	public String login(@RequestParam(value = "name") String name, @RequestParam(value = "password")String password, Model model){
		int code = userConfigService.login(name, password);
		if (code == 0) {
			model.addAttribute("msg", UserEnum.getLabelByCode(0));
			return UserEnum.getUrlByCode(0);
		} else if (code == -1) {
			model.addAttribute("msg", UserEnum.getLabelByCode(-1));
			return UserEnum.getUrlByCode(-1);
		} else if (code == -2) {
			model.addAttribute("msg", UserEnum.getLabelByCode(-2));
			return UserEnum.getUrlByCode(-2);
		} else {
			model.addAttribute("msg", UserEnum.getLabelByCode(-3));
			return UserEnum.getUrlByCode(-3);
		}
	}
	
}
