package com.sunstudio.basic.pojo;

import java.io.Serializable;

/**
 * 记录实体类
 * <p>
 * 用于数据库中，表记录行中公共部分
 * </p>
 * 
 * @author Lsatin
 * @date 2021年2月20日
 */
public abstract class RecordAbstractPojo<PK extends Serializable> implements PrimaryKeyPojo<PK> {

	/** 主键id */
	protected PK id;

	/** 创建时间 */
	protected Long createdDate;

	/** 创建人 */
	protected String createdUser;

	/** 更新时间 */
	protected Long modifyedDate;

	/** 更新人 */
	protected String modifyedUser;

	/** 有效性 */
	protected Boolean valid;

	/**
	 * @return the id
	 */
	public PK getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(PK id) {
		this.id = id;
	}

	/**
	 * @return the createdDate
	 */
	public Long getCreatedDate() {
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Long createdDate) {
		this.createdDate = createdDate;
	}

	/**
	 * @return the createdUser
	 */
	public String getCreatedUser() {
		return createdUser;
	}

	/**
	 * @param createdUser the createdUser to set
	 */
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	/**
	 * @return the modifyedDate
	 */
	public Long getModifyedDate() {
		return modifyedDate;
	}

	/**
	 * @param modifyedDate the modifyedDate to set
	 */
	public void setModifyedDate(Long modifyedDate) {
		this.modifyedDate = modifyedDate;
	}

	/**
	 * @return the modifyedUser
	 */
	public String getModifyedUser() {
		return modifyedUser;
	}

	/**
	 * @param modifyedUser the modifyedUser to set
	 */
	public void setModifyedUser(String modifyedUser) {
		this.modifyedUser = modifyedUser;
	}

	/**
	 * @return the valid
	 */
	public Boolean getValid() {
		return valid;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(Boolean valid) {
		this.valid = valid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ", id=" + id + ", createdDate=" + createdDate + ", createdUser=" + createdUser + ", modifyedDate=" + modifyedDate + ", modifyedUser=" + modifyedUser + ", valid=" + valid + "]";
	}

	
	
}
