package com.hb.pm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// �ܼ�â�� �Է¹��� �غ�
	// io
		
		System.out.println("�Է��ϼ���");
		System.out.print(">");
		String input=br.readLine();// �Է¹޴� ���(������)
		System.out.println("�Է��� "+input);
	}
	
}
