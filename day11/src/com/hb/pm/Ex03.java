package com.hb.pm;

public class Ex03 {
	int a;
	
	public Ex03() {
		this(100);
		System.out.println("Ex03() run");
	}
	public Ex03(int a) {
		this.a=a;
		System.out.println("Ex03(int a) run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 me = new Ex03();
		System.out.println(me.a);
	}

}
