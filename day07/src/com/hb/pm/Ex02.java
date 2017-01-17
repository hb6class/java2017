package com.hb.pm;

import java.util.Scanner;

public class Ex02 {
	public static int win, same, lose;

	public static void main(String[] args) {
		// 가위바위보게임
		System.out.println("가위,바위,보 게임 v1.1.0");
//		while(play()){}
		boolean tf=true;
		while(tf){
			tf=play();
		}
		System.out.println("수고하셨습니다");
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
		System.out.print("1.가위 2.바위 3.보 0.종료 >> ");
		switch (input()) {
		case 1:
			if(com==1){
				same++;
				result=result("비겼음");
			}else if(com==2){
				lose++;
				result=result("졌음");
			}else{
				win++;
				result=result("이겼음");
			}
			break;
		case 2:
			if(com==1){
				win++;
				result=result("이겼음");
			}else if(com==2){
				same++;
				result=result("비겼음");
			}else{
				lose++;
				result=result("졌음");
			}
			break;
		case 3:
			if(com==1){
				lose++;
				result=result("졌음");
			}else if(com==2){
				win++;
				result=result("이겼음");
			}else{
				same++;
				result=result("비겼음");
			}
			break;
		case 0:
			return false;
		default:
			result="입력을 다시 확인하세요";
			break;
		}
		System.out.println(result);
		return true;
	}

}
