package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("main에서func1 호출하겠음");
		func1();
		System.out.println("func1 end");
		System.out.println("main에서func3 호출하겠음");
		func3();
		System.out.println("func3 end");
		System.out.println("main end");
		return;
	}
	
	public static void func1(){
		System.out.println("func1에서func2 호출하겠음");
		func2();
		System.out.println("func1 호출한쪽으로 돌아감");
		return;
	}
	public static void func2(){
		System.out.println("func2 실행중");
		System.out.println("func2 호출한쪽으로 돌아감");
	}
	public static void func3(){
		System.out.println("func3 실행중");
		System.out.println("func3 호출한 쪽으로 돌아감");
	}

}
