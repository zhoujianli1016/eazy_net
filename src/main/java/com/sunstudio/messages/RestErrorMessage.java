package com.sunstudio.messages;

import org.springframework.http.HttpStatus;

/** restful错误信息
 * @author Lsatin 2019年11月2日
 */
public class RestErrorMessage {
	
	/**
	 * HTTP状态
	 */
	private HttpStatus status;
	
	/**
	 * HTTP状态码
	 */
	private int code;
	
	/**
	 * 消息
	 */
	private String message;
	
	/**
	 * 详细消息
	 */
	private String detailedMessage;
	
	/**
	 * 异常消息
	 */
	private String exceptionMessage;

	/**
	 * @param status
	 * @param code
	 * @param message
	 * @param detailedMessage
	 * @param exceptionMessage
	 */
	public RestErrorMessage(HttpStatus status, int code, String message, String detailedMessage,
	    String exceptionMessage) {
		super();
		this.status = status;
		this.code = code;
		this.message = message;
		this.detailedMessage = detailedMessage;
		this.exceptionMessage = exceptionMessage;
	}

	/**
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
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
	 * @return the detailedMessage
	 */
	public String getDetailedMessage() {
		return detailedMessage;
	}

	/**
	 * @param detailedMessage the detailedMessage to set
	 */
	public void setDetailedMessage(String detailedMessage) {
		this.detailedMessage = detailedMessage;
	}

	/**
	 * @return the exceptionMessage
	 */
	public String getExceptionMessage() {
		return exceptionMessage;
	}

	/**
	 * @param exceptionMessage the exceptionMessage to set
	 */
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
}
