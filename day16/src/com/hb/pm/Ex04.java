package com.hb.pm;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		try{
				try{
					throw new NumberFormatException("���ھƴ�");
				}catch(NumberFormatException e){
					System.out.println(e.getMessage());
					throw new ArithmeticException("catch���� ���� �޽���");
				}
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		System.out.println("end");
	}

}
