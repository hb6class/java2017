package com.hb.am;

class Ex22{
	static int a=100;
	int b=1000;
	void func(int b){
		System.out.println("this :"+this);
		this.b=this.b+b;
	}
	static void plus(int a){
		Ex22.a=Ex22.a+a;
	}
}

public class Ex02 {
	static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex22 you = null;
		you = new Ex22();
		System.out.println("main :"+you);
		you.func(300);
		System.out.println("b:"+you.b);
		
		Ex22.plus(20);
		System.out.println("a:"+Ex22.a);
	}

}
