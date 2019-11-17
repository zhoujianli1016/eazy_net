package com.sunstudio.service;

import com.sunstudio.pojo.RegistPojo;

/** 用户设置service
 * @author Lsatin
 * @date 2019年8月24日
 */
public interface UserConfigService {

	/**
	 * 登入<br/>
	 * 1、账户不存在，返回100<br/>
	 * 2、登录成功，返回101<br/>
	 * 3、登录密码不正确，返回102<br/>
	 * 4、异常，返回103
	 * @param name 登录名
	 * @param password 登录密码
	 * @return
	 */
	int login(String name, String password);
	
	/**
	 * 登出<br/>
	 * 1、账户不存在，返回110<br/>
	 * 2、登出成功，返回111<br/>
	 * 3、登出密码不正确，返回112<br/>
	 * 4、异常，返回113
	 * @param name 登录名
	 * @param password 登录密码
	 * @return
	 */
	int logout(String name, String password);
	
	/**
	 * 注册<br/>
	 * @param pojo 用户注册
	 * @return
	 */
	String register(RegistPojo pojo);
	
}
