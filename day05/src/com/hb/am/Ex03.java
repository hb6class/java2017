package com.hb.am;

public class Ex03 {
	// Ŭ������ �⺻ �������
	// 1.�޼ҵ� <---
	// 2.�ʵ�
	// 3.������
	
	public static void func(boolean tf){ // func()�޼ҵ�
		System.out.println(tf);
	} //func() end
	
	public static void func(int a){ // func()�޼ҵ�
		
		for(int i=0; i<5; i++){
			System.out.println(a);
		} //for end
		
	} //func() end
	
	public static void main(String[] args) {
		int func=1;
		func(true); // �޼ҵ� ȣ��, �������� Ÿ�� ��ġ
		System.out.println(func);
		
	} // main end

} //class end
