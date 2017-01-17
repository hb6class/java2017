package com.hb.pm;

import java.util.Scanner;

public class Ex01 {
	public static int win, same, lose;

	public static void main(String[] args) {
		// 가위바위보게임
		Scanner sc = new Scanner(System.in);
		String input="";
		int su=0;
		int com=0;
		System.out.println("가위,바위,보 게임 v1.0.0");
		while(true){
			com=(int)(Math.random()*3)+1;
			System.out.print("1.가위 2.바위 3.보 0.종료 >> ");
			input=sc.nextLine();
			su=Integer.parseInt(input);
			if(su==0){
				break;
			}
			String result=func01(com,su);
			System.out.println(result+"(win:"+win
					+",same:"+same+",lose:"+lose+")");
		}
		System.out.println("수고하셨습니다");
	}
	public static String func01(int a, int b){
		String result="이겼습니다";
		if(a==b){
			result="비겼습니다";
			same++;
		}else if(a==1 && b==3 || a==2 && b==1 || a==3 && b==2){
			result="졌습니다";
			lose++;
		}else{
			win++;
		}
		return result;
	}
}











