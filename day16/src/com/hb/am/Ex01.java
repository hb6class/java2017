package com.hb.am;

abstract class Parents{	
	//�߻�Ŭ����
	// �߻�޼ҵ带 0�� �̻� ���� Ŭ����
	int num;
	
	public Parents() {
		func02();
	}
	
	void func01(){
		func02();
		System.out.println("parents class - func01()");
	}
	
	// �߻�޼ҵ� - �޼ҵ� ����, ����x
	abstract void func02(); 
//	static abstract void func03(); 
//	abstract void func04(); 
}

public class Ex01 extends Parents{

	public static void main(String[] args) {
		// ���
		// �߻�Ŭ����
		// �������̽�
		Ex01 me = new Ex01();
//		me.func01();
	}

	@Override
	void func02() {
		// TODO Auto-generated method stub
		
	}


}
