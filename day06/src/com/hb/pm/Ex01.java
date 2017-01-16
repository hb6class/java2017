package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
		// 1+2+3+4+5=;
		// Q1. 1~10까지중 홀수합	hel(10)
		int num=1;
		int tot=0;
		while(num<6){
			tot=tot+num;
			num++;
		}
		System.out.println("1+2+3+4+5="+tot);
		System.out.println("1+2+3+4+5="+tot(5));
		System.out.println("1+2+3+4+5="+sum(5,0));		
		System.out.println("1+2+3+4+5="+sum(5));		
		System.out.println("1+3+5+7+9="+hel(10));
	}
	public static int hel(int su){
		if(su==1){
			return 1;
		}
		int sum=0;
		if(su%2==0){
			sum=hel(--su);
		}else{
			sum=su+hel(--su);	//9+7+5+3+1;
		}
		return sum;
	}
	
	public static int sum(int a){
//		재귀함수
//		5+4+3+2+1
//		5+(4+3+2+1)
//		5+(4+(3+2+1))
//		5+(4+(3+(2+1)))
//		5+(4+(3+(2+(1))))
		if(a==1)return 1;
		int tot = a--+sum(a);	
		return tot;
	}
	public static int sum(int a, int tot){
		while(a>0){
			tot=tot+a;
			a--;
		}
		return tot;
	}
	public static int tot(int a){
		int tot = 0;
		while(true){
			tot=tot+a;
			a--;
			if(a==0){break;}
		}
		return tot;
	}

}








