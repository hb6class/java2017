package com.hb.pm;

class Parents{	
	// �θ�Ŭ����, superŬ����, ���� Ŭ����, �⺻Ŭ����
	int num=100;
	
	void func01(){
		num+=10;
	}
//	void func01(int a){}
}

public class Ex02 extends Parents { 
	// �ڽ� Ŭ����, ���� Ŭ����, ����Ŭ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 me = new Ex02();
		System.out.println(me.num);
		me.func01(50);
		System.out.println(me.num);
		
	}
	
//	@Override	// @������̼�, �Ծ�
	void func01(int su) {
		super.func01();
		System.out.println(su+"�� ���� ���ϰ���");
	}
}














