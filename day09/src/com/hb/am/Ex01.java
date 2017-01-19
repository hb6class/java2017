package com.hb.am;

public class Ex01 {

	public static void main(String[] args) {
		// 배열 - 자료(정보)
		// 자료형 변수명
		int a1=1;
		int a2=2;
		int a3=3;
		int a4=4;
		int a5=5;
		
//		for(int i=1; i<6; i++){
//			System.out.println(ai);
//		}
		
		// 배열 - 선언, 초기화
//		선언: 자료형[] 배열명 = new 자료형[변수 갯수];
//		int[] b= new int[5]; // 배열의 선언
		
//		초기화: 배열명[인덱스] = 값;
//		인덱스: 숫자, 반드시 0부터 시작 ~ 변수갯수-1
//		b[0]=1;	
//		b[1]=20;
//		b[2]=35;
//		b[3]=41;
//		b[4]=15;
		
//		int[] b= new int[5]{1,20,35,41,15};
//		배열의 선언 초기화를 동시에
//		int[] b= new int[]{1,20,35,41,15};
		int[] b={1,20,35,41,15};
		
		
		
//		for(int i=0; i<5; i++){// 배열의 초기화
//			b[i]=i+1;
//		}
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);
//		System.out.println(b[3]);
//		System.out.println(b[4]);
		for(int i=0; i<5; i++){
			System.out.println(b[i]);
		}
		
	}

}









