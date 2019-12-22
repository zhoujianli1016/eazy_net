package com.sunstudio.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sunstudio.constants.CommonConstants;
import com.sunstudio.enums.AccountLoginStateEnum;
import com.sunstudio.enums.AccountLogoutStateEnum;
import com.sunstudio.enums.SystemUriMappingEnum;
import com.sunstudio.pojo.RestResponsePojo;
import com.sunstudio.service.UserConfigService;
import com.sunstudio.service.UserInfoService;

/**
 * 系统登录控制层
 * @author Lsatin 2019年12月1日
 */
@Controller
@RequestMapping(value = "/login", method = RequestMethod.POST)
public class SysLoginController {
	
	@Resource
	private UserConfigService userConfigService;
	
	@Resource
	private UserInfoService userInfoService;
	
	/**
	 * 系统登入，装箱登录名
	 * @param session 会话
	 * @param name 登录名
	 * @param password 登录密码
	 * @return {@link String}
	 */
	@RequestMapping(value = "/in")
	public ModelAndView login(HttpSession session, @RequestParam(value = "name")String name, @RequestParam(value = "password")String password) {
		ModelAndView modelAndView = new ModelAndView();
		int code = userConfigService.login(name, password);
		modelAndView.addObject("code", code);
		if (code == AccountLoginStateEnum.SUCCESSFUL.getCode()) {
			session.setAttribute(CommonConstants.SESSION_USER_KEY, name);
			Object beforeUri = session.getAttribute(CommonConstants.SESSION_URI_KEY);
			if (null == beforeUri) {
				modelAndView.setViewName("user/loginFailed");
				modelAndView.addObject("message", AccountLoginStateEnum.ERROR.getLabel());
				return modelAndView;
			}
			modelAndView.setViewName(SystemUriMappingEnum.getViewByUrI(beforeUri.toString()));
			return modelAndView;
		} else if (code == AccountLoginStateEnum.ERROR.getCode()) {
			modelAndView.setViewName("user/loginFailed");
			modelAndView.addObject("message", AccountLoginStateEnum.ERROR.getLabel());
			return modelAndView;
		} else if (code == AccountLoginStateEnum.WARNING.getCode()) {
			modelAndView.setViewName("user/loginFailed");
			modelAndView.addObject("message", AccountLoginStateEnum.WARNING.getLabel());
			return modelAndView;
		} else if (code == AccountLoginStateEnum.WRONG.getCode()) {
			modelAndView.setViewName("user/loginFailed");
			modelAndView.addObject("message", AccountLoginStateEnum.WRONG.getLabel());
			return modelAndView;
		} else {
			modelAndView.setViewName("user/loginSuccessful");
			modelAndView.addObject("message", AccountLoginStateEnum.SUCCESSFUL.getLabel());
			return modelAndView;
		}
	}
	
	/**
	 * 系统登出，清除登录名
	 * @param session 会话
	 * @param name 登录名
	 * @param password 登录密码
	 * @return {@link RestResponsePojo}
	 */
	@RequestMapping(value = "/out")
	public RestResponsePojo<Object> logout(HttpSession session, @RequestParam(value = "name")String name, @RequestParam(value = "password")String password) {
		int code = userConfigService.logout(name, password);
		if (code == AccountLogoutStateEnum.SUCCESSFUL.getCode()) {
			session.invalidate();
		}
		return new RestResponsePojo<Object>(String.valueOf(code), AccountLogoutStateEnum.getLabelByCode(code), null);
	}
	
}
