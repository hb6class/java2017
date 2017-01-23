package com.hb.pm;

public class Ex01 {
	public int a;	// 필드
	
	Ex01(){	//생성자 (객체의 생성 관여)
		// 클래스명(){}
		// return (x)
		// 메소드와의 큰 차이점
		// 객체생성시에 단한번 수행
		a=100;
	}
	Ex01(int a){
		// 오버로드 가능
		this.a=a;
	}
	Ex01(int a, int b){
		
	}
	Ex01(String st){
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		// 클래스
		// 1. 필드
		// 2. 메소드
		// 3. 생성자
		
		Ex01 me = new Ex01();
//		System.out.println(me.a);
		int a =me.func();
		System.out.println("a:"+a);
	}
	
	public int func(){	//메소드
		return func(0);
	}
	
	public int func(int a){
		return func(a,10);
	}
	public int func(int a, int b){
		return a+b;
	}

}
