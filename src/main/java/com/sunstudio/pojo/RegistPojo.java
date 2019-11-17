package com.sunstudio.pojo;

/** 注册pojo
 * @author Lsatin 2019年11月17日
 */
public class RegistPojo {

	/**
	 * 昵称
	 */
	private String nickName;
	
	/**
	 * 登录名
	 */
	private String loginName;
	
	/**
	 * 登录密码
	 */
	private String registerPassword;

	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return the loginName
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @param loginName the loginName to set
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @return the registerPassword
	 */
	public String getRegisterPassword() {
		return registerPassword;
	}

	/**
	 * @param registerPassword the registerPassword to set
	 */
	public void setRegisterPassword(String registerPassword) {
		this.registerPassword = registerPassword;
	}
	
}
