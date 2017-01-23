package com.hb.am;

import java.util.Scanner;

class Student{
	int kor, eng, math;	
}

public class Ex05 {

	public static void main(String[] args) {
		// 성적관리프로그램 ver 4.0.0
		Student[] stu = new Student[3];
		System.out.println("성적관리프로그램 ver 4.0.0");
		int menu=0;
		int idx=0;
		while(true){
			System.out.print("1.입력 2.보기 3.수정 0.종료>");
			menu=input();
			if(menu==1){
				if(idx==stu.length){
					System.out.println("더이상 입력하실 수 없습니다");
					continue;
				}
				System.out.print("국어:");
				int kor = input();
				System.out.print("영어:");
				int eng = input();
				System.out.print("수학:");
				int math = input();
				stu[idx]=new Student();
				stu[idx].kor=kor;
				stu[idx].eng=eng;
				stu[idx].math=math;
				idx++;
			}else if(menu==2){
				if(idx<stu.length){
					System.out.println("성적을 모두 입력하셔야지만 볼 수 있습니다");
					continue;
				}
				System.out.println("학번\t국어\t영어\t수학");
				System.out.println("------------------------------");
				for(int i=0; i<stu.length; i++){
					System.out.print(i+"\t");
					System.out.print(stu[i].kor+"\t");
					System.out.print(stu[i].eng+"\t");
					System.out.println(stu[i].math);
				}
			}else if(menu==3){
				
			}else if(menu==0){
				break;
			}else{
				System.out.println("입력 범위를 확인하세요");
			}
		}
	}
	public static int input(){
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		int su = Integer.parseInt(tmp);
		return su;
	}

}
