package com.hb.pm;

public class Ex02 {
	final double py;// ����� ����
	
	Ex02(){
		py=3.14;
		// 1. ��ü ���� �� �� �ѹ� �����ϰ� ���� ��
		// 1.1 �ʵ尪�� �ʱ�ȭ
		System.out.println("������ ȣ��");
		func01();
	}
	
	public void func01(){
		System.out.println("�޼ҵ� ����");
	}
	
	public static void main(String[] args) {
		int a=100;
		Ex02 me = new Ex02();
		System.out.println(me.py);
	}

}
