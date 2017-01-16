package com.hb.pm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 콘솔창에 입력받을 준비
	// io
		
		System.out.println("입력하세요");
		System.out.print(">");
		String input=br.readLine();// 입력받는 명령(엔터전)
		System.out.println("입력은 "+input);
	}
	
}
