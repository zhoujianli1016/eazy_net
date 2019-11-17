package com.sunstudio.enums;

/**	账户登出状态枚举
 * @author Lsatin 2019年10月4日
 */
public enum AccountLogoutStateEnum {
	
	/**
	 * 系统异常
	 */
	ERROR(113, "系统异常", "user/login"),
	
	/**
	 * 登出成功
	 */
	SUCCESSFUL(111, "登出成功", "user/login"),
	
	/**
	 * 密码错误
	 */
	WARNING(112, "密码错误", "user/login"),
	
	/**
	 * 不存在用户
	 */
	WRONG(110, "账户不存在", "user/login");
	
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
	 * @param code
	 * @param label
	 * @param url
	 */
	private AccountLogoutStateEnum(int code, String label, String url) {
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
		case 111:
			str = SUCCESSFUL.label;
			break;
		case 110:
			str = WRONG.label;
			break;
		case 112:
			str = WARNING.label;
			break;
		case 113:
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
		case 111:
			str = SUCCESSFUL.url;
			break;
		case 110:
			str = WRONG.url;
			break;
		case 112:
			str = WARNING.url;
			break;
		case 113:
			str = ERROR.url;
			break;
		default:
			str = ERROR.url;
			break;
		}
		return str;
	}
	
}
