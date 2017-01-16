package com.hb.pm;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args){
		// 구구단을 출력하시오
		System.out.println("원하시는 구구단을 입력하세요");
		System.out.print(">");
		Scanner sc = new Scanner(System.in);
		// 준비
		String input=sc.nextLine();	// 입력수행
		int su = Integer.parseInt(input);
		System.out.println(input+"단");
		for(int i=1; i<10; i++){
			System.out.println(input+"x"+i+"="+su*i);
		}
	}

}














