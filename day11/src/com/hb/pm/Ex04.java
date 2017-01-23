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
		System.out.println("성적관리프로그램 ver 5.0.0");
		System.out.print("총인원(명)>");
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
			System.out.print("1.입력 2.보기 3.수정 4.삭제 0.종료>");
			menu=input();
			switch (menu) {
			case 1:
				if(idx==max){
					System.out.println("총인원을 모두 입력하셨습니다");
					continue;
					}
				while(true){
					System.out.println(idx+"학번 데이터");
					System.out.print("국어:");
					int kor = input();
					System.out.print("영어:");
					int eng = input();
					System.out.print("수학:");
					int math = input();
					stu[idx]=new Student(kor,eng,math);
					idx++;
					if(idx==max){
						System.out.println("모든학생을 입력하셨습니다");
						break;
					}
					System.out.print("1.계속 0.그만>");
					if(input()==0){
						break;
					}
				}
				break;
			case 2:
				System.out.println("-----------------------------------");
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("-----------------------------------");
				for(int i=0; i<stu.length; i++){
					Student std=stu[i];
					System.out.println(i+"\t"+std.kor+"\t"+std.eng+"\t"+std.math);
				}
				System.out.println("-----------------------------------");
				break;
			case 3:
				System.out.print("수정할 학번>");
				target = input();
				Student std=stu[target];
				System.out.print("국어:"+std.kor+"-->");
				int kor = input();
				System.out.print("영어:"+std.eng+"-->");
				int eng = input();
				System.out.print("수학:"+std.math+"-->");
				int math = input();
				stu[target]=new Student(kor,eng,math);
				break;
			case 4:
				System.out.print("삭제할 학번>");
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










