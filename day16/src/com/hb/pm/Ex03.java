package com.hb.pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("3을 나눌 숫자 입력:");
		try{
			int a =func1();
			System.out.println("입력하신 숫자는 "+a);
		}catch(InputMismatchException e){
			System.out.println("문자입력으로출력안함");
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없음");
		}
	}
	
	public static int func1() throws InputMismatchException,ArithmeticException{
		
		return 0;
	}
}










