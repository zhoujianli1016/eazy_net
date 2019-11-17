package com.sunstudio.utils;

import java.util.Date;
import java.util.UUID;

/** 主键生成类
 * @author Lsatin 2019年11月2日
 */
public class IDGeneratorUtil {

	/**
	 * 生成主键（32位）
	 * @return
	 */
	public static String generateID() {
		return generateID(System.currentTimeMillis());
	}

	/**
	 * 生成主键（32位）
	 * @param date
	 * @return
	 */
	public static String generateID(Date date) {
		return generateID(date.getTime());
	}

	/**
	 * 根据指定时间生成主键
	 * @param time 时间戳
	 * @return
	 */
	public static String generateID(long time) {
		String rtnVal = Long.toHexString(time);
		rtnVal += UUID.randomUUID();
		rtnVal = rtnVal.replaceAll("-", "");
		return rtnVal.substring(0, 32);
	}

	/**
	 * 查看主键生成时间
	 * @param id
	 */
	protected static void printIDTime(String id) {
		String timeInfo = id.substring(0, 11);
		System.out.println(new Date(Long.parseLong(timeInfo, 16)));
	}

	/**
	 * 根据ID获取该ID创建的时间
	 * @author 曹映辉
	 * @param id
	 * @return
	 */
	public static Date getIDCreateTime(String id) {
		String timeInfo = id.substring(0, 11);
		return new Date(Long.parseLong(timeInfo, 16));
	}
	
}
