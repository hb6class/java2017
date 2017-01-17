package com.hb.am;

import java.util.Scanner;

public class Ex01 {
	public static int max=80;
	public static int speed=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input="";
		System.out.println("자동차 ver 1.1.1");
		while(true){
			System.out.println("당신의 차량을 선택하세요");
			System.out.print("1.티코(최대80km, 기본) "
					+ "2.아반떼(최대150km) 3.소나타(최대210km) >");
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
				System.out.println("입력범위는 1~3까지 입니다");
			}
		}
		while(true){
			System.out.print("1.현재속도, 2.가속, 3.감속, 0.시동끔 ?>");
			input = sc.nextLine();
			int menu = Integer.parseInt(input);
			if(menu==1){
				showSpeed();
			}else if(menu==2){
				System.out.print("얼마나 가속하시겠습니까? >");
				input=sc.nextLine();
				int speed=Integer.parseInt(input);
				speedUp(speed);
			}else if(menu==3){
				System.out.print("얼마나 감속하시겠습니까? >");
				input=sc.nextLine();
				int speed=Integer.parseInt(input);
				speedDown(speed);
			}else if(menu==0){
				break;
			}else{
				System.out.println("메뉴를 다시 확인하시고 입력해주세요");
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
