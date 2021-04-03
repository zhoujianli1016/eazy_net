package com.sunstudio.basic.pojo;

import java.util.List;

/**
 * 批量保存前处理实体
 * @author Lsatin
 * @date 2021年4月1日
 */
public class PreBatchSaveHandlePojo<T> {

	/** 处理前总计 */
	private int preTotal;
	
	/** 处理后总计 */
	private int total;
	
	/** 插入 */
	private List<T> inserts;
	
	/** 更新 */
	private List<T> renewal;
	
	/**
	 * @return the preTotal
	 */
	public int getPreTotal() {
		return preTotal;
	}

	/**
	 * @param preTotal the preTotal to set
	 */
	public void setPreTotal(int preTotal) {
		this.preTotal = preTotal;
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	/**
	 * @return the inserts
	 */
	public List<T> getInserts() {
		return inserts;
	}

	/**
	 * @param inserts the inserts to set
	 */
	public void setInserts(List<T> inserts) {
		this.inserts = inserts;
	}

	/**
	 * @return the renewal
	 */
	public List<T> getRenewal() {
		return renewal;
	}

	/**
	 * @param renewal the renewal to set
	 */
	public void setRenewal(List<T> renewal) {
		this.renewal = renewal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PreBatchSaveHandlePojo [preTotal=" + preTotal + ", total=" + total + ", inserts=" + inserts + ", renewal=" + renewal + "]";
	}
	
}
