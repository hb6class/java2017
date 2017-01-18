package com.hb.pm;

import java.util.Scanner;

class Bank{
	int money;
	String name;
	
	int chk(){
		return money;
	}
	int add(int num){
		money+=num;
		return money;
	}
	int pull(int num){
		if(money-num>=0){
			money-=num;
		}else{
			System.out.println("잔고가 부족합니다");
		}
		return money;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// 은행 CD기기
		// 1.잔고확인 2.입금 3.출금 0.종료
		Bank bank = new Bank();
		bank.name="우리은행";
		System.out.println("안녕하세요\n"+bank.name+"입니다");
		Scanner sc = new Scanner(System.in);
		String input="";
		int num=0;
		int output=0;
		
		while(true){
			System.out.print("1.잔고확인 2.입금 3.출금 0.종료>");
			input=sc.nextLine();
			num=Integer.parseInt(input);
			switch (num) {
				case 1:
					output=bank.chk();
					break;
				case 2:
					System.out.print("입금하실 금액을 입력:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					output=bank.add(num);
					break;
				case 3:
					System.out.print("찾으실 금액을 입력:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					output=bank.pull(num);
					break;
				case 0:
					return;
				default:
					break;
				}
				System.out.println("현재 잔고는 "+output+"원입니다");
		}
	}
}












