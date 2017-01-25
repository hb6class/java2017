package com.hb.pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		주민번호를 입력해주세요> 990101-1234567
//		당신은 00세 남성으로 성인입니다
//		당신은 00세 남성으로 미성년자입니다
		
//		>9901011234567
//		>990101-123456
//		>구구공일공일-123456
//		-> 다시확인하시고 입력해주세요
		Scanner sc = new Scanner(System.in);
		String input=null;
		boolean tf=false;
		while(true){
			tf=false;
			System.out.print("주민번호입력:");
			input = sc.nextLine();
			//2017-1999+1=2017-(1900+99)+1
			//2017-2002+1=2017-(2000+02)+1
			if(input.length()<14){
				System.out.println("입력이 부족합니다");
				continue;
			}
			if(input.length()>14){
				System.out.println("입력이 많습니다");
				continue;
			}
			
			for(int i=0; i<14; i++){
				if(i==6){
					continue;
				}
				if('0'<=input.charAt(i)&&input.charAt(i)<='9'){
				}else{
					tf=true;
				}
			}

			if(tf){
				System.out.println("입력이 잘못됐습니다");
				
			}else if(input.charAt(6)!='-'){
				System.out.println("-를 생략하지 마세요");
				
			}else{
				break;
			}
		}
		
		char[] chs=new char[2];
		input.getChars(0, 2, chs, 0);
//		chs[0]=input.charAt(0);
//		chs[1]=input.charAt(1);
		for(int i=0; i<chs.length;i++){
			chs[i]=input.charAt(i);
		}
		int year = 1900;
		if(input.charAt(7)=='3'||input.charAt(7)=='4'){
			year = 2000;
		}
		int age=2017-(year+Integer.parseInt(String.valueOf(chs)))+1;
		
		System.out.print("당신은 "+age+"세 ");
		if(input.charAt(7)=='1'||input.charAt(7)=='3'){
			System.out.print("남성으로 ");
		}else if(input.charAt(7)=='2'||input.charAt(7)=='4'){
			System.out.print("여성으로 ");
		}else{
			System.out.println("외계인으로 ");
		}
		if(age>18){
			System.out.println("성인입니다");
		}else {
			System.out.println("미성년자입니다");			
		}
	}

}












