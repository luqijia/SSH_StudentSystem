package com.action;

import java.io.UnsupportedEncodingException;

public class MyTools {
	public static int strToint(String str){			//��String������ת��Ϊint�����ݵķ���
		if(str==null||str.equals(""))
			str="0";
		int i=0;
		try{
			i=Integer.parseInt(str);
		}catch(NumberFormatException e){
			i=0;
			e.printStackTrace();
		}
		return i;		
	}
	public static float strToFloat(String str){			//��String������ת��Ϊfloat�����ݵķ���
		if(str==null||str.equals(""))
			str="0";
		float f=0.0f;
		try{
			f=Float.parseFloat(str);
		}catch(NumberFormatException e){
			f=0.0f;
			e.printStackTrace();
		}
		return f;		
	}
	public static String toChinese(String str){		//����ת������ķ���
		if(str==null)
			str="";
		try {
			str=new String(str.getBytes("ISO-8859-1"),"gb2312");
		} catch (UnsupportedEncodingException e) {
			str="";
			e.printStackTrace();
		}
		return str;
	}
}