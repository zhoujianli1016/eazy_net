package com.sunstudio.pojo;

import java.io.Serializable;

/** restful响应pojo
 * @author Lsatin 2019年11月2日
 * @param <T>
 *
 */
public class RestResponsePojo<T> implements Serializable{

	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 1200624686673376004L;

	/**
	 * 代码
	 */
	private String code;
	
	/**
	 * 消息
	 */
	private String message;
	
	/**
	 * 返回数据
	 */
	private T	data;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
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
	 * @param code
	 * @param message
	 * @param data
	 */
	public RestResponsePojo(String code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
}
