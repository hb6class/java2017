package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
		// a=20, b=15, c=30
		
		// Q1.sort(a, b, c);
		// 오름차순으로 정렬
		// prnt(a,b,c);
		
		// Q2.값의 치환을 통해
		// 오름차순으로 정렬
		// System.out.println(a+"<"+b+"<"+c);
		int a = 20;
		int b = 15;
		int c = 30;
		sort(a,b,c);
		int tmp=0;
		if(a>b){
			tmp=a;
			a=b;
			b=tmp;
		}
		if(a>c){
			tmp=a;
			a=c;
			c=tmp;
		}
		if(b>c){
			tmp=b;
			b=c;
			c=tmp;
		}
		
		System.out.println(a+"<"+b+"<"+c);
	}
	public static void sort(int a, int b, int c){	// 정렬
//		if(a<b && a<c){
//			if(b<c){
//				prnt(a,b,c);
//			}else{
//				prnt(a,c,b);
//			}
//		}else if(b<a && b<c){
//			if(a<c){
//				prnt(b,a,c);
//			}else{
//				prnt(b,c,a);
//			}
//		}else{
//			if(a<b){
//				prnt(c,a,b);
//			}else{
//				prnt(c,b,a);
//			}
//		}
		if(a<b && a<c && b<c){
				prnt(a,b,c);
		}else if(a<b && a<c && c<b){
				prnt(a,c,b);
		}else if(b<a && b<c && a<c){
				prnt(b,a,c);
		}else if(b<a && b<c && c<a){
				prnt(b,c,a);
		}else if(c<a && c<b && a<b){
				prnt(c,a,b);
		}else{
				prnt(c,b,a);
		}
	}
	
	public static void prnt(int a, int b, int c){	//출력
		System.out.println(a+"<"+b+"<"+c);
	}

}









