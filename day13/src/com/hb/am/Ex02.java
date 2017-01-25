package com.hb.am;

class Ex22{
	public void func01(){
//		System.out.println(Ex02.a);
		Ex02 you = Ex02.func02();
//		System.out.println(you.b);
		you.func01();
	}
}

public class Ex02 { //private (x)
	private static int a=100;
	private int b=111;
	private Ex02() {
		// TODO Auto-generated constructor stub
	}
	static Ex02 func02(){
		return new Ex02();
	}
	public static void main(String[] args) {
		// public > >private
		System.out.println(Ex02.a);
		Ex02 me = new Ex02();
		System.out.println(me.b);
	}
	public void func01(){
		System.out.println(Ex02.a);
		System.out.println(b);		
	}

}
