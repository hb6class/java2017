package com.hb.am;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 성적관리프로그램(v 7.2.0)
		System.out.println("성적관리프로그램(v 7.2.0)\n\n");
		Scanner sc = new Scanner(System.in);
		Ex02 me = new Ex02();
		while(me.start(sc)){
		}
		System.out.println("사용해주셔서 감사합니다");
	}

	
	public void showMenu(){
		System.out.println("------------------------------------");
		System.out.print("1.보기 2.입력 0.종료>");
	}
	public boolean start(Scanner sc){
		
		showMenu();
		int input=Integer.parseInt(sc.next());
				
		if(input==1){
			//보기
			try {
				view();
			} catch (IOException e) {
				System.out.println("보기 오류");
			}
		}else if(input==2){
			//입력
			System.out.print("학번>");
			int num=Integer.parseInt(sc.next());
			System.out.print("국어>");
			int kor=Integer.parseInt(sc.next());
			System.out.print("영어>");
			int eng=Integer.parseInt(sc.next());
			System.out.print("수학>");
			int math=Integer.parseInt(sc.next());
			try {
				add(num,kor,eng,math);
				System.out.println("입력완료");
			} catch (IOException e) {
				System.out.println("입력실패");
			}
		}else if(input==0){
			//종료
			return false;
		}
		return true;
	}
	public void add(int num, int kor, int eng, int math) throws IOException{
		File file = new File("./text/student.txt");
		char[] cbuf = new char[12];
		int cnt=0;
		String db="";
		FileReader fr = new FileReader(file);
		while((cnt=fr.read(cbuf))!=-1){
			if(cnt==cbuf.length){
				db+=new String(cbuf);
			}else{
				char[] cbuf2=Arrays.copyOfRange(cbuf, 0, cnt);
				db+=new String(cbuf2);				
			}
		}
		String stu=db+num+"/"+kor+"/"+eng+"/"+math+"\r\n";
		FileWriter fw = new FileWriter(file);
		fw.write(stu);
		fr.close();
		fw.close();
	}
	
	public void view() throws IOException{
		ArrayList<String> list = new ArrayList<String>();
		char[] cbuf = new char[12];
		int cnt=0;
		File file = new File("./text/student.txt");
		if(!file.exists()){
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		while(true){
			cnt=fr.read(cbuf, 0, cbuf.length);
			if(cnt==-1)break;
			list.add(new String(cbuf));			
		}
		System.out.println("총 인원:"+list.size());
		System.out.println("학번\t국어\t영어\t수학");
		for(String st:list){
			System.out.println("---------------------------------");
			st=st.substring(0, st.indexOf((int)'\r'));
			String[] sts=st.split("/");
			System.out.println(sts[0]+"\t"+sts[1]+"\t"+sts[2]+"\t"+sts[3]);
		}
	}
}







