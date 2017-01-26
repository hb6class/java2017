package com.hb.pm;

public class Ex02 {

	public static void main(String[] args) {
//		주민번호를 입력해주세요> 990101-1234567
		
//		> 입력하신 번호는 990101-1234567
//		당신은 00세 남성으로 성인입니다
//		당신은 00세 남성으로 미성년자입니다
		////////////////////////////////////////
//		주민번호를 입력해주세요> 구구공일공일-일이삼사오육칠
		
//		> 입력하신 번호는 990101-일234567
//		당신은 00세 남성으로 성인입니다
//		당신은 00세 남성으로 미성년자입니다
		////////////////////////////////////////
//		{'0'~'9'}
//		{'영'~'구'}
		char[] pttn1= new char[10];
//		for(int i=0;i<pttn1.length; i++){
//			pttn1[i]=(char)('0'+i);
//		}
		pttn1=new char[]{'0','1','2','3','4','5','6','7','8','9'};
		char[] pttn2={'영','일','이','삼','사','오','육','칠','팔','구'};
		String input = "구구영일영일-일이삼사오육칠";
		
		boolean lng=chkLng(input);//길이가 14가 맞는지
		if(lng){
			for(int i=0; i<input.length(); i++){
				char ch=input.charAt(i);
				if(i==6){
					if(ch!='-'){
						System.out.println("[000000-0000000]형식에 맞춰서 작성해주세요");
						lng=false;
					}
					continue;
				}
				if(ch>='0'&&ch<='9'){}else{
//		pttn1=new char[]{'0','1','2','3','4','5','6','7','8','9'};
//		char[] pttn2={'영','일','이','삼','사','오','육','칠','팔','구'};
					int j=0;
					for(j=0; j<pttn2.length; j++){
						if(pttn2[j]==ch){break;}
					} 
					if(j==pttn2.length){
						System.out.println("입력오류");
						lng=false;
					}else{
						input=input.substring(0, i)
							+pttn1[j]+input.substring(i+1, input.length());
					}
				}
			}//for end
			if(lng){
				String msg="당신은 ";
				msg+=cntAge(input.charAt(0),input.charAt(1),input.charAt(7));
				msg+="세 "+gender(input.charAt(7))+"자로써 ";
				if(cntAge(input.charAt(0),input.charAt(1),input.charAt(7))>18){
					msg+="성년 입니다";
				}else{
					msg+="미성년자 입니다";
				}
				System.out.println(msg);
			}
		}else{
			System.out.println("입력길이 14자 입니다");
		}
	}
	public static char gender(char a){
		if(a=='1'||a=='3'){
			return '남';
		}else if(a=='2'||a=='4'){
			return '여';
		}
			return 'x';
	}
	public static int cntAge(char a, char b, char c){
		int year=0;
		if(c=='1'||c=='2'){
			year=1900;
		}else if(c=='3'||c=='4'){
			year=2000;
		}
		int age = 2017 -(year+
				Integer.parseInt(String.valueOf(new char[]{a,b})))+1;
		
		return age;
	}
	public static boolean chkLng(String input){
		boolean lng=true;
		if(input.length()!=14){
			lng=false;
		}
		return lng;
	}

}




















