package com.hb.pm;

public class Ex01 {
	public int a;	// �ʵ�
	
	Ex01(){	//������ (��ü�� ���� ����)
		// Ŭ������(){}
		// return (x)
		// �޼ҵ���� ū ������
		// ��ü�����ÿ� ���ѹ� ����
		a=100;
	}
	Ex01(int a){
		// �����ε� ����
		this.a=a;
	}
	Ex01(int a, int b){
		
	}
	Ex01(String st){
		System.out.println(st);
	}
	
	public static void main(String[] args) {
		// Ŭ����
		// 1. �ʵ�
		// 2. �޼ҵ�
		// 3. ������
		
		Ex01 me = new Ex01();
//		System.out.println(me.a);
		int a =me.func();
		System.out.println("a:"+a);
	}
	
	public int func(){	//�޼ҵ�
		return func(0);
	}
	
	public int func(int a){
		return func(a,10);
	}
	public int func(int a, int b){
		return a+b;
	}

}
