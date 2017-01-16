package com.hb.pm;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 학생성적 프로그램
		System.out.println("학생성적 프로그램 ver 1.0.1");
		System.out.println("----------------------------------");
		Scanner sc = new Scanner(System.in);	// 준비
		
		System.out.print("국어:");
		String input1=sc.nextLine();	// sc.nextLine();
		System.out.print("영어:");
		String input2=sc.nextLine();
		System.out.print("수학:");
		String input3=sc.nextLine();
		
		int kor, eng, math, sum;
		kor = Integer.parseInt(input1);
		eng = Integer.parseInt(input2);
		math = Integer.parseInt(input3);
		sum= kor+eng+math;
		
		System.out.println("----------------------------------");
		System.out.println("국어\t영어\t수학\t합계");
		System.out.println("----------------------------------");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+sum);
		System.out.println("----------------------------------");
		
	}

}
