package com.hb.am;

import java.util.Scanner;

class Student{
	int kor, eng, math; //�Ӽ�
	
	int tot(){
		return kor+eng+math;
	}
	double avg(){
		return tot()*100/3/100.0;
	}
}


public class Ex04 {

	public static void main(String[] args) {
		// �л� ���� ���� ���α׷�
		
		// 3���� �л��� ���� �Է��ϰ� - new �л� -> �л� ������
		// �̵��� �հ� ����� ����ϴ� ���α׷�
		
		System.out.println("�л� ���� ���� ���α׷� ver 2.1.0");
		System.out.println("ù��° �л� �����Է�");
		String st1=show();
		System.out.println("�ι�° �л� �����Է�");
		String st2=show();
		System.out.println("����° �л� �����Է�");
		String st3=show();		
		
		System.out.println("------------------------------------------");
		System.out.println("����\t����\t����\t�հ�\t���");
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
		System.out.print("����>");
		input = sc.nextLine();
		num=Integer.parseInt(input);
		stu.kor=num;
		System.out.print("����>");
		input = sc.nextLine();
		num=Integer.parseInt(input);
		stu.eng=num;
		System.out.print("����>");
		input = sc.nextLine();
		num=Integer.parseInt(input);
		stu.math=num;
		return stu.kor+"\t"+stu.eng+"\t"+stu.math+"\t"
				+stu.tot()+"\t"+stu.avg();
	}
	
}












