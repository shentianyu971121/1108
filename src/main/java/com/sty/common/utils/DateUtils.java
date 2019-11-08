package com.sty.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static Date getDateByInitMonth(Date src) {
		//��ȡ������  �������ǳ����� ����ֱ��new
		Calendar c = Calendar.getInstance();
		//���ݴ�������ڹ���������
		c.setTime(src);
		//�����³�
		c.set(Calendar.DAY_OF_MONTH, 1); //��Сʱ
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}
	
	public static Date getDateByFullMonth(Date src) {
		//��ʼ����
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		
		//���·ݼ�1 c.add�������·ݼ�һ   
		c.add(Calendar.MONTH, 1);
		//�����ڱ�Ϊ�³�
		Date date = getDateByInitMonth(c.getTime());
		//�ڳ�ʼ��������
		c.setTime(date);
		//�����ڼ�ȥһ��
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	/**
	 * 
	 * @Title: ��������
	 * @Description: TODO
	 * @return: int
	 */
	public static int calculateAge(Date birthday) {
		if(birthday.compareTo(new Date()) > 0) {
			throw new RuntimeException("���������ղ��ܴ��ڵ�ǰ����" + birthday);
		}
		//�������յ�������
		Calendar c = Calendar.getInstance();
		c.setTime(birthday);
		int year = c.get(Calendar.YEAR); //�õ����������
		int month = c.get(Calendar.MONTH); //�õ��������·�
		int day = c.get(Calendar.DAY_OF_MONTH); //�õ���������
		System.out.println(" year : " + year);
		System.out.println("month : " + month);
		System.out.println("day : " + day);
		//���㵱ǰ���ڵ��� �� ��
		c.setTime(new Date());
		int dyear = c.get(Calendar.YEAR); //�õ���ǰ�����
		int dmonth = c.get(Calendar.MONTH); //�õ���ǰ���·�
		int dday = c.get(Calendar.DAY_OF_MONTH); //�õ�ǰ����
		System.out.println("dyear : " + dyear);
		System.out.println("dmonth : " + dmonth);
		System.out.println(dday);
		int age =  dyear - year;
		if(dmonth < month) {
			age--;
		} else if(dmonth == month && dday < day) {
			age--;
		}
		return age;
	}
	
}































