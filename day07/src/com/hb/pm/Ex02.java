package com.hb.pm;

import java.util.Scanner;

public class Ex02 {
	public static int win, same, lose;

	public static void main(String[] args) {
		// ��������������
		System.out.println("����,����,�� ���� v1.1.0");
//		while(play()){}
		boolean tf=true;
		while(tf){
			tf=play();
		}
		System.out.println("�����ϼ̽��ϴ�");
	}
	public static int input(){
		Scanner sc = new Scanner(System.in);
		int su=Integer.parseInt(sc.nextLine());
		return su;
	}
	public static String result(String st){
		String result=st+"(win:"+win
		+",same:"+same+",lose:"+lose+")";
		return result;
	}
	public static boolean play(){
		String result="";
		int com = (int)(Math.random()*3)+1;
		System.out.print("1.���� 2.���� 3.�� 0.���� >> ");
		switch (input()) {
		case 1:
			if(com==1){
				same++;
				result=result("�����");
			}else if(com==2){
				lose++;
				result=result("����");
			}else{
				win++;
				result=result("�̰���");
			}
			break;
		case 2:
			if(com==1){
				win++;
				result=result("�̰���");
			}else if(com==2){
				same++;
				result=result("�����");
			}else{
				lose++;
				result=result("����");
			}
			break;
		case 3:
			if(com==1){
				lose++;
				result=result("����");
			}else if(com==2){
				win++;
				result=result("�̰���");
			}else{
				same++;
				result=result("�����");
			}
			break;
		case 0:
			return false;
		default:
			result="�Է��� �ٽ� Ȯ���ϼ���";
			break;
		}
		System.out.println(result);
		return true;
	}

}
