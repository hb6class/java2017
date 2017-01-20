package com.hb.pm;

import java.util.Scanner;

public class Ex01 {
	public static Scanner sc;

	public static void main(String[] args) {
		// bbs
		// 1.글목록 2.글쓰기 3.글보기 4.글수정 0.종료
		// 1. 글번호 제목
		//    ---------------
		//    1		 제목1
		//    2		 -
		//    3		 -
		//    ~
		//    10	 제목10
		// 2. 	글제목:
		//		글쓴이:
		//		내용:
		// 3. 글번호>2
		//    	글제목: 제목2
		//		글쓴이:	guest
		//		내  용:	aaaaaa
		// 3. 수정할 번호>2
		//    	글제목: 제목22
		//		글쓴이:ㄴㅇㅁㅇㄴ
		//		내용:ㅁㄴㅇㄻㅇ
		sc = new Scanner(System.in);
		System.out.println("BBS 게시판 ver 2.0.0");
//		String[] record = new String[]{"제목","글쓴이","내용"};
		String[][] records = new String[10][];
		for(int i=0; i<records.length; i++){
			records[i]=new String[]{"-","",""};
		}
		String input1="";
		int cnt=0;
		while(true){
			System.out.print("1.글목록 2.글쓰기 3.글보기 4.글수정 0.종료>");
			input1=sc.nextLine();
			if(input1.equals("1")){
				System.out.println("-------------------------");
				System.out.println("글번호\t제목");
				System.out.println("-------------------------");
				for(int i=0; i<records.length; i++){
					System.out.println(i+1+"\t"+records[i][0]);
				}
				System.out.println("-------------------------\n");
			}else if(input1.equals("2")){
//				System.out.print("제  목:");
//				String inp1=sc.nextLine();
//				System.out.print("글쓴이:");
//				String inp2=sc.nextLine();
//				System.out.print("내  용:");
//				String inp3=sc.nextLine();
//				System.out.println();
//				records[cnt]=new String[]{inp1,inp2,inp3};
				input(records,cnt);
				cnt++;
			}else if(input1.equals("3")){
				System.out.print("글번호 선택>");
				input1 = sc.nextLine();
				int num = Integer.parseInt(input1);
				System.out.println("제  목:"+records[num-1][0]);
				System.out.println("글쓴이:"+records[num-1][1]);
				System.out.println("내  용:"+records[num-1][2]);
				System.out.println("\n");
			}else if(input1.equals("4")){
				System.out.print("글번호 선택>");
				input1 = sc.nextLine();
				int num = Integer.parseInt(input1);
//				System.out.print("제  목:");
//				String inp1=sc.nextLine();
//				System.out.print("글쓴이:");
//				String inp2=sc.nextLine();
//				System.out.print("내  용:");
//				String inp3=sc.nextLine();
//				records[num-1] = new String[]{inp1,inp2,inp3};
				input(records,num-1);
				System.out.println();
			}else if(input1.equals("0")){
				System.out.println("\n\n감사합니다\n");
				break;
			}
		}
	}
	
	public static void input(String[][] records,int num){
		String[] subs={"제  목:","글쓴이:","내  용:"};
		for(int i=0; i<subs.length; i++){
			subs[i]=func01(subs[i]);
		}
		records[num] = new String[]{subs[0],subs[1],subs[2]};
	}
	public static String func01(String st1){
		System.out.print(st1);
		String inp1=sc.nextLine();
		return inp1;
	}

}















