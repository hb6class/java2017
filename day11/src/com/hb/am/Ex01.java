package com.hb.am;

import java.util.Scanner;

class Ex11{
	public static void main(String[] args) {
		System.out.println("Ex11");
	}
}
class Ex111{
	public static void main(String[] args) {
		System.out.println("Ex111");		
	}
}

public class Ex01 {
	static int a=10;
	int b=10;

	public static void main(String[] args) {
		// 1.�޼ҵ�
		// 2.�ʵ�(Ŭ��������, �����ʵ�)
		// 	static , non-static
		
		// static - class��.�޼ҵ��();
		// non-static
		// 		- �ڷ��� �������� = new Ŭ������();
		//		- ��������.�޼ҵ��();
		
//		java.util.Scanner sc = new java.util.Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		com.hb.am.Ex01.func01();
		com.hb.am.Ex01 me=new com.hb.am.Ex01();
		me.func02();
		Ex01.func01();
		System.out.println(Ex01.a++);
		System.out.println(me.b++);
		me = new Ex01();
		System.out.println(Ex01.a);
		System.out.println(me.b);
		
		// �������� (��ü�� �ּҰ� && Ŭ���� ���� && ...)
		// 0x0000~0xffff
		// �������� = ���ú���
		// ����
		Ex01 me2;
		// �ʱ�ȭ
		me2 = null;
		me2 = new Ex01();
//		Ex01 me2 = new Ex01();
		System.out.println(me2);
		me2.func02();
		
		// 3.�迭

	}
	public static void func01(){
		System.out.println("����ƽ �޼ҵ�");
	}
	public void func02(){
		System.out.println("non-static");
	}
}
