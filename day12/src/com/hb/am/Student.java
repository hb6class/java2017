package com.hb.am;

public class Student {
	private static int cnt;	// 객체를 몇개 생성했는지 누적
	private int num;	// 학번
	private int[] sub;
	
	public Student() {
		sub=new int[3];
	}
	public Student(int[] sub) {
		this.sub=sub;
		cnt++;
		num=170000+cnt;
	}
	
	int[] getSub(){
		return sub;
	}
	int getNum(){
		return num;
	}
	static int getCnt(){
		return cnt;
	}
}
