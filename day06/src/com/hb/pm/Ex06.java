package com.hb.pm;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args){
		// �������� ����Ͻÿ�
		System.out.println("���Ͻô� �������� �Է��ϼ���");
		System.out.print(">");
		Scanner sc = new Scanner(System.in);
		// �غ�
		String input=sc.nextLine();	// �Է¼���
		int su = Integer.parseInt(input);
		System.out.println(input+"��");
		for(int i=1; i<10; i++){
			System.out.println(input+"x"+i+"="+su*i);
		}
	}

}














