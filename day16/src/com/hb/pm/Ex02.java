package com.hb.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print(">");
		try{
			int input=sc.nextInt();
			System.out.println(5/input);
		}catch(ArithmeticException ex){
//			System.out.println(ex.getMessage());
			System.out.println("0���� ������ ����");
		}catch(InputMismatchException e){
				System.out.println("�����Է����� ���󱸿�");
		}catch(Exception exe){
			System.out.println("���� ���� ��������");
		}
	}

}
