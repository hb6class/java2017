package com.hb.am;

import java.util.Scanner;

class Student{
	int kor, eng, math;	
}

public class Ex05 {

	public static void main(String[] args) {
		// �����������α׷� ver 4.0.0
		Student[] stu = new Student[3];
		System.out.println("�����������α׷� ver 4.0.0");
		int menu=0;
		int idx=0;
		while(true){
			System.out.print("1.�Է� 2.���� 3.���� 0.����>");
			menu=input();
			if(menu==1){
				if(idx==stu.length){
					System.out.println("���̻� �Է��Ͻ� �� �����ϴ�");
					continue;
				}
				System.out.print("����:");
				int kor = input();
				System.out.print("����:");
				int eng = input();
				System.out.print("����:");
				int math = input();
				stu[idx]=new Student();
				stu[idx].kor=kor;
				stu[idx].eng=eng;
				stu[idx].math=math;
				idx++;
			}else if(menu==2){
				if(idx<stu.length){
					System.out.println("������ ��� �Է��ϼž����� �� �� �ֽ��ϴ�");
					continue;
				}
				System.out.println("�й�\t����\t����\t����");
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
				System.out.println("�Է� ������ Ȯ���ϼ���");
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
