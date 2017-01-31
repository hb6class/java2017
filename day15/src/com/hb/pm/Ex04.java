package com.hb.pm;

// 상속 불가
//final class Son04{
class Son04{
	// 값의 수정불가
	final double PY = 3.14;
 
 // final 메소드 - 오버라이드 불가
	final void func01(){
	 System.out.println("java");
	}
}

public class Ex04 extends Son04{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex04 me = new Ex04();
		System.out.println(me.PY);
//		me.PY=3.333;
		me.func01();
	}
//	void func01() {
//		// TODO Auto-generated method stub
//
//	}

}
