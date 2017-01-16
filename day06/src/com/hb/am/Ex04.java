package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		//	메소드의 오버로드
		String input = args[0];
		int su = Integer.parseInt(input);
		gugudan(4,6);
		System.out.println();
		System.out.println(1);
		System.out.println("aaa"+1111);
		
	}
	public static void gugudan(){
		System.out.println("2x1=2");
	}
	public static void gugudan(int su){
		System.out.println(su+"x2="+su*2);
	}
	public static void gugudan(int su, double a){
		System.out.println(su+"x"+a+"="+(su*a));
	}
	public static void gugudan(int su, int a){
		System.out.println(su+"x"+a+"="+(su*a));
	}
}
