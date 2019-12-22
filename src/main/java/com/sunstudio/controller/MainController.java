package com.sunstudio.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sunstudio.enums.SystemUriMappingEnum;

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
		return SystemUriMappingEnum.INDEX.getView();
	}

	/**
	 * 主页
	 * @return
	 */
	@RequestMapping(value = "/#")
	public String root() {
		logger.info("redirect index.jsp");
		return SystemUriMappingEnum.ROOT.getView();
	}
	
	/**
	 * 后台仪表盘
	 * @return
	 */
	@RequestMapping(value = "/sys")
	public String admin() {
		logger.info("go to sys/dashboard.jsp");
		return SystemUriMappingEnum.SYS.getView();
		
	}
	
	/**
	 * 用户登录
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String login() {
		logger.info("go to user/login.jsp");
		return SystemUriMappingEnum.LOGIN.getView();
	}
	
}
