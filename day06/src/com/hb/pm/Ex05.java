package com.hb.pm;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// �л����� ���α׷�
		System.out.println("�л����� ���α׷� ver 1.0.1");
		System.out.println("----------------------------------");
		Scanner sc = new Scanner(System.in);	// �غ�
		
		System.out.print("����:");
		String input1=sc.nextLine();	// sc.nextLine();
		System.out.print("����:");
		String input2=sc.nextLine();
		System.out.print("����:");
		String input3=sc.nextLine();
		
		int kor, eng, math, sum;
		kor = Integer.parseInt(input1);
		eng = Integer.parseInt(input2);
		math = Integer.parseInt(input3);
		sum= kor+eng+math;
		
		System.out.println("----------------------------------");
		System.out.println("����\t����\t����\t�հ�");
		System.out.println("----------------------------------");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+sum);
		System.out.println("----------------------------------");
		
	}

}
