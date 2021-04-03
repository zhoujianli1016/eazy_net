package com.sunstudio.basic.pojo;

import java.io.Serializable;

/**
 * 行锁抽象类
 * @author Lsatin
 * @date 2021年3月31日
 */
public abstract class RowLockAbstractPojo<PK extends Serializable> implements PrimaryKeyPojo<PK> {

	/** 主键 */
	protected PK id;
	
	/** 锁字段 */
	protected Integer version;

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
	 * @return the version
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ", id=" + id + ", version=" + version + "]";
	}
	
}
