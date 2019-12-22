package com.sunstudio.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sunstudio.constants.CommonConstants;
import com.sunstudio.enums.AccountLoginStateEnum;

/** 登录拦截
 * @author Lsatin 2019年12月1日
 */
public class LoginInterceptor implements HandlerInterceptor {
	
	/**
	 * logger
	 */
	private Logger logger = LogManager.getLogger(this.getClass());

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String beforeUri = request.getRequestURI();
		logger.info("Intercepting user login of before URI [ " + beforeUri + " ]");
		if (beforeUri.indexOf(AccountLoginStateEnum.getUrlByCode(0)) > -1) {
			return true;
		}
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute(CommonConstants.SESSION_USER_KEY);
		if (StringUtils.isNotBlank(userName)) {
			return true;
		}
		session.setAttribute(CommonConstants.SESSION_URI_KEY, beforeUri);
		request.getRequestDispatcher(AccountLoginStateEnum.getUrlByCode(0)).forward(request, response);
		return false;
	}

}
