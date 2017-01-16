package com.hb.pm;

public class Ex03 {
	// 클래스 구성요소 두번째 필드
	public static int a=0;//전역변수(c), 클래스변수
	// 초기값을 갖음

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(a);
		Ex03.func01();
		a++;
		func02();
		func03(100);
	}
	public static void func01(){
		System.out.println("func01()-a:"+a);
	}
	public static void func02(){
		a++;
		System.out.println("func02()-a:"+a);
	}
	public static void func03(int a){
		// int a 지역변수(c), 
		// 우선순위 = 지역변수 > 전역변수
		System.out.println("func03()-a:"+Ex03.a);
	}
}
