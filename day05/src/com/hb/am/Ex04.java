package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		// �޼ҵ带 Ȱ���ؼ� �Ʒ��� ����Ͻÿ�
		// *
		// **
		// ***
		// ****
		star(4);
		
	}//main end
	
	public static void star(int a){
		for(int i=0; i<a; i++){
			for(int j=0; j<i+1; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		
	}//star end
}//class end
