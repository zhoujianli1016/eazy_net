package com.sunstudio.exceptions;

/** restful异常
 * @author Lsatin 2019年11月2日
 *
 */
public class RestException extends RuntimeException {
	
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = -3129741596094358327L;

	/**
	 * HTTP状态号
	 */
	private int code;
	
	/**
	 * 信息
	 */
	private String message;
	
	/**
	 * 详细信息
	 */
	private String detailedMessage;

	/**
	 * @param code
	 * @param message
	 * @param detailedMessage
	 */
	public RestException(int code, String message, String detailedMessage) {
		super();
		this.code = code;
		this.message = message;
		this.detailedMessage = detailedMessage;
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

}
