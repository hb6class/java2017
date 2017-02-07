package com.hb.am;

import java.util.Objects;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1 ="java";
		String st2 =null;//"";
		
		if(st2==null){
			System.out.println("st2==null");
		}else{
			System.out.println(st2);
		}
		System.out.println("------------------------");
		System.out.println(Objects.toString(st1));
		System.out.println(Objects.toString(st2,"비었음"));
		
		
//		System.out.println(Objects.isNull(st1));
//		System.out.println(Objects.isNull(st2));
//		System.out.println(Objects.nonNull(st1));
//		System.out.println(Objects.nonNull(st2));
//		System.out.println(Objects.requireNonNull(st1));
//		try{
//			if(st2==null){
//				throw new NullPointerException("던진 널");
//			}
//		}catch(NullPointerException ex){
//			System.out.println(ex.getMessage()+"if(st2==null)-null에러");
//		}
//		try{
//			System.out.println(Objects.requireNonNull(st2,"널"));
//		}catch(NullPointerException ex){
//			System.out.println(ex.getMessage()+"-null에러");
//		}
	}

}














