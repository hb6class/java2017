package com.hb.pm;

class UserErr extends Exception{
	public UserErr(String msg) {
		super(msg);
	}
}

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("start");
		
		try{
			throw new UserErr("id는 특수문자 불가");
		}catch(UserErr err){
			System.out.println(err.getMessage());
		}
		
		System.out.println("end");
	}

}
