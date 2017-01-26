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
	static final String MENU="1.보기 2.입력 3.수정 4.삭제 0.종료>";
	Scanner sc;
	Student[] stus;

	public Ex02() {
		sc = new Scanner(System.in);
		stus = new Student[0];
	}

	public static void main(String[] args) {
		// 배열의 동적할당
		// 성적관리프로그램 ver 6.0.0
		Ex02 me = new Ex02();
		System.out.println("성적관리프로그램 ver 6.0.0\n\n");
		boolean tf=true;
		while(tf){
			tf=me.start();
		}
		System.out.println("사용해주셔서 감사합니다");
	}
	public int inputChk(){
		String tmp=sc.nextLine();
		if(tmp.trim().length()==0){
			System.out.println("입력없음");
			return -1;
		}
		for(int i=0; i<tmp.length(); i++){
			if(!Character.isDigit(tmp.charAt(i))){
				System.out.println("학번입력확인");
				return -1;
			}
		}
		int num = Integer.valueOf(tmp);
		int chk=0;
		for(chk=0; chk<stus.length; chk++){
			if(stus[chk].num==num){
				break;
			}
		}
		if(chk==stus.length){
			System.out.println("존재하지 않는 학생입니다");
			return -1;
		}
		return num;
	}
	public void del(){
		System.out.print("삭제할 학번>");
		
		int num = inputChk();
		if(num==-1){return;}
		Student[] stu2= new Student[stus.length-1];
		//학번을 기준으로 앞
		for(int i=0; i<num; i++){
//			stu2[i]=stus[i];
			stu2[i]=new Student(stus[i].num,stus[i].kor
					,stus[i].eng,stus[i].math);
		}
		//학번을 기준으로 뒤
		for(int i=num; i<stu2.length; i++){
//			stu2[i]=stus[i+1];
			stu2[i]=new Student(stus[i+1].num-1,stus[i+1].kor
					,stus[i+1].eng,stus[i+1].math);
		}
		stus=stu2;
	}
	public void edit(){
		System.out.print("수정할 학번>");
		String tmp=sc.nextLine();
		if(tmp.trim().length()==0){
			System.out.println("입력없음");
			return;
		}
		for(int i=0; i<tmp.length(); i++){
			if(!Character.isDigit(tmp.charAt(i))){
				System.out.println("학번입력확인");
				return;
			}
		}
		int num = Integer.valueOf(tmp);
		int chk=0;
		for(chk=0; chk<stus.length; chk++){
			if(stus[chk].num==num){
				break;
			}
		}
		if(chk==stus.length){
			System.out.println("존재하지 않는 학생입니다");
			return;
		}
		System.out.print("국어>");
		int kor=new Integer(sc.nextLine());
		System.out.print("영어>");
		int eng=new Integer(sc.nextLine());
		System.out.print("수학>");
		int math=new Integer(sc.nextLine());
		stus[num]=new Student(num, kor, eng, math);
		
	}
	public void add(){
		int i=0;
		Student[] stus1 = stus;
		Student[] stus2 = new Student[stus.length+1];
		for(i=0; i<stus1.length; i++){
//			stus2[i]=stus1[i];
			stus2[i]=new Student(stus1[i].num,stus1[i].kor,stus1[i].eng,stus1[i].math);
		}
		
		System.out.print("국어>");
		int kor=new Integer(sc.nextLine());
		System.out.print("영어>");
		int eng=new Integer(sc.nextLine());
		System.out.print("수학>");
		int math=new Integer(sc.nextLine());
		stus2[i]=new Student(i,kor,eng,math);
		stus=stus2;
	}
	public void list(){
		System.out.println("-----------------------------------------------");
		System.out.println("학번\t국어\t영어\t수학");
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
			System.out.println("입력오류");
			return true;
		}
		if(tmp.charAt(0)=='0'||tmp.charAt(0)=='1'
				||tmp.charAt(0)=='2'||tmp.charAt(0)=='3'||tmp.charAt(0)=='4'){
		}else{
			System.out.println("0~4까지만 입력가능");			
			return true;
		}
		int input = new Integer(tmp);
		switch (input) {
		case 0:
			return false;
		case 1:
			//보기
			list();
			break;
		case 2:
			add();
			break;
		case 3:
			edit();
			break;
		case 4:
			//삭제
			del();
			break;

		default:
			break;
		}
		return true;
	}
	
}







