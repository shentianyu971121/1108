package com.sty.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilsTest {

	/**
	 * 
	 * @Title: ����һ������ ���ظ����ڵĵ�һ�� ����10.25 12:25:35 ����10.01 00:00:00
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
	 * @Title: ������Ǹ���һ���·� ���ظ��µ����һ�� ����:03.25 12:20:24����03:31 23:59:59
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
