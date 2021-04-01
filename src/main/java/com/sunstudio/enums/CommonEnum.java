package com.sunstudio.enums;

/**
 * 通用枚举
 * @author Lsatin
 * @date 2021年4月1日
 */
public enum CommonEnum {

	SUCCESSFULL(1, "响应成功"),
	
	FAILURE(0, "响应失败"),
	
	ERROR(999, "服务异常，请联系管理员");
	
	private CommonEnum(Integer code, String message) {}
	
	/**
	 * 用户登录状态
	 * @author Lsatin
	 * @date 2021年4月1日
	 */
	public enum AccountLoginStateEnum {
		
		SUCCESSFUL(101, "登入成功"),
		
		WARNING(102, "密码错误"),
		
		WRONG(100, "账户不存在");

		private AccountLoginStateEnum(int ordinal, String name) {}
		
	}
	
	/**
	 * 用户登出状态
	 * @author Lsatin
	 * @date 2021年4月1日
	 */
	public enum AccountLogoutStateEnum {
		
		SUCCESSFUL(101, "登出成功"),
		
		WARNING(102, "密码错误"),
		
		WRONG(100, "账户不存在");

		private AccountLogoutStateEnum(int ordinal, String name) {}
		
	}
	
}
