package com.hb.pm;

import java.util.Scanner;

class Student{
	int kor, eng, math;
	
	public Student() {
		kor=0;
		eng=0;
		math=0;
	}
	public Student(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	
}

public class Ex04 {
	public static int input(){
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int su = Integer.parseInt(st);
		return su;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����������α׷� ver 5.0.0");
		System.out.print("���ο�(��)>");
		int max = input();
		Student[] stu = new Student[max];
		for(int i=0; i<stu.length; i++){
			stu[i]=new Student();
		}
		boolean tf=true;
		int menu=0;
		int idx=0;
		int target=0;
		while(tf){
			System.out.print("1.�Է� 2.���� 3.���� 4.���� 0.����>");
			menu=input();
			switch (menu) {
			case 1:
				if(idx==max){
					System.out.println("���ο��� ��� �Է��ϼ̽��ϴ�");
					continue;
					}
				while(true){
					System.out.println(idx+"�й� ������");
					System.out.print("����:");
					int kor = input();
					System.out.print("����:");
					int eng = input();
					System.out.print("����:");
					int math = input();
					stu[idx]=new Student(kor,eng,math);
					idx++;
					if(idx==max){
						System.out.println("����л��� �Է��ϼ̽��ϴ�");
						break;
					}
					System.out.print("1.��� 0.�׸�>");
					if(input()==0){
						break;
					}
				}
				break;
			case 2:
				System.out.println("-----------------------------------");
				System.out.println("�й�\t����\t����\t����");
				System.out.println("-----------------------------------");
				for(int i=0; i<stu.length; i++){
					Student std=stu[i];
					System.out.println(i+"\t"+std.kor+"\t"+std.eng+"\t"+std.math);
				}
				System.out.println("-----------------------------------");
				break;
			case 3:
				System.out.print("������ �й�>");
				target = input();
				Student std=stu[target];
				System.out.print("����:"+std.kor+"-->");
				int kor = input();
				System.out.print("����:"+std.eng+"-->");
				int eng = input();
				System.out.print("����:"+std.math+"-->");
				int math = input();
				stu[target]=new Student(kor,eng,math);
				break;
			case 4:
				System.out.print("������ �й�>");
				target = input();
				stu[target]=new Student();
				break;
			case 0:
				tf=false;
				break;

			default:
				break;
			}
		}
	}

}










