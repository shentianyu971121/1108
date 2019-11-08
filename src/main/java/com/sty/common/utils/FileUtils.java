package com.sty.common.utils;

import java.io.File;

public class FileUtils {

	/**
	 * 
	 * @Title: 给定一个方法  返回该文件的扩展名
	 * @Description: TODO
	 * @param fileName
	 * @return
	 * @return: String
	 */
	public static String getExtenName(String fileName) {
		//获取文件的后缀名  需要截取最后一个.以后的字符串名字
		String substring = fileName.substring(fileName.lastIndexOf("."));
		return substring;
	}
	
	/**
	 * 
	 * @Title: 返回该操作系统的临时目录
	 * @Description: TODO
	 * @return
	 * @return: File
	 */
	public static File getTempDirectory() {
		System.getProperty("");
		return null;
	}
	
	/**
	 * 
	 * @Title: 返回该操作系统的用户目录
	 * @Description: TODO
	 * @return
	 * @return: File
	 */
	public static File  getUserDirectory() {
		
		return null;
	}
	
	
	
	
	
}
