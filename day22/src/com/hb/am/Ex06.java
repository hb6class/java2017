package com.hb.am;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
	private File file;
	private ArrayList<int[]> list;
	private char[] cbuff;
	private int cnt;
	
	public Ex06() {
		cbuff=new char[512];
		file = new File("./text/student.txt");
		list = new ArrayList<int[]>();
		try {
			if(!file.exists())file.createNewFile();
			setting();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void setting() throws IOException{
		String tot="";
		FileReader fr =null;
		try{
			fr= new FileReader(file);
			while((cnt=fr.read(cbuff))!=-1){
				if(cnt!=cbuff.length)cbuff=Arrays.copyOfRange(cbuff, 0, cnt);
				tot+=new String(cbuff);
			}
			cbuff=new char[512];
			String[] st1=tot.split("\r\n");
			for(int i=0; i<st1.length; i++){
				String[] st2=st1[i].split("/");
				int[] stu = new int[st2.length];
				for(int j=0; j<stu.length; j++){
					stu[j]=Integer.parseInt(st2[j]);
				}
				list.add(stu);
			}
		}finally{
			fr.close();
		}
	}
	
	public static void main(String[] args) {
		// 성적관리프로그램(v 7.2.0)
		System.out.println("성적관리프로그램(v 7.2.0)\n\n");
		Scanner sc = new Scanner(System.in);
		Ex06 me = new Ex06();
		while(me.start(sc)){
			System.out.println();
			System.out.println();
			System.out.println();
		}
		System.out.println("사용해주셔서 감사합니다");
	}
	public void view() throws IOException{
		System.out.println("--------------------------------------");
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("--------------------------------------");
		for(int[] stu:list){
			for(int num : stu){
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
	}
	
	public void showMenu(){
		System.out.println("------------------------------------");
		System.out.print("1.보기 2.입력 3.수정 4.삭제 5.저장 0.종료>");
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
	private void add(int num, int kor, int eng, int math) throws IOException {}
}
