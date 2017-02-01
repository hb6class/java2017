package com.hb.am;

abstract class Parents{	
	//추상클래스
	// 추상메소드를 0개 이상 갖는 클래스
	int num;
	
	public Parents() {
		func02();
	}
	
	void func01(){
		func02();
		System.out.println("parents class - func01()");
	}
	
	// 추상메소드 - 메소드 선언만, 구현x
	abstract void func02(); 
//	static abstract void func03(); 
//	abstract void func04(); 
}

public class Ex01 extends Parents{

	public static void main(String[] args) {
		// 상속
		// 추상클래스
		// 인터페이스
		Ex01 me = new Ex01();
//		me.func01();
	}

	@Override
	void func02() {
		// TODO Auto-generated method stub
		
	}


}
