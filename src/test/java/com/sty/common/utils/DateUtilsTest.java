package com.sty.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

	/**
	 * 
	 * @Title: 给你一个日期 返回该日期的第一天 比如10.25 12:25:35 返回10.01 00:00:00
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testGetDateByInitMonth() {
		
		
		Calendar c = Calendar.getInstance();
		c.set(2000, 9, 10);
		
		Date date = DateUtils.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = df.format(date);
		System.out.println(format);
	}

	/**
	 * 
	 * @Title: 这个就是给以一个月份 返回该月的最后一天 例如:03.25 12:20:24返回03:31 23:59:59
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testGetDateByFullMonth() {
		
		Calendar c = Calendar.getInstance();
		c.set(2001, 1, 25);
		
		Date dateByFullMonth = DateUtils.getDateByFullMonth(c.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(dateByFullMonth);
		System.out.println(format);
	}

}
