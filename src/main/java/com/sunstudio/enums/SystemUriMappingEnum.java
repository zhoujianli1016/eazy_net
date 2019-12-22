package com.sunstudio.enums;

/** 系统请求映射枚举
 * @author Lsatin 2019年12月15日
 */
public enum SystemUriMappingEnum {
	
	/**
	 * 主页
	 */
	INDEX("/", "index"),

	/**
	 * 主页
	 */
	ROOT("/#", "redirect:/"),
	
	/**
	 * 仪表盘
	 */
	SYS("/sys", "sys/dashboard"),
	
	/**
	 * 登入
	 */
	LOGIN("/login", "user/login");
	
	private final String uri;
	
	private final String view;
	
	/**
	 * @param uri
	 * @param view
	 */
	private SystemUriMappingEnum(String uri, String view) {
		this.uri = uri;
		this.view = view;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @return the view
	 */
	public String getView() {
		return view;
	}

	public static String getViewByUrI(String uri) {
		if (SystemUriMappingEnum.INDEX.uri.equals(uri)) {
			return SystemUriMappingEnum.INDEX.view;
		} else if (SystemUriMappingEnum.ROOT.uri.equals(uri)) {
			return SystemUriMappingEnum.ROOT.view;
		} else if (SystemUriMappingEnum.SYS.uri.equals(uri)) {
			return SystemUriMappingEnum.SYS.view;
		} else if (SystemUriMappingEnum.LOGIN.uri.equals(uri)) {
			return SystemUriMappingEnum.LOGIN.view;
		}
		return null;
	}
	
}
