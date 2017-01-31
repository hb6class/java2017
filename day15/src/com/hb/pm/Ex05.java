package com.hb.pm;

import java.util.Scanner;
// 계산기
// 3+2=5
// 3+2+4+5+7=???

class Product{
	 String name;
	 int price;
	 int ea;
	 static int tot;
	 
	 Product(String name, int price, int ea){
		 this.name=name;
		 this.price=price;
		 this.ea=ea;
	 }
	 int sum(){
		 tot+=price*ea;
		 return price*ea;
	 }
	 
	 void showTot(){
		 System.out.println(name+"\n \t\t"+price+"\t"+ea+"\t"+sum());
	 }
}

class Events extends Product{
	double dc;
	static String[] dc10={"빼빼로","춥바춥스","페레로로쉐"};
	static String[] dc50={"아이스크림"};
	
	public Events(String name, int price, int ea, double dc) {
		super(name+"(DC"+dc*100+"%)",price,ea);
		this.dc=dc;
	}
	
	static boolean chkDc50(String name){
		for(int i=0; i<dc50.length; i++){
			if(dc50[i].equals(name)){
				return true;
			}
		}
		return false;
	}
	static boolean chkDc10(String name){
		for(int i=0; i<dc10.length; i++){
			if(dc10[i].equals(name)){
				return true;
			}
		}
		return false;
	}
	
	@Override
	int sum() {
		tot+=price*ea-(int)(price*ea*dc);
		return price*ea-(int)(price*ea*dc);
	}
}

public class Ex05 {
	// pos기기 프로그램 - 영수증
	public static void main(String[] args) {
		Product[] pros=new Product[0];
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("상품명>");
			String name=sc.nextLine();
			System.out.print("가격>");
			int price=Integer.valueOf(sc.nextLine());
			System.out.print("갯수>");
			int ea=Integer.valueOf(sc.nextLine());
			Product[] pros2=new Product[pros.length+1];
			for(int i=0; i<pros.length; i++){
				pros2[i]=pros[i];
			}
			if(Events.chkDc10(name)){
				pros2[pros.length]=new Events(name,price,ea,0.1);
			}else if(Events.chkDc50(name)){
				pros2[pros.length]=new Events(name,price,ea,0.5);
			}else{
				pros2[pros.length]=new Product(name,price,ea);
			}
			pros=pros2;
			System.out.print("아무키나 눌러주세요(0.그만)");
			if(sc.nextLine().equals("0")){
				break;
			}
		}
//		pros[0] = new Product("물",900,5);
//		pros[1] = new Product("담배",4500,2);
//		pros[2] = new Events("빼빼로",3000,1,0.1);
		System.out.println("------------------<절취선>--------------------");
		System.out.println("영수증 출력");
		System.out.println("----------------------------------------------");
		System.out.println("품명\t\t가격\t갯수\t합계");
		System.out.println("----------------------------------------------");
		for(int i=0; i<pros.length; i++){
			pros[i].showTot();
		}
		System.out.println("----------------------------------------------");
		System.out.println("총 금액:\t\t\t\t"+Product.tot);
	}

}










