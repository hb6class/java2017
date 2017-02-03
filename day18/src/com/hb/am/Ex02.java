package com.hb.am;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List alist = new ArrayList();//LinkedList();
//		List alist = new LinkedList();
		for(int i=0; i<99999; i++){
			alist.add(i);
		}
		System.out.println("입력끝");
		int tmp=0;
		for(int i=0; i<99999; i++){
			tmp=(Integer)alist.get(i);
		}
		System.out.println("종료 결과는 "+tmp);
		
	}

}
