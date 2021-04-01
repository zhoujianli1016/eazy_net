package com.sunstudio.pojo;

import com.sunstudio.basic.pojo.RecordAbstractPojo;

/**
 * 实体类：用户信息
 * 
 * @author Lsatin
 * @date 2019年8月24日
 */
public class UserInfoPojo extends RecordAbstractPojo<Long> {

	/** 用户名 */
	private String username;

	/** 昵称 */
	private String nickname;

	/** 名字 */
	private String firstName;

	/** 姓氏 */
	private String lastName;

	/** 性别 */
	private Integer sex;

	/** 邮箱 */
	private String email;

	/** 地址 */
	private String address;

	/** 手机 */
	private String phone;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
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
	 * @return the sex
	 */
	public Integer getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(Integer sex) {
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInfoPojo [username=" + username + ", nickname=" + nickname + ", firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex + ", email=" + email + ", address=" + address + ", phone=" + phone + super.toString();
	}

	/**
	 * @param username
	 */
	public UserInfoPojo(String username) {
		super();
		this.username = username;
	}
	
	public UserInfoPojo() {
	}

}
