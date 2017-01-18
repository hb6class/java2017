package com.hb.am;

import java.util.Scanner;

class Student{
	int kor, eng, math; //속성
	
	int tot(){
		return kor+eng+math;
	}
	double avg(){
		return tot()*100/3/100.0;
	}
}


public class Ex04 {

	public static void main(String[] args) {
		// 학생 성적 관리 프로그램
		
		// 3명의 학생의 성적 입력하고 - new 학생 -> 학생 성적줌
		// 이들의 합계 평균을 출력하는 프로그램
		
		System.out.println("학생 성적 관리 프로그램 ver 2.1.0");
		System.out.println("첫번째 학생 성적입력");
		String st1=show();
		System.out.println("두번째 학생 성적입력");
		String st2=show();
		System.out.println("세번째 학생 성적입력");
		String st3=show();		
		
		System.out.println("------------------------------------------");
		System.out.println("국어\t영어\t수학\t합계\t평균");
		System.out.println("------------------------------------------");
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println("------------------------------------------");
	}
	
	public static String show(){
		Scanner sc = new Scanner(System.in);
		String input="";
		int num;
		Student stu;
		stu= new Student();
		System.out.print("국어>");
		input = sc.nextLine();
		num=Integer.parseInt(input);
		stu.kor=num;
		System.out.print("영어>");
		input = sc.nextLine();
		num=Integer.parseInt(input);
		stu.eng=num;
		System.out.print("수학>");
		input = sc.nextLine();
		num=Integer.parseInt(input);
		stu.math=num;
		return stu.kor+"\t"+stu.eng+"\t"+stu.math+"\t"
				+stu.tot()+"\t"+stu.avg();
	}
	
}












