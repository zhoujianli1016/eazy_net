package com.sunstudio.enums;

/** 用户相关枚举
 * @author Lsatin
 * @date 2019年10月4日
 */
public enum UserEnum {

	/**
	 * 系统异常
	 */
	SERVER_ERROR(-3, "系统异常", "user/login"),
	
	/**
	 * 账户访问通过
	 */
	ACCOUNT_ACCESSED(0, "登录成功", "user/login"),
	
	/**
	 * 账户密码错误
	 */
	ACCOUNT_PASSWORD_ERROR(-2, "账户密码错误", "user/login"),
	
	/**
	 * 账户不存在
	 */
	ACCOUNT_ERROR(-1, "账户不存在", "user/login");
	
	/**
	 * 代码
	 */
	private int code;
	
	/**
	 * 标签
	 */
	private String label;
	
	/**
	 * 地址
	 */
	private String url;

	private UserEnum(int code, String label, String url) {
		this.code = code;
		this.label = label;
		this.url = url;
	}
	
	/**
	 * 根据代码获取标签
	 * @param code 代码
	 * @return
	 */
	public static String getLabelByCode(int code) {
		String str = new String();
		switch (code) {
		case 0:
			str = UserEnum.ACCOUNT_ACCESSED.label;
			break;
		case -1:
			str = UserEnum.ACCOUNT_ERROR.label;
			break;
		case -2:
			str = UserEnum.ACCOUNT_PASSWORD_ERROR.label;
			break;
		case -3:
			str = UserEnum.SERVER_ERROR.label;
			break;
		default:
			str = "系统异常";
			break;
		}
		return str;
	}
	
	public static String getUrlByCode(int code) {
		String str = new String();
		switch (code) {
		case 0:
			str = UserEnum.ACCOUNT_ACCESSED.url;
			break;
		case -1:
			str = UserEnum.ACCOUNT_ERROR.url;
			break;
		case -2:
			str = UserEnum.ACCOUNT_PASSWORD_ERROR.url;
			break;
		case -3:
			str = UserEnum.SERVER_ERROR.url;
			break;
		default:
			str = null;
			break;
		}
		return str;
	}
	
}
