package com.hb.pm;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// �����������α׷� ver 3.0.0
		//
		//	����, ����, ���� int
		// �л� 30���� ���� ���� ���α׷�
		// 1.�Է� 2.���� 3.���� 0.����
//		int[] score = new int[3];
		Scanner sc = new Scanner(System.in);
		int[][] stu = new int[5][3];
		String input="";
		int num=0;
		int cnt=160001;
		while(true){
		System.out.print("1.�Է� 2.���� 3.���� 0.����>");
		input=sc.nextLine();
		num=Integer.parseInt(input);
			if(num==1){
				// 1.�Է�
				while(true){
					if(cnt!=160001){
						System.out.println("���� �Է��� �ֽ��ϴ�");
						System.out.print("�̾ ���(1) , ó������(2)");
						input=sc.nextLine();
						num=Integer.parseInt(input);
						if(num==2){
							stu = new int[5][3];
							cnt=160001;
						}
					}
					System.out.println(cnt+"�й� �л�");
					System.out.print("����:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					stu[cnt-160001][0]=num;
					System.out.print("����:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					stu[cnt-160001][1]=num;
					System.out.print("����:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					stu[cnt-160001][2]=num;
					cnt++;
					System.out.print("1.��� 2.�׸�");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					if(num==2){break;}
				}
			}else if(num==2){
				// 2.����
				System.out.println("�й�\t����\t����\t����");
				for(int m=0; m<stu.length; m++){
						System.out.print(m+160001+"\t");
					for(int n=0; n<stu[m].length; n++){
						System.out.print(stu[m][n]+"\t");
					}
					System.out.println();			
				}
			}else if(num==3){
				// 3.����
				input=sc.nextLine();
				int nm=Integer.parseInt(input);
				System.out.println(nm+"�й� �л�");
				System.out.print("����:");
				input=sc.nextLine();
				num=Integer.parseInt(input);
				stu[nm-160001][0]=num;
				System.out.print("����:");
				input=sc.nextLine();
				num=Integer.parseInt(input);
				stu[nm-160001][1]=num;
				System.out.print("����:");
				input=sc.nextLine();
				num=Integer.parseInt(input);
				stu[nm-160001][2]=num;
			}else if(num==0){
				// 0.����
				System.out.println("�����մϴ�");
				break;
			}
		}
	}

}
