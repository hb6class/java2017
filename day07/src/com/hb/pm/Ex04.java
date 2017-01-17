package com.hb.pm;

public class Ex04 {
	public static int a=1111;
	public int b=2222;

	public static void main(String[] args) {
		// 맴버메소드, non-static메소드
		// non-static메소드 -> non-static메소드,필드(바로가능)
		// static메소드 -> static메소드,변수(바로가능)
		// static메소드 -> non-static메소드,필드(참조변수를 통해서만)
		
		Ex04 me = new Ex04(); // 참조변수생성
		me.func01();
		Ex04 me2= new Ex04();
		int num=me2.func03();
		System.out.println(num);
	}
	public static void func02(){
		Ex04 me = new Ex04();
		me.func01();
		System.out.println("func02()실행");
		
	}
	public int func03(){
		return a;
	}
	public void func01(){
		System.out.println("func01()실행"+func03());
	}
}
