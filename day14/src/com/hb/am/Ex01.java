package com.hb.am;

public class Ex01 {
	public static void main(String[] args) {
		// 래퍼클래스
//		int a=1;// 기본자료형 , 원시자료형
//		Integer
		int a=100;
		Integer b = new Integer(a);
		Integer c = new Integer("100");
		
		int j = b.intValue()+c.intValue();//언래핑->기본 연산->
		Integer d = j;	// 오토래핑 
		
		Integer i = b+c;
		
		Integer m = c;
		int n =c.intValue();//언래핑
		System.out.println(a);
		System.out.println(b.intValue());
		System.out.println(c);
		System.out.println(d);
		System.out.println(2+"의 2진수:"+Integer.toBinaryString(b));
		System.out.println(2+"의 8진수:"+Integer.toOctalString(b));
		System.out.println(2+"의 16진수:"+Integer.toHexString(b));
		System.out.println("int자료형의 최대값은 "+(Integer.MAX_VALUE));
		System.out.println("int자료형의 최대값은 "+(Integer.MIN_VALUE));
		System.out.println("int자료형의 크기는"+(Integer.SIZE));
		System.out.println(b.equals(c));
		System.out.println(Integer.parseInt("1111")+1);
		System.out.println(b.doubleValue());
		
	}
}











