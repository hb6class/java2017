package com.hb.am;

public class Ex01 {
	int a;
	static int b;

	public void func(int c){
		a+=c;
		b+=c;
	}
	public static void main(String[] args) {
		Ex01 me1 = new Ex01();
		me1.func(2);
		System.out.println("a:"+me1.a+", b:"+me1.b);
		me1.func(2);
		System.out.println("a:"+me1.a+", b:"+me1.b);
		me1= new Ex01();
		me1.func(2);
		System.out.println("a:"+me1.a+", b:"+me1.b);
	}

}
