package com.hb.pm;

import java.util.Scanner;

class Bbs{
	String sub="";
	String id="";
	String content="";
	
	//����
	void view(){
		System.out.println("����:"+sub);
		System.out.println("�۾���:"+id);
		System.out.println("����:"+content);
		
	}
	//����, �����Ѵ�
	void write(String a, String b, String c){
		sub=a;
		id=b;
		content=c;
	}
	//�����
	void delete(){
		sub="";
		id="";
		content="";
	}
}


public class Ex02 {

	public static void main(String[] args) {
		System.out.println("�Խ��� ver 0.0.1");
		Scanner sc = new Scanner(System.in);
		String input="";
		int num=0;
		Bbs bbs = new Bbs();
		boolean tf=true;
		while(tf){
			System.out.print("1.���� 2.�۾��� 3.���� 4.����>");
			input =sc.nextLine();
			num=Integer.parseInt(input);
			switch (num) {
			case 1:
				bbs.view(); break;
			case 2: case 3:
				System.out.print("����:");
				String sub=sc.nextLine();
				System.out.print("�۾���:");
				String id=sc.nextLine();
				System.out.print("����:");
				String content=sc.nextLine();
				bbs.write(sub,id,content);
				break;
			case 4:
				bbs.delete(); break;
			default:
				tf=false; break;
			}
		}
	}

}














