package com.hb.pm;

public class Ex01 {
	// �޼ҵ�
	// return (o) = �ڷ��� �޼ҵ��(����){return o;}
	// return (x) = void �޼ҵ��(����){}
	public static void func(String name){
		System.out.println(prnt(name));
//		return;
	}
	
	public static String prnt(String name){ //�޼ҵ�
		return name;
	}

	public static void main(String[] args) {
		// helloWorld
		String prn="hello Java";
		func(prn);
		return;
	}
	

}
