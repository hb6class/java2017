package com.hb.pm;

// ��� �Ұ�
//final class Son04{
class Son04{
	// ���� �����Ұ�
	final double PY = 3.14;
 
 // final �޼ҵ� - �������̵� �Ұ�
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
