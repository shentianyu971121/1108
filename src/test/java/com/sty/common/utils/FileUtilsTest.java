package com.sty.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileUtilsTest {

	@Test
	public void test() {
		//给定一个文件名成 获取扩展名
		String extenName = FileUtils.getExtenName("abc.txt");
		System.out.println(extenName);
	}

}
