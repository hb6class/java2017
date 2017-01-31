package com.hb.am;

import java.util.Scanner;

class Machine{
	String name;
	public Machine() {
	}
	public Machine(String name) {
		this.name=name;
	}
	void on(){
		System.out.println(name+"을 켜다");
	}
	void off(){
		System.out.println(name+"을 끄다");
	}
	void run(){
		System.out.println(name+"을 조작하다");
	}
}

class Tv extends Machine{
	public Tv() {
		name="tv";
		System.out.println(name+" 콘덴서를 꼽다");
	}

	void run(){
		System.out.println(name+"을 채널 돌리다");
	}
}

class Radio extends Machine{
	public Radio() {
		name="radio";
		System.out.println(name+" 콘덴서를 꼽다");
	}

	void run(){
		System.out.println(name+"을 주파수 맞추다");
	}
}

class Audio extends Machine{
	public Audio() {
		name="audio";
		System.out.println(name+" 콘덴서를 꼽다");
	}

	void run(){
		System.out.println(name+"을 음악을 켜다");
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// 리모컨
		
		Scanner sc = new Scanner(System.in);
		Machine remote= null;
		int menu=0;
		while(true){
			System.out.print("1.tv 2.radio 3.audio >");
			menu=Integer.valueOf(sc.nextLine());
			if(menu==1){
				remote= new Tv();
//				remote = new Machine("Tv");
			}else if(menu==2){
				remote = new Radio();
//				remote = new Machine("Radio");
			}else if(menu==3){
				remote = new Audio();
//				remote = new Machine("Audio");
			}
			System.out.print("1.on 2.run 3.off >");
			menu=Integer.valueOf(sc.nextLine());
			if(menu==1){
				remote.on();
			}else if(menu==3){
				remote.off();
			}else if(menu==2){
				remote.run();
			}
		}
	}

}










