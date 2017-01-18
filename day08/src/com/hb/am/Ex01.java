package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		Ex01.func11();
		
		Ex01 me = new Ex01();
		// me라는 이름으로 객체를 하나 찍어내고
		me.func01();
		// 이러한 찍어낸 객체에 접근해서 func01이라는
		// 메소드를 찾아 실행

	}
	
	public void func01(){
		// non-static 메소드, 맴버메소드
		//static ->non-static 참조변수를 만들어 접근
		//non-static -> non-static 그냥접근
		//non-static -> static 그냥접근
		
	}
	public static void func11(){
		// static 메소드, 클래스메소드
		// 유사 - 함수
	}
}
















