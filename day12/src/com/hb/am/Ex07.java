package com.hb.am;

import java.util.Scanner;


public class Ex07 {
	static Ex07 me = new Ex07();
	
	Student[] stus;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("학생관리 프로그램 ver 5.1.0");
		System.out.print("총인원>");
		int cnt=me.input();
		me.stus = new Student[cnt];
		for(int i=0; i<me.stus.length; i++){
			me.stus[i]=new Student();
		}
		while(true){
			System.out.print("\n1.보기 2.입력 3.수정 4.삭제 0.종료>");
			switch (me.input()) {
			case 0:
				System.out.println("\n사용해주셔서 감사합니다");
				return;
			case 1:
				me.show();
				break;
			case 2:
				if(Student.getCnt()==cnt){
					System.out.println("모두 입력하셨습니다");
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
		System.out.println("학번\t국어\t영어\t수학\t");
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
		System.out.print("국어>");
		int kor = input();
		System.out.print("영어>");
		int eng = input();
		System.out.print("수학>");
		int math = input();
		
		int[] sub={kor,eng,math};
		stus[start]=new Student(sub);
	}
	public void edit(){
		
	}
	public void del(){
		
	}

}










