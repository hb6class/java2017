package com.hb.am;

import java.util.Scanner;

class Ex11{
	public static void main(String[] args) {
		System.out.println("Ex11");
	}
}
class Ex111{
	public static void main(String[] args) {
		System.out.println("Ex111");		
	}
}

public class Ex01 {
	static int a=10;
	int b=10;

	public static void main(String[] args) {
		// 1.메소드
		// 2.필드(클래스변수, 전역필드)
		// 	static , non-static
		
		// static - class명.메소드명();
		// non-static
		// 		- 자료형 참조변수 = new 클래스명();
		//		- 참조변수.메소드명();
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		com.hb.am.Ex01.func01();
		com.hb.am.Ex01 me=new com.hb.am.Ex01();
		me.func02();
		Ex01.func01();
		System.out.println(Ex01.a++);
		System.out.println(me.b++);
		me = new Ex01();
		System.out.println(Ex01.a);
		System.out.println(me.b);
		
		// 참조변수 (객체의 주소값 && 클래스 정보 && ...)
		// 0x0000~0xffff
		// 지역변수 = 로컬변수
		// 선언
		Ex01 me2;
		// 초기화
		me2 = null;
		me2 = new Ex01();
//		Ex01 me2 = new Ex01();
		System.out.println(me2);
		me2.func02();
		
		// 3.배열

	}
	public static void func01(){
		System.out.println("스테틱 메소드");
	}
	public void func02(){
		System.out.println("non-static");
	}
}
