package com.hb.am;

import java.util.Scanner;


public class Ex07 {
	static Ex07 me = new Ex07();
	
	Student[] stus;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�л����� ���α׷� ver 5.1.0");
		System.out.print("���ο�>");
		int cnt=me.input();
		me.stus = new Student[cnt];
		for(int i=0; i<me.stus.length; i++){
			me.stus[i]=new Student();
		}
		while(true){
			System.out.print("\n1.���� 2.�Է� 3.���� 4.���� 0.����>");
			switch (me.input()) {
			case 0:
				System.out.println("\n������ּż� �����մϴ�");
				return;
			case 1:
				me.show();
				break;
			case 2:
				if(Student.getCnt()==cnt){
					System.out.println("��� �Է��ϼ̽��ϴ�");
					break;
					}
				me.add(Student.getCnt());
				break;
			case 3:
				me.edit();
				break;
			case 4:
				me.del();
				break;
	
			default:
				break;
			}
		}
	}
	public int input(){
		String temp=sc.nextLine();
		return Integer.parseInt(temp);
	}
	public void show(){
		System.out.println("------------------------------------------");
		System.out.println("�й�\t����\t����\t����\t");
		System.out.println("------------------------------------------");
		for(int m=0; m<stus.length; m++){
			Student stu=stus[m];
			System.out.print(stu.getNum()+"\t");
			int[] sub= stu.getSub();
			for(int n=0; n<sub.length; n++){
				System.out.print(sub[n]+"\t");
			}
			System.out.println();
		}
	}
	public void add(int start){
		System.out.print("����>");
		int kor = input();
		System.out.print("����>");
		int eng = input();
		System.out.print("����>");
		int math = input();
		
		int[] sub={kor,eng,math};
		stus[start]=new Student(sub);
	}
	public void edit(){
		
	}
	public void del(){
		
	}

}










