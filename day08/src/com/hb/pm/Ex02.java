package com.hb.pm;

import java.util.Scanner;

class Bbs{
	String sub="";
	String id="";
	String content="";
	
	//본다
	void view(){
		System.out.println("제목:"+sub);
		System.out.println("글쓴이:"+id);
		System.out.println("내용:"+content);
		
	}
	//쓴다, 수정한다
	void write(String a, String b, String c){
		sub=a;
		id=b;
		content=c;
	}
	//지운다
	void delete(){
		sub="";
		id="";
		content="";
	}
}


public class Ex02 {

	public static void main(String[] args) {
		System.out.println("게시판 ver 0.0.1");
		Scanner sc = new Scanner(System.in);
		String input="";
		int num=0;
		Bbs bbs = new Bbs();
		boolean tf=true;
		while(tf){
			System.out.print("1.보기 2.글쓰기 3.수정 4.삭제>");
			input =sc.nextLine();
			num=Integer.parseInt(input);
			switch (num) {
			case 1:
				bbs.view(); break;
			case 2: case 3:
				System.out.print("제목:");
				String sub=sc.nextLine();
				System.out.print("글쓴이:");
				String id=sc.nextLine();
				System.out.print("내용:");
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














