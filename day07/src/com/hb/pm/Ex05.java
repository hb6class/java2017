package com.hb.pm;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���Ͻô� �������� ����:");
		String input = sc.nextLine();
		int su = Integer.parseInt(input);
		Ex05 me = new Ex05();
		me.gugudan(su);
		System.out.println("�����մϴ�");
	}
	
	public void gugudan(int su){
		for(int i=1; i<10; i++){
			System.out.println(su+"x"+i+"="+su*i);
		}
	}
}
