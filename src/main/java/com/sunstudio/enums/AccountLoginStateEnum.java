package com.sunstudio.enums;

/** 账户登入状态枚举
 * @author Lsatin 2019年10月4日
 */
public enum AccountLoginStateEnum {

	/**
	 * 系统异常
	 */
	ERROR(103, "系统异常", "user/login"),
	
	/**
	 * 登入成功
	 */
	SUCCESSFUL(101, "登入成功", "user/login"),
	
	/**
	 * 密码错误
	 */
	WARNING(102, "密码错误", "user/login"),
	
	/**
	 * 不存在用户
	 */
	WRONG(100, "账户不存在", "user/login");
	
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

	private AccountLoginStateEnum(int code, String label, String url) {
		this.code = code;
		this.label = label;
		this.url = url;
	}
	
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
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
		case 101:
			str = SUCCESSFUL.label;
			break;
		case 100:
			str = WRONG.label;
			break;
		case 102:
			str = WARNING.label;
			break;
		case 103:
			str = ERROR.label;
			break;
		default:
			str = ERROR.label;
			break;
		}
		return str;
	}
	
	/**
	 * 根据代码获取URL
	 * @param code 代码
	 * @return
	 */
	public static String getUrlByCode(int code) {
		String str = new String();
		switch (code) {
		case 101:
			str = SUCCESSFUL.url;
			break;
		case 100:
			str = WRONG.url;
			break;
		case 102:
			str = WARNING.url;
			break;
		case 103:
			str = ERROR.url;
			break;
		default:
			str = ERROR.url;
			break;
		}
		return str;
	}
	
}
