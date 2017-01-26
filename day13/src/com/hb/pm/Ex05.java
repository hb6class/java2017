package com.hb.pm;

import java.util.StringTokenizer;

public class Ex05 {

	public static void main(String[] args) {
		// String
		String st ="java,database,,jsp,spring";// ""
		String[] sts =st.split(",");
		System.out.println(sts.length);
		for(int i=0; i<sts.length; i++){
			System.out.println(sts[i]);
		}
		System.out.println("----------------------------");
		StringTokenizer token = new StringTokenizer(st,",");
		while(token.hasMoreTokens()){
			System.out.println(token.nextToken());
		}
	}

}
