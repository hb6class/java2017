package com.hb.pm;

import java.util.Scanner;

class Student{
	int num, kor, eng, math;
	public Student(int num, int kor, int eng, int math) {
		this.num=num;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}

public class Ex02 {
	static final String MENU="1.���� 2.�Է� 3.���� 4.���� 0.����>";
	Scanner sc;
	Student[] stus;

	public Ex02() {
		sc = new Scanner(System.in);
		stus = new Student[0];
	}

	public static void main(String[] args) {
		// �迭�� �����Ҵ�
		// �����������α׷� ver 6.0.0
		Ex02 me = new Ex02();
		System.out.println("�����������α׷� ver 6.0.0\n\n");
		boolean tf=true;
		while(tf){
			tf=me.start();
		}
		System.out.println("������ּż� �����մϴ�");
	}
	public void add(){
		int i=0;
		Student[] stus1 = stus;
		Student[] stus2 = new Student[stus.length+1];
		for(i=0; i<stus1.length; i++){
//			stus2[i]=stus1[i];
			stus2[i]=new Student(stus1[i].num,stus1[i].kor,stus1[i].eng,stus1[i].math);
		}
		
		System.out.print("����>");
		int kor=new Integer(sc.nextLine());
		System.out.print("����>");
		int eng=new Integer(sc.nextLine());
		System.out.print("����>");
		int math=new Integer(sc.nextLine());
		stus2[i]=new Student(i,kor,eng,math);
		stus=stus2;
	}
	public void list(){
		System.out.println("-----------------------------------------------");
		System.out.println("�й�\t����\t����\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<stus.length; i++){
			System.out.print(stus[i].num+"\t");
			System.out.print(stus[i].kor+"\t");
			System.out.print(stus[i].eng+"\t");
			System.out.println(stus[i].math+"\t");
		}
	}
	public boolean start(){
		System.out.print(MENU);
		String tmp=sc.nextLine().trim();
		if(tmp.length()!=1){
			System.out.println("�Է¿���");
			return true;
		}
		if(tmp.charAt(0)=='0'||tmp.charAt(0)=='1'
				||tmp.charAt(0)=='2'||tmp.charAt(0)=='3'||tmp.charAt(0)=='4'){
		}else{
			System.out.println("0~4������ �Է°���");			
			return true;
		}
		int input = new Integer(tmp);
		switch (input) {
		case 0:
			return false;
		case 1:
			//����
			list();
			break;
		case 2:
			add();
			break;
		case 3:
			//����
			break;
		case 4:
			//����
			break;

		default:
			break;
		}
		return true;
	}
	
}







