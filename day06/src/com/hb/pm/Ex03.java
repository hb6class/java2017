package com.hb.pm;

public class Ex03 {
	// Ŭ���� ������� �ι�° �ʵ�
	public static int a=0;//��������(c), Ŭ��������
	// �ʱⰪ�� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(a);
		Ex03.func01();
		a++;
		func02();
		func03(100);
	}
	public static void func01(){
		System.out.println("func01()-a:"+a);
	}
	public static void func02(){
		a++;
		System.out.println("func02()-a:"+a);
	}
	public static void func03(int a){
		// int a ��������(c), 
		// �켱���� = �������� > ��������
		System.out.println("func03()-a:"+Ex03.a);
	}
}
