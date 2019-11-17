package com.sunstudio.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

/** 日期工具类
 * @author Lsatin 2019年11月17日
 */
public class DateUtil extends DateUtils {
	
	/**
	 * 默认日期格式（yyyy-MM-dd）
	 */
	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
	
	/**
	 * 日期格式（yyyy/MM/dd）
	 */
	public static final String DATE_FORMAT = "yyyy/MM/dd"; 
	
	/**
	 * 年月日期格式（yyyy-MM）
	 */
	public static final String YEARS_DATE_FORMAT = "yyyy-MM";
	
	/**
	 * 标准日期格式（yyyy-MM-dd hh24:Mi:ss）
	 */
	public static final String ISO_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 获取当前日期（格式为默认格式yyyy-MM-dd）
	 * @return
	 */
	public static String getCurrentDate(){
		Calendar calendar = DateUtils.toCalendar(new Date());
		return new SimpleDateFormat(DEFAULT_DATE_FORMAT).format(calendar.getTime());
	}
	
	/**
	 * 获取当前日期
	 * @param pattern 模式
	 * @return
	 */
	public static String getCurrentDate(String pattern) {
		Calendar calendar = DateUtils.toCalendar(new Date());
		return new SimpleDateFormat(pattern).format(calendar.getTime());
	}
	
}
