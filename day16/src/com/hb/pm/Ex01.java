package com.hb.pm;

public class Ex01 {

	public static void main(String[] args) {
		// ����ó��
		// ����
		// ����
		char[] ch = {'a','b','c','d','e'};
		
		for(int i=0; i<=10; i++){
			
			try{//�õ�
				System.out.println(ch[i]);
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}

	}

}
