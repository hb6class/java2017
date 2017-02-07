package com.hb.pm;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 0, 1, 11, 20);// 날짜 변경
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;		//0~11
		int d = cal.get(Calendar.DATE);
		int ap = cal.get(Calendar.AM_PM);
		int hh = cal.get(Calendar.HOUR);
		int h = cal.get(Calendar.HOUR_OF_DAY);
		int mm = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		int w= cal.get(Calendar.DAY_OF_WEEK);	//1~7
		int cntDay = cal.get(Calendar.DAY_OF_YEAR);
		int cntDW=cal.get(Calendar.DAY_OF_MONTH);
		int cntW=cal.get(Calendar.WEEK_OF_YEAR);
		int cntMW=cal.get(Calendar.WEEK_OF_MONTH);
		char[] ch1 = {'a','p'};
		char[] ch2 = {'일','월','화','수','목','금','토'};
		System.out.println(y+"년"+m+"월"+d+"일");
		System.out.println(ch1[ap]+"m "+hh+"시"+mm+"분"+ss+"초");
		System.out.println(h+"시"+mm+"분"+ss+"초");
		System.out.println(ch2[w-1]);
		System.out.println(y+"년 1월 1일부터 "+cntDay+"번째 날짜");
		System.out.println(y+"년의 "+cntW+"번째 주차입니다");
		System.out.println(m+"월의 "+cntMW+"번째 주차입니다");
		System.out.println(m+"월의 "+cntDW+"번째 일입니다");
		System.out.println("-----------------------------------");
		Calendar cal2 = Calendar.getInstance();
		if(cal.after(cal2)){ //.before(cal2)){
			System.out.println("cal은 현재보다 이후 날짜 입니다");
		}else{
			System.out.println("cal은 현재보다 이전 날짜 입니다");
		}
	}

}











