package com.hb.am;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// �����������α׷�(v 7.2.0)
		System.out.println("�����������α׷�(v 7.2.0)\n\n");
		Scanner sc = new Scanner(System.in);
		Ex01 me = new Ex01();
		while(me.start(sc)){
		}
		System.out.println("������ּż� �����մϴ�");
	}

	
	public void showMenu(){
		System.out.println("------------------------------------");
		System.out.print("1.���� 2.�Է� 0.����>");
	}
	public boolean start(Scanner sc){
		
		showMenu();
		int input=sc.nextInt();
		if(input==1){
			//����
			try {
				view();
			} catch (IOException e) {
				System.out.println("���� ����");
			}
		}else if(input==2){
			//�Է�
		}else if(input==0){
			//����
			return false;
		}
		return true;
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
		System.out.println("�� �ο�:"+list.size());
		System.out.println("�й�\t����\t����\t����");
		for(String st:list){
			System.out.println("---------------------------------");
			st=st.substring(0, st.indexOf((int)'\r'));
			String[] sts=st.split("/");
			System.out.println(sts[0]+"\t"+sts[1]+"\t"+sts[2]+"\t"+sts[3]);
		}
	}
}







