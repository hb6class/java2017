package com.hb.pm;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 성적관리프로그램 ver 3.0.0
		//
		//	국어, 영어, 수학 int
		// 학생 30명의 성적 관리 프로그램
		// 1.입력 2.보기 3.수정 0.종료
//		int[] score = new int[3];
		Scanner sc = new Scanner(System.in);
		int[][] stu = new int[5][3];
		String input="";
		int num=0;
		int cnt=160001;
		while(true){
		System.out.print("1.입력 2.보기 3.수정 0.종료>");
		input=sc.nextLine();
		num=Integer.parseInt(input);
			if(num==1){
				// 1.입력
				while(true){
					if(cnt!=160001){
						System.out.println("기존 입력이 있습니다");
						System.out.print("이어서 계속(1) , 처음부터(2)");
						input=sc.nextLine();
						num=Integer.parseInt(input);
						if(num==2){
							stu = new int[5][3];
							cnt=160001;
						}
					}
					System.out.println(cnt+"학번 학생");
					System.out.print("국어:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					stu[cnt-160001][0]=num;
					System.out.print("영어:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					stu[cnt-160001][1]=num;
					System.out.print("수학:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					stu[cnt-160001][2]=num;
					cnt++;
					System.out.print("1.계속 2.그만");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					if(num==2){break;}
				}
			}else if(num==2){
				// 2.보기
				System.out.println("학번\t국어\t영어\t수학");
				for(int m=0; m<stu.length; m++){
						System.out.print(m+160001+"\t");
					for(int n=0; n<stu[m].length; n++){
						System.out.print(stu[m][n]+"\t");
					}
					System.out.println();			
				}
			}else if(num==3){
				// 3.수정
				input=sc.nextLine();
				int nm=Integer.parseInt(input);
				System.out.println(nm+"학번 학생");
				System.out.print("국어:");
				input=sc.nextLine();
				num=Integer.parseInt(input);
				stu[nm-160001][0]=num;
				System.out.print("영어:");
				input=sc.nextLine();
				num=Integer.parseInt(input);
				stu[nm-160001][1]=num;
				System.out.print("수학:");
				input=sc.nextLine();
				num=Integer.parseInt(input);
				stu[nm-160001][2]=num;
			}else if(num==0){
				// 0.종료
				System.out.println("감사합니다");
				break;
			}
		}
	}

}
