package com.sunstudio.basic.pojo;

import java.io.Serializable;

/**
 * 主键实体接口
 * @author Lsatin
 * @date 2021年3月30日
 */
public interface PrimaryKeyPojo<PK extends Serializable> {

	PK getId();
	
	void setId(PK id);
	
}
