package com.hb.am;

class Father2 extends Object{
	int money;
	public Father2(int su) {
		super();
		money=su;
	}
}
class Son2 extends Father2{
	public Son2() {
		this(20000);
	}
	public Son2(int su) {
		super(su);
	}
	void show(){
		System.out.println(money);
	}
}

public class Ex02 extends Object{

	public static void main(String[] args) {
		Son2 man= new Son2();
		man.show();
		Ex02 me = new Ex02();
		boolean tf=me.equals(man);
		System.out.println(tf);
		Object obj = new Object();
	}

}













