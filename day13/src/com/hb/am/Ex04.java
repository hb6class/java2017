package com.hb.am;

public class Ex04 {

	public static void main(String[] args) {
		// 문자열
		int a=100;
		float b = 3.14F;
		String c = "문자열";
		String d = new String("문자열");
		
		System.out.println(d);
		System.out.println(d.toString());
		System.out.println(c==d);
		System.out.println(c=="문자열");
		String e=c+a;
		System.out.println(e);
		System.out.println("year"+(2000+17));
		System.out.println(2000+17+"년");
		System.out.println(b+"는 파이값");
		System.out.println("파이:"+b);
		System.out.println("------------------------");
		String st = "안녕 하십니까?";
		char[] ch = new char[st.length()];
		st.getChars(0, st.length(), ch, 0);
		for(int i=0; i<ch.length; i++){
			System.out.println(ch[i]);
		}
		System.out.println("------------------------");
		System.out.println("문자열의 길이:"+st.length());
		System.out.println("------------------------");
		System.out.println("참조변수내용으로 시작하느냐:"
								+st.startsWith("안녕"));
		System.out.println("참조변수내용으로 끝나느냐:"
								+st.endsWith("까?"));
		System.out.println("------------------------");
		System.out.println(st.substring(3));
		System.out.println("하십니까?");
		System.out.println(st);
		System.out.println(st.substring(3,5));
		System.out.println("------------------------");
		System.out.println(st.charAt(3));
		System.out.println("------------------------");
		System.out.println("java".concat("World"));
		System.out.println("java"+"World");
		System.out.println("javaWorld");
		System.out.println("------------------------");
		System.out.println("abcdef"=="abc".concat("def"));
		System.out.println("abcdef"==new String("abcdef"));
		System.out.println("abcdef"=="abc"+"def");
		System.out.println("abcdef"=="abcdef");
		System.out.println(st.equals(new String("안녕 하십니까?")));
		System.out.println("abcdef"=="ABCDEF");
		System.out.println("abcdef".equals("ABCDEF"));
		System.out.println("abcdef".equalsIgnoreCase("ABCDEF"));
		System.out.println("------------------------");
		st = "안녕 하십니까?";
		System.out.println(st.indexOf("하십"));
		System.out.println(st.indexOf(" "));
		System.out.println(st.indexOf("안"));
		System.out.println(st.indexOf("자바"));
		st = "abcdefg";// 97, 98, 99, 100
		System.out.println(st.indexOf(100));
		System.out.println(st.indexOf('d'));
		System.out.println(st.indexOf('z'));
		st = "ababcabcd";
		System.out.println(st.indexOf('a'));
		System.out.println(st.lastIndexOf('a'));
		System.out.println("------------------------");
		st="javaWorld";
		char[] buffer = new char[st.length()];
		st.getChars(0, st.length(), buffer, 0);
		System.out.println(new String(buffer));
		System.out.println(String.copyValueOf(buffer));
		System.out.println(String.valueOf(buffer));
		System.out.println(String.valueOf(1000));
		String st2=String.valueOf(1000);
		String st3=String.valueOf(3.14);
		String st4=String.valueOf('a');
		System.out.println("------------------------");
		System.out.println(st.toUpperCase());
		System.out.println(st);
		System.out.println(st.toUpperCase().toLowerCase());
		System.out.println("------------------------");
		System.out.println("   java   ".trim());
		System.out.println("   java  World ".trim());
		System.out.println("------------------------");
		st="HelloJavaWorld";
		System.out.println(st.replace("Java", "Spring"));
		System.out.println(st);
		System.out.println(st.replace("Java", ""));
		System.out.println(st.replace("J", "j"));
		System.out.println(st.replace('J', 'j'));
		System.out.println(st.replace('a', 'A'));
		
		System.out.println("-------------------------------");
//		"java"+"World"="HelloWorld"
//		"HelloWorld" + "Java" = "HelloJavaWorld"
		System.out.println("-------------------------------");
//		주민번호를 입력해주세요> 990101-1234567
//		당신은 00세 남성으로 성인입니다
//		당신은 00세 남성으로 미성년자입니다
		
//		>9901011234567
//		>990101-123456
//		>구구공일공일-123456
//		-> 다시확인하시고 입력해주세요
	}

}


























