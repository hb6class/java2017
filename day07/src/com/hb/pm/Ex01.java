package com.hb.pm;

import java.util.Scanner;

public class Ex01 {
	public static int win, same, lose;

	public static void main(String[] args) {
		// ��������������
		Scanner sc = new Scanner(System.in);
		String input="";
		int su=0;
		int com=0;
		System.out.println("����,����,�� ���� v1.0.0");
		while(true){
			com=(int)(Math.random()*3)+1;
			System.out.print("1.���� 2.���� 3.�� 0.���� >> ");
			input=sc.nextLine();
			su=Integer.parseInt(input);
			if(su==0){
				break;
			}
			String result=func01(com,su);
			System.out.println(result+"(win:"+win
					+",same:"+same+",lose:"+lose+")");
		}
		System.out.println("�����ϼ̽��ϴ�");
	}
	public static String func01(int a, int b){
		String result="�̰���ϴ�";
		if(a==b){
			result="�����ϴ�";
			same++;
		}else if(a==1 && b==3 || a==2 && b==1 || a==3 && b==2){
			result="�����ϴ�";
			lose++;
		}else{
			win++;
		}
		return result;
	}
}











