package com.hb.pm;

public class Ex04 {
	public static int a=1111;
	public int b=2222;

	public static void main(String[] args) {
		// �ɹ��޼ҵ�, non-static�޼ҵ�
		// non-static�޼ҵ� -> non-static�޼ҵ�,�ʵ�(�ٷΰ���)
		// static�޼ҵ� -> static�޼ҵ�,����(�ٷΰ���)
		// static�޼ҵ� -> non-static�޼ҵ�,�ʵ�(���������� ���ؼ���)
		
		Ex04 me = new Ex04(); // ������������
		me.func01();
		Ex04 me2= new Ex04();
		int num=me2.func03();
		System.out.println(num);
	}
	public static void func02(){
		Ex04 me = new Ex04();
		me.func01();
		System.out.println("func02()����");
		
	}
	public int func03(){
		return a;
	}
	public void func01(){
		System.out.println("func01()����"+func03());
	}
}
