package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		System.out.println("main����func1 ȣ���ϰ���");
		func1();
		System.out.println("func1 end");
		System.out.println("main����func3 ȣ���ϰ���");
		func3();
		System.out.println("func3 end");
		System.out.println("main end");
		return;
	}
	
	public static void func1(){
		System.out.println("func1����func2 ȣ���ϰ���");
		func2();
		System.out.println("func1 ȣ���������� ���ư�");
		return;
	}
	public static void func2(){
		System.out.println("func2 ������");
		System.out.println("func2 ȣ���������� ���ư�");
	}
	public static void func3(){
		System.out.println("func3 ������");
		System.out.println("func3 ȣ���� ������ ���ư�");
	}

}
