package com.hb.am;

import java.util.StringTokenizer;

public class Ex06 {

	public static void main(String[] args) {
		String st1="java,web,oracle,web,,,spring";
		
		String[] arr1=st1.split(",");
		System.out.println(arr1.length);
		for(String tmp:arr1){
			System.out.println(tmp);
		}
		System.out.println("--------------------------");
		StringTokenizer token = new StringTokenizer(st1,",");
		while(token.hasMoreTokens()){
			System.out.println(token.nextToken());
		}
		System.out.println("--------------------------");
		StringTokenizer token2 = new StringTokenizer(st1,",");
		int cnt=token2.countTokens();
		System.out.println(cnt);
		for(int i=0; i<cnt; i++){
			System.out.println(i+":"+token2.nextToken()
					+",cnt="+token2.countTokens());
		}
	}

}







