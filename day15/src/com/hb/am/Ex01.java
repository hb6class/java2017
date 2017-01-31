package com.hb.am;
// 상속 class class명 extends 부모클래스명
// 오직 하나의 클래스는 상속가능
// 상속의 대상 - static, 맴버필드, 맴버메소드(non-static)
// 상속의 대상(객체) - 맴버필드, 맴버메소드(non-static)

class Father{
	int money=3000;
	static int su1=200;
	void showMeTheMoney(){
		System.out.println(money+"원");
	}
}

class Son extends Father{ 
//	int money=700;
	void addMoney(int su){
		money+=su;
	}
	// 오버라이드 - 메소드의 재정의
	void showMeTheMoney(){
		System.out.println("상속받은 돈은 "+super.money);
		System.out.println("내가 돈은 ＄"+this.money);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father man = new Father();
		Son man2 = new Son();
		System.out.println(man.money);
		System.out.println(man2.money);
		man.showMeTheMoney();
		man2.showMeTheMoney();
		
	}

}
