package com.hb.pm;

class Son01{
	protected int num=1000;// default-������Ű�� ���ο����� ���� ���
	final int num2=111;
}

public class Ex01 extends Son01 {

	public static void main(String[] args) {
		// ����������
		// public 
		// protected - ����� ��쿡�� �������
		// default
		// private
//		public > protected > default > private
		
//		com.hb.am.Ex06 me06 = new com.hb.am.Ex06();
//		System.out.println(me06.num);
//		me06.func01();
//		me06.func02();
		Ex01 me = new Ex01();
		System.out.println(me.num);
		System.out.println(me.num2);
		me.num=10;
//		me.num2=10;
		System.out.println(me.num);
		System.out.println(me.num2);
		
//		me.func02();
	}

}
