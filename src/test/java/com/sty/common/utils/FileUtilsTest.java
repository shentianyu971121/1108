package com.sty.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void test() {
		//����һ���ļ����� ��ȡ��չ��
		String extenName = FileUtils.getExtenName("abc.txt");
		System.out.println(extenName);
	}

}
