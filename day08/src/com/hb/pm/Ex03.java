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
			System.out.println("�ܰ� �����մϴ�");
		}
		return money;
	}
}

public class Ex03 {

	public static void main(String[] args) {
		// ���� CD���
		// 1.�ܰ�Ȯ�� 2.�Ա� 3.��� 0.����
		Bank bank = new Bank();
		bank.name="�츮����";
		System.out.println("�ȳ��ϼ���\n"+bank.name+"�Դϴ�");
		Scanner sc = new Scanner(System.in);
		String input="";
		int num=0;
		int output=0;
		
		while(true){
			System.out.print("1.�ܰ�Ȯ�� 2.�Ա� 3.��� 0.����>");
			input=sc.nextLine();
			num=Integer.parseInt(input);
			switch (num) {
				case 1:
					output=bank.chk();
					break;
				case 2:
					System.out.print("�Ա��Ͻ� �ݾ��� �Է�:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					output=bank.add(num);
					break;
				case 3:
					System.out.print("ã���� �ݾ��� �Է�:");
					input=sc.nextLine();
					num=Integer.parseInt(input);
					output=bank.pull(num);
					break;
				case 0:
					return;
				default:
					break;
				}
				System.out.println("���� �ܰ�� "+output+"���Դϴ�");
		}
	}
}












