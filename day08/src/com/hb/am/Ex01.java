package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		Ex01.func11();
		
		Ex01 me = new Ex01();
		// me��� �̸����� ��ü�� �ϳ� ����
		me.func01();
		// �̷��� �� ��ü�� �����ؼ� func01�̶��
		// �޼ҵ带 ã�� ����

	}
	
	public void func01(){
		// non-static �޼ҵ�, �ɹ��޼ҵ�
		//static ->non-static ���������� ����� ����
		//non-static -> non-static �׳�����
		//non-static -> static �׳�����
		
	}
	public static void func11(){
		// static �޼ҵ�, Ŭ�����޼ҵ�
		// ���� - �Լ�
	}
}
















