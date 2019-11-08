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
	
	
}































