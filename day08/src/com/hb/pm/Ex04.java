package com.hb.pm;

import java.util.Scanner;

class Factory{
	int water,sugar;
//	100->33*3 +1
//	200->100*2+0
	void add(int a, int b){
		water+=a;
		sugar+=b;
	}
	void del(int a, int b){
		water-=a;
		sugar-=b;
	}
	// 아이스크림(1box) = 물(3리터) + 설탕(2그램)
	int show(){
		int cnt=0;
		if(water/3>=sugar/2){
			cnt=sugar/2;
		}else{
			cnt=water/3;
		}
		System.out.println("생산가능한 수량: "
						+cnt+"box");
		return cnt;
	}
	void delBox(int cnt){
		if(cnt<=show()){
			water-=cnt*3;
			sugar-=cnt*2;
		}else{
			System.out.println("생산가능수량을 넘었습니다");
		}
	}
}

public class Ex04 {

	public static void main(String[] args) {
		// 자제관리 프로그램
		// 아이스크림 공장(ver 1.0.0)
		// 아이스크림(1box) = 물(3리터) + 설탕(2그램)
		// 1.입고 2.출고 3.생산가능수량(box) 4.생산 0.종료
		// 1.입고 -> 1.물:	2. 설탕:
		// 2.출고 -> 1.물:	2. 설탕:
		// 3. -> 000box
		// 4.생산 -> box
		Scanner sc = new Scanner(System.in);
		String input="";
		int num=0;
		int water=0;
		int sugar=0;
		System.out.println("아이스크림 공장(ver 1.0.0)");
		Factory fac = new Factory();
		while(true){
			System.out.print("1.입고 2.출고 3.생산가능수량(box) 4.생산 0.종료>");
			input=sc.nextLine();
			num=Integer.parseInt(input);
			switch (num) {
			case 1:
				System.out.print("물 입고량(ℓ):");
				input=sc.nextLine();
				water=Integer.parseInt(input);
				System.out.print("설탕 입고량(g):");
				input=sc.nextLine();
				sugar=Integer.parseInt(input);
				fac.add(water,sugar);
				break;
			case 2:
				System.out.print("물 출고량(ℓ):");
				input=sc.nextLine();
				water=Integer.parseInt(input);
				System.out.print("설탕 출고량(g):");
				input=sc.nextLine();
				sugar=Integer.parseInt(input);
				fac.del(water,sugar);
				break;
			case 3:
				fac.show();
				break;
			case 4:
				System.out.print("생산량(box):");
				input=sc.nextLine();
				num=Integer.parseInt(input);
				fac.delBox(num);
				break;
			case 0:
				return;
			default:
				break;
			}
		}
	}

}















