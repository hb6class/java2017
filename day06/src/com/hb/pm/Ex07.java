package com.hb.pm;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(">");
		String input = sc.nextLine();
		if(input.equals("java")){
			System.out.println("java라고 입력하셨습니다");
		}else{
			System.out.println("java라고 입력하지 않으셨습니다");			
		}
//		int su = Integer.parseInt(input);
//		if(su==100){
//			System.out.println("java라고 입력하셨습니다");
//		}else{
//			System.out.println("java라고 입력하지 않으셨습니다");			
//		}

	}

}
