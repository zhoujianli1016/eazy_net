package com.sunstudio.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 主要页面展示控制层
 * @author Lsatin 2019年12月1日
 */
@Controller
@RequestMapping(method = RequestMethod.GET)
public class MainController {
	
	/**
	 * logger
	 */
	private Logger logger = LogManager.getLogger();
	
	@RequestMapping(value = "/")
	public String index() {
		logger.info("go to index.jsp");
		return "index";
	}

	/**
	 * 主页
	 * @return
	 */
	@RequestMapping(value = "/#")
	public String root() {
		logger.info("redirect index.jsp");
		return "redirect:/";
	}
	
	/**
	 * 后台仪表盘
	 * @return
	 */
	@RequestMapping(value = "/sys")
	public String admin() {
		logger.info("go to sys/dashboard.jsp");
		return "sys/dashboard";
		
	}
	
	/**
	 * 用户登录
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String login() {
		logger.info("go to user/login.jsp");
		return "user/login";
	}
	
}
