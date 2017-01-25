package com.hb.am;

public class Ex03 {

	public static void main(String[] args) {
		// 문자열
		// 문자열 = 문자 집합
		String[] sts = new String[1];
		System.out.println(sts[0]);
		String st0 = null;//"";
		String st1 = "java";
		String st2 = new String("java");
		char[] ch3 = {'j','a','v','a'};
		String st3 = new String(ch3);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println("java".length());
		Ex03 me = new Ex03();
		Ex03 me2 = me;
	}

}
