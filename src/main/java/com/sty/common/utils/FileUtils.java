package com.sty.common.utils;

import java.io.File;

public class FileUtils {

	/**
	 * 
	 * @Title: ����һ������  ���ظ��ļ�����չ��
	 * @Description: TODO
	 * @param fileName
	 * @return
	 * @return: String
	 */
	public static String getExtenName(String fileName) {
		//��ȡ�ļ��ĺ�׺��  ��Ҫ��ȡ���һ��.�Ժ���ַ�������
		String substring = fileName.substring(fileName.lastIndexOf("."));
		return substring;
	}
	
	/**
	 * 
	 * @Title: ���ظò���ϵͳ����ʱĿ¼
	 * @Description: TODO
	 * @return
	 * @return: File
	 */
	public static File getTempDirectory() {
		
		return null;
	}
	
	/**
	 * 
	 * @Title: ���ظò���ϵͳ���û�Ŀ¼
	 * @Description: TODO
	 * @return
	 * @return: File
	 */
	public static File  getUserDirectory() {
		
		return null;
	}
}
