package com.sunstudio.basic.pojo;

import com.sunstudio.enums.CommonEnum;

/**
 * 结果
 * @author Lsatin
 * @date 2021年3月29日
 */
public class Result<T extends Object> {

	private Integer code;
	
	private String message;
	
	private T data;
	
	public Result(Integer code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public Result(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	public Result(Integer code) {
		super();
		this.code = code;
	}
	
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * 成功
	 * @return {@link Result} 响应结果
	 */
	public static Result<?> ok() {
		return new Result<>(CommonEnum.SUCCESSFULL.ordinal());
	}
	
	/**
	 * 成功
	 * @param data 响应数据
	 * @return {@link Result} 响应结果
	 */
	public static <T> Result<T> ok(T data) {
		return new Result<>(CommonEnum.SUCCESSFULL.ordinal(), CommonEnum.SUCCESSFULL.name(), data);
	}
	
	/**
	 * 失败
	 * @return {@link Result} 响应结果
	 */
	public static Result<?> fail() {
		return new Result<>(CommonEnum.FAILURE.ordinal(), CommonEnum.FAILURE.name());
	}
	
	/**
	 * 失败
	 * @param msg 响应消息
	 * @return {@link Result} 响应结果
	 */
	public static Result<?> fail(String msg) {
		return new Result<>(CommonEnum.FAILURE.ordinal(), msg);
	}
	
	/**
	 * 错误
	 * @param exception 服务异常
	 * @return {@link Result} 响应结果
	 */
	public static <T extends Exception> Result<T> error(T exception) {
		return new Result<T>(CommonEnum.ERROR.ordinal(), CommonEnum.ERROR.name(), exception);
	}
	
}
