package com.hb.am;

import java.util.Arrays;

public class Ex04 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch1 = {'j','a','v','a'};
//		char[] ch2 = new char[ch1.length];
//		int cnt=0;
//		for(char tmp : ch1){
//			ch2[cnt++]=tmp;
//		}
		////////////////////////////////////
//		System.arraycopy(ch1, 0, ch2, 0, ch1.length);
		////////////////////////////////////
//		char[] ch2 = Arrays.copyOf(ch1, ch1.length);
		////////////////////////////////////
//		char[] ch2 = Arrays.copyOfRange(ch1, 0, 4);
//		ch1[0]='J';
//		System.out.println(ch2.length);
//		for(char tmp : ch2){
//			System.out.println(tmp);
//		}
		////////////////////////////////////
		Arrays.sort(ch1);
		int idx=Arrays.binarySearch(ch1, 'j');
		System.out.println("j:"+idx);
		int[] lotto ={43,23,12,27,3,32};
		Arrays.sort(lotto);
		System.out.println(Arrays.binarySearch(lotto, 44));
		////////////////////////////////////
		String[] st={"È«±æµ¿","ÀÚ¹Ù","±èÀ»µ¿","¹ÚÀÚ¹Ù","È«ÀÚ¹Ù"};
		Arrays.sort(st);		
		System.out.println(Arrays.binarySearch(st, "È«±æµ¿"));
		for(String tmp:st){
			System.out.println(tmp);
		}
		////////////////////////////////////
		System.out.println("--------------------------------------------");
		Ex04 me = new Ex04();
		Ex04.Names arr1= me.new Names("È«±æµ¿");
		Ex04.Names arr2= me.new Names("ÀÌÀÚ¹Ù");
		Ex04.Names arr3= me.new Names("±èÀÚ¹Ù");
		
		Ex04.Names[] arrs={arr1,arr2,arr3};
		Arrays.sort(arrs);
		System.out.println(Arrays.binarySearch(arrs, arr1));
		for(Ex04.Names tmp:arrs){
			System.out.println(tmp);
		}
	}
	
	class Names implements Comparable<Names>{
		String name;
		public Names(String name) {
			this.name=name;
		}
		@Override
		public String toString() {
			return name;
		}
		@Override
		public int compareTo(Names o) {
			return name.compareTo(o.name);
		}
	}

}
















