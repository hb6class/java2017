package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		// ����
		char[] ch1 ={' ','a','1','A','��','@'};
		Character ch2 = new Character('a');
		for(int i=0; i<ch1.length; i++){
			System.out.print(ch1[i]+"��");
			if(Character.isDefined(ch1[i])){
				System.out.print("�����ڵ��̰� ");
			}
			if(Character.isLetter(ch1[i])){
				System.out.print("����");
				if(Character.isAlphabetic(ch1[i])
						&& Character.isUpperCase(ch1[i])){
					System.out.println("�̸� ���ĺ� �빮���Դϴ�");
				}else if(Character.isAlphabetic(ch1[i])
						&& Character.isLowerCase(ch1[i])){
					System.out.println("�̸� ���ĺ� �ҹ����Դϴ�");
				}else{
					System.out.println("�Դϴ�");
				}
			}
			if(Character.isDigit(ch1[i])){
				System.out.println("�����Դϴ�");
			}
			if(Character.isSpace(ch1[i])){
				System.out.println("�����̽����Դϴ�");
			}
		}
		
	}
}
