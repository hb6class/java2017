package com.hb.pm;

import java.util.Calendar;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2018, 0, 1, 11, 20);// ��¥ ����
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
		char[] ch2 = {'��','��','ȭ','��','��','��','��'};
		System.out.println(y+"��"+m+"��"+d+"��");
		System.out.println(ch1[ap]+"m "+hh+"��"+mm+"��"+ss+"��");
		System.out.println(h+"��"+mm+"��"+ss+"��");
		System.out.println(ch2[w-1]);
		System.out.println(y+"�� 1�� 1�Ϻ��� "+cntDay+"��° ��¥");
		System.out.println(y+"���� "+cntW+"��° �����Դϴ�");
		System.out.println(m+"���� "+cntMW+"��° �����Դϴ�");
		System.out.println(m+"���� "+cntDW+"��° ���Դϴ�");
		System.out.println("-----------------------------------");
		Calendar cal2 = Calendar.getInstance();
		if(cal.after(cal2)){ //.before(cal2)){
			System.out.println("cal�� ���纸�� ���� ��¥ �Դϴ�");
		}else{
			System.out.println("cal�� ���纸�� ���� ��¥ �Դϴ�");
		}
	}

}











