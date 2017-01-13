package com.hb.pm;

public class Ex05 {

	public static void main(String[] args) {
		String st="20";
		System.out.println(st+10);// 문자열+00=문자열
		int num=Integer.parseInt(st);
		System.out.println(num+10);
		System.out.println("---------------------------");
		String input1 = args[0];
		String input2 = args[1];
		String input3 = args[2];
		
		System.out.println(input1);
		System.out.println(input2);
		System.out.println(input3);
		
	}

}
