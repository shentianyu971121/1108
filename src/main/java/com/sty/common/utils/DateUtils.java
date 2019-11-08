package com.sty.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static Date getDateByInitMonth(Date src) {
		//获取日历类  日历类是抽象类 不能直接new
		Calendar c = Calendar.getInstance();
		//根据传入的日期构建日历类
		c.setTime(src);
		//设置月初
		c.set(Calendar.DAY_OF_MONTH, 1); //日小时
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	
	public static Date getDateByFullMonth(Date src) {
		//初始化类
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		
		//让月份加1 c.add就是让月份加一   
		c.add(Calendar.MONTH, 1);
		//让日期变为月初
		Date date = getDateByInitMonth(c.getTime());
		//在初始化日历类
		c.setTime(date);
		//让日期减去一秒
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	
}































