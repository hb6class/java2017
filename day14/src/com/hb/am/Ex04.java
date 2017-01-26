package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		// 문자
		char[] ch1 ={' ','a','1','A','한','@'};
		Character ch2 = new Character('a');
		for(int i=0; i<ch1.length; i++){
			System.out.print(ch1[i]+"는");
			if(Character.isDefined(ch1[i])){
				System.out.print("유니코드이고 ");
			}
			if(Character.isLetter(ch1[i])){
				System.out.print("문자");
				if(Character.isAlphabetic(ch1[i])
						&& Character.isUpperCase(ch1[i])){
					System.out.println("이며 알파벳 대문자입니다");
				}else if(Character.isAlphabetic(ch1[i])
						&& Character.isLowerCase(ch1[i])){
					System.out.println("이며 알파벳 소문자입니다");
				}else{
					System.out.println("입니다");
				}
			}
			if(Character.isDigit(ch1[i])){
				System.out.println("숫자입니다");
			}
			if(Character.isSpace(ch1[i])){
				System.out.println("스페이스바입니다");
			}
		}
		
	}
}
