package com.hb.pm;

public class Ex03 {

	public static void main(String[] args) {
		// 메소드 4가지 기능
		// +, -, x, /
		// 100+10=110
		// 100-10=90
		// 100*10=1000
		// 100/10=10
		int a, b;
		a=100;
		b=10;
		System.out.println(a+"+"+b+"="+func(a,b,'+'));
		System.out.println(a+"-"+b+"="+func(a,b,'-'));
		System.out.println(a+"×"+b+"="+func(a,b,'×'));
		System.out.println(a+"÷"+b+"="+func(a,b,'÷'));
	}
	public static int func(int a, int b, char ch){
		int c=0;
		if(ch=='+'){
			c=a+b;
		}else if(ch=='-'){
			c=a-b;
		}else if(ch=='×'){
			c=a*b;
		}else{
			c=a/b;
		}
		return c;
		
	}

}
