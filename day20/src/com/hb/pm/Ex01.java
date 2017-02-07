package com.hb.pm;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Ex01 {

	public static void main(String[] args) {
		// 
//		Date date = new Date(2017-1900,1,7,12,30,11);
//		Date date = new Date("2017/1/1 12:30:33");
//		Date date = new Date(System.currentTimeMillis());
		Date date = new Date();
		int h=date.getHours();
		int mm=date.getMinutes();
		int ss=date.getSeconds();
		if(h>12){
			System.out.println("Pm "+(h-12)+"시"+mm+"분"+ss+"초");
		}else{
			System.out.println("Am"+h+"시"+mm+"분"+ss+"초");			
		}
//		date.setYear(2018-1900);
//		date.setMonth(0);
//		date.setDate(10);
		int y = 1900+date.getYear();
		int m = 1+date.getMonth();		//월 0~11
		int d = date.getDate();
		int w = date.getDay();	// 0~6 요일
		char[] ch = {'일','월','화','수','목','금','토'};
		System.out.println(y+"년"+m+"월"+d+"일" +ch[w]+"요일");
		System.out.println(System.currentTimeMillis());
		System.out.println(date.getTime());
		System.out.println("-----------------------------------");
		System.out.println(date);
//		SimpleDateFormat sdf= new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//		SimpleDateFormat sdf= new SimpleDateFormat("yy년 M월 d일 hh시 mm분 ss초");
		SimpleDateFormat sdf= new SimpleDateFormat("yy/MM/dd hh:mm:ss");
		String mat=sdf.format(date);
		System.out.println(mat);
	}

}










