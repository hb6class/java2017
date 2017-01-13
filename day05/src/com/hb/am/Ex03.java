package com.hb.am;

public class Ex03 {
	// 클래스의 기본 구성요소
	// 1.메소드 <---
	// 2.필드
	// 3.생성자
	
	public static void func(boolean tf){ // func()메소드
		System.out.println(tf);
	} //func() end
	
	public static void func(int a){ // func()메소드
		
		for(int i=0; i<5; i++){
			System.out.println(a);
		} //for end
		
	} //func() end
	
	public static void main(String[] args) {
		int func=1;
		func(true); // 메소드 호출, 인자유무 타입 일치
		System.out.println(func);
		
	} // main end

} //class end
