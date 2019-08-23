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
	 * 用户名
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
	 * 是否删除
	 */
	private String isDelete;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	@Override
	public String toString() {
		return "UserInfoPojo [id=" + id + ", name=" + name + ", sex=" + sex + ", email=" + email + ", address=" + address
				+ ", mobile=" + mobile + ", createDate=" + createDate + ", createUser=" + createUser + ", modifyDate="
				+ modifyDate + ", modifyUser=" + modifyUser + ", isDelete=" + isDelete + "]";
	}

	public UserInfoPojo(String name, String sex, String email, String address, String mobile,
			String createDate, String createUser, String modifyDate, String modifyUser, String isDelete) {
		super();
		
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.createDate = createDate;
		this.createUser = createUser;
		this.modifyDate = modifyDate;
		this.modifyUser = modifyUser;
		this.isDelete = isDelete;
	}

	public UserInfoPojo() {
		super();
	}
	
	
	
	

}
