package com.sunstudio.service;

/** 用户设置service
 * @author Lsatin
 * @date 2019年8月24日
 */
public interface UserConfigService {

	/**
	 * 登入<br/>
	 * 1、账户不存在，返回-1<br/>
	 * 2、登录成功，返回0<br/>
	 * 3、登录密码不正确，返回-2
	 * @param name 登录名
	 * @param password 登录密码
	 * @return
	 */
	int login(String name, String password);
	
	/**
	 * 登出<br/>
	 * 1、登录名或登录密码为空，返回0<br/>
	 * 2、登录名或登录密码不为空，且不存在与系统中，返回0<br/>
	 * 3、登录名或登录密码不为空，且存在与系统中，返回1<br/>
	 * 4、登录名不正确，返回-1<br/>
	 * 5、登录密码不正确，返回-2
	 * @param name 登录名
	 * @param password 登录密码
	 * @return
	 */
	int logOut(String name, String password);
	
}
