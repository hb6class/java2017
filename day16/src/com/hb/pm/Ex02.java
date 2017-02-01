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
			System.out.println("0으로 나눌수 없음");
		}catch(InputMismatchException e){
				System.out.println("문자입력하지 말라구요");
		}catch(Exception exe){
			System.out.println("먼진 몰라도 에러나면");
		}
	}

}
