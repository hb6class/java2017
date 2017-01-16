package com.hb.am;

public class Ex05 {

	public static void main(String[] args) {
		gugudan();
		return;
	}
	public static void gugudan(){
//		System.out.println(2+"x"+1);
		gugudan(2);
	}
	
	public static void gugudan(int a){
//		System.out.println(a+"x"+1);
		gugudan(a,1);
	}
	
	public static void gugudan(int a,int b){
		System.out.println(a+"x"+b);
	}
}








