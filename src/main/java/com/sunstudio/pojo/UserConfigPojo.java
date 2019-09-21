package com.sunstudio.pojo;

/** 用户设置pojo
 * @author Lsatin
 * @date 2019年9月7日
 */
public class UserConfigPojo {
	
	/**
	 * 主键id
	 */
	private String id;
	
	/**
	 * 登录名
	 */
	private String name;
	
	/**
	 * 登录密码
	 */
	private String password;
	
	/**
	 * 用户信息主键id
	 */
	private String userInfoId;
	
	/**
	 * 是否删除
	 */
	private String isDelete;
	
	/**
	 * 创建日期
	 */
	private String createDate;
	
	/**
	 * 创建人
	 */
	private String createUser;
	
	/**
	 * 修改日期
	 */
	private String modifyDate;
	
	/**
	 * 修改人
	 */
	private String modifyUser;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userInfoId
	 */
	public String getUserInfoId() {
		return userInfoId;
	}

	/**
	 * @param userInfoId the userInfoId to set
	 */
	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}

	/**
	 * @return the isDelete
	 */
	public String getIsDelete() {
		return isDelete;
	}

	/**
	 * @param isDelete the isDelete to set
	 */
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	/**
	 * @return the createDate
	 */
	public String getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the createUser
	 */
	public String getCreateUser() {
		return createUser;
	}

	/**
	 * @param createUser the createUser to set
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	/**
	 * @return the modifyDate
	 */
	public String getModifyDate() {
		return modifyDate;
	}

	/**
	 * @param modifyDate the modifyDate to set
	 */
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	/**
	 * @return the modifyUser
	 */
	public String getModifyUser() {
		return modifyUser;
	}

	/**
	 * @param modifyUser the modifyUser to set
	 */
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String toString() {
		return "UserConfigPojo [id=" + id + ", name=" + name + ", password=" + password + ", userInfoId=" + userInfoId
		    + ", isDelete=" + isDelete + ", createDate=" + createDate + ", createUser=" + createUser + ", modifyDate="
		    + modifyDate + ", modifyUser=" + modifyUser + "]";
	}
	
}
