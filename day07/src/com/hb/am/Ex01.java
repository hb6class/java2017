package com.hb.am;

import java.util.Scanner;

public class Ex01 {
	public static int max=80;
	public static int speed=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input="";
		System.out.println("�ڵ��� ver 1.1.1");
		while(true){
			System.out.println("����� ������ �����ϼ���");
			System.out.print("1.Ƽ��(�ִ�80km, �⺻) "
					+ "2.�ƹݶ�(�ִ�150km) 3.�ҳ�Ÿ(�ִ�210km) >");
			input = sc.nextLine();
			int car = Integer.parseInt(input);
			if(car<4 && car>0){
				switch (car) {
				case 1:
					car(80);
					break;
				case 2:
					car(150);
					break;
				default:
					car(210);
				}
				break;
			}else{
				System.out.println("�Է¹����� 1~3���� �Դϴ�");
			}
		}
		while(true){
			System.out.print("1.����ӵ�, 2.����, 3.����, 0.�õ��� ?>");
			input = sc.nextLine();
			int menu = Integer.parseInt(input);
			if(menu==1){
				showSpeed();
			}else if(menu==2){
				System.out.print("�󸶳� �����Ͻðڽ��ϱ�? >");
				input=sc.nextLine();
				int speed=Integer.parseInt(input);
				speedUp(speed);
			}else if(menu==3){
				System.out.print("�󸶳� �����Ͻðڽ��ϱ�? >");
				input=sc.nextLine();
				int speed=Integer.parseInt(input);
				speedDown(speed);
			}else if(menu==0){
				break;
			}else{
				System.out.println("�޴��� �ٽ� Ȯ���Ͻð� �Է����ּ���");
			}
		}
		
	}
	public static void car(int car){
		max=car;
	}
	
	public static void showSpeed(){
		System.out.println(speed+"km");		
	}
	
	public static void speedUp(int up){
		if(speed+up<=max){
			speed+=up;
		}else{
			speed=max;
		}
	}
	public static void speedDown(int down){
		if(speed-down>=0){
			speed-=down;
		}else{
			speed=0;
		}
	}
}
