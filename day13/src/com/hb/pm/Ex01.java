package com.hb.pm;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		�ֹι�ȣ�� �Է����ּ���> 990101-1234567
//		����� 00�� �������� �����Դϴ�
//		����� 00�� �������� �̼������Դϴ�
		
//		>9901011234567
//		>990101-123456
//		>�������ϰ���-123456
//		-> �ٽ�Ȯ���Ͻð� �Է����ּ���
		Scanner sc = new Scanner(System.in);
		String input=null;
		boolean tf=false;
		while(true){
			tf=false;
			System.out.print("�ֹι�ȣ�Է�:");
			input = sc.nextLine();
			//2017-1999+1=2017-(1900+99)+1
			//2017-2002+1=2017-(2000+02)+1
			if(input.length()<14){
				System.out.println("�Է��� �����մϴ�");
				continue;
			}
			if(input.length()>14){
				System.out.println("�Է��� �����ϴ�");
				continue;
			}
			
			for(int i=0; i<14; i++){
				if(i==6){
					continue;
				}
				if('0'<=input.charAt(i)&&input.charAt(i)<='9'){
				}else{
					tf=true;
				}
			}

			if(tf){
				System.out.println("�Է��� �߸��ƽ��ϴ�");
				
			}else if(input.charAt(6)!='-'){
				System.out.println("-�� �������� ������");
				
			}else{
				break;
			}
		}
		
		char[] chs=new char[2];
		input.getChars(0, 2, chs, 0);
//		chs[0]=input.charAt(0);
//		chs[1]=input.charAt(1);
		for(int i=0; i<chs.length;i++){
			chs[i]=input.charAt(i);
		}
		int year = 1900;
		if(input.charAt(7)=='3'||input.charAt(7)=='4'){
			year = 2000;
		}
		int age=2017-(year+Integer.parseInt(String.valueOf(chs)))+1;
		
		System.out.print("����� "+age+"�� ");
		if(input.charAt(7)=='1'||input.charAt(7)=='3'){
			System.out.print("�������� ");
		}else if(input.charAt(7)=='2'||input.charAt(7)=='4'){
			System.out.print("�������� ");
		}else{
			System.out.println("�ܰ������� ");
		}
		if(age>18){
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("�̼������Դϴ�");			
		}
	}

}












