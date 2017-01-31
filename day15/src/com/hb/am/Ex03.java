package com.hb.am;

class Father3{
	int money;
	public Father3() {
		money=1000;
	}
	void func01(){
		System.out.println(money+"원");
	}
}

class Son33 extends Father3{
	void func01(){//오버라이드
		System.out.println("￦"+money);
	}
}

class Son3 extends Father3{
	void func01(){//오버라이드
		System.out.println("＄"+money);
	}
	void func02(){
		System.out.println(money);
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// 자바의 장점:다형성
		Father3 man1=null;
		man1 = new Son3();
		man1.func01();
	}

}








