package com.hb.pm;

public class Ex02 {
	final double py;// 상수형 변수
	
	Ex02(){
		py=3.14;
		// 1. 객체 생성 때 단 한번 수행하고 싶은 일
		// 1.1 필드값의 초기화
		System.out.println("생성자 호출");
		func01();
	}
	
	public void func01(){
		System.out.println("메소드 실행");
	}
	
	public static void main(String[] args) {
		int a=100;
		Ex02 me = new Ex02();
		System.out.println(me.py);
	}

}
