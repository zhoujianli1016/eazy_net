package com.sunstudio.pojo;

/**
 * 用户信息实体类
 * 
 * @author Lsatin
 * @date 2019年8月24日
 */
public class UserInfoPojo {

	/**
	 * 主键ID
	 */
	private String id;
	
	/**
	 * 昵称
	 */
	private String nickName;
	
	/**
	 * 名字
	 */
	private String firstName;
	
	/**
	 * 姓氏
	 */
	private String lastName;
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 性别
	 */
	private String sex;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 手机
	 */
	private String mobile;
	
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
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
		return "UserInfoPojo [id=" + id + ", nickName=" + nickName + ", firstName=" + firstName + ", lastName=" + lastName
		    + ", name=" + name + ", sex=" + sex + ", email=" + email + ", address=" + address + ", mobile=" + mobile
		    + ", isDelete=" + isDelete + ", createDate=" + createDate + ", createUser=" + createUser + ", modifyDate="
		    + modifyDate + ", modifyUser=" + modifyUser + "]";
	}
	
}
