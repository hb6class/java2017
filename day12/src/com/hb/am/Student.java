package com.hb.am;

public class Student {
	private static int cnt;	// ��ü�� � �����ߴ��� ����
	private int num;	// �й�
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
