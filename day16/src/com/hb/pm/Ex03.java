package com.hb.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("3�� ���� ���� �Է�:");
		try{
			int a =func1();
			System.out.println("�Է��Ͻ� ���ڴ� "+a);
		}catch(InputMismatchException e){
			System.out.println("�����Է�������¾���");
		}catch(ArithmeticException e){
			System.out.println("0���� ������ ����");
		}
	}
	
	public static int func1() throws InputMismatchException,ArithmeticException{
		
		return 0;
	}
}










