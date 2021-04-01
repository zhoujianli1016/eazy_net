package com.sunstudio.interceptor;

import java.io.PrintWriter;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sunstudio.basic.pojo.Result;
import com.sunstudio.constants.CommonConstants;
import com.sunstudio.utils.JsonUtil;

/** 登录拦截
 * @author Lsatin 2019年12月1日
 */
public class LoginInterceptor implements HandlerInterceptor {
	
	/** log4j */
	private final Logger LOGGER = LogManager.getLogger(this.getClass());

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
		LOGGER.info("拦截器：{} URI [ {} ]", getClass().getCanonicalName(), beforeUri);
		if (beforeUri.indexOf("/login") > -1) {
			return true;
		}
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute(CommonConstants.SESSION_USER_KEY);
		if (StringUtils.isNotBlank(userName)) {
			return true;
		}
		if (Objects.equals(request.getContentType(), MediaType.TEXT_XML_VALUE)) {
			session.setAttribute(CommonConstants.SESSION_URI_KEY, beforeUri);
			request.getRequestDispatcher("/login").forward(request, response);
		}
		response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
		PrintWriter writer = response.getWriter();
		writer.write(JsonUtil.toJSON(Result.fail("当前访问路径：" + beforeUri + ", 需要用户权限，请登录后重试!")));
		return false;
	}

}
