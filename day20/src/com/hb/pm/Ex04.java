package com.hb.pm;

import java.io.File;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file;
//		file=new File("c:\\java\\text\\aaa.txt");			// ������
//		file=new File("./text/aaa.txt");			// �����
		file=new File("./text");			// �����
		
		System.out.println("���� ����:"+file.exists());
		if(file.exists()){
			System.out.println("���丮:"+file.isDirectory());
			System.out.println("����:"+file.isFile());
			if(file.isFile()){
			System.out.println("���ϱ���:"+file.length());
			System.out.println("�б� ����:"+file.canRead());
			System.out.println("���� ����:"+file.canWrite());
			System.out.println("���� ���1:"+file.getAbsolutePath());
			System.out.println("���� ���2:"+file.getCanonicalPath());
			System.out.println("��� ���:"+file.getPath());
			System.out.println(file.getName());
			System.out.println(file.getParent());
			}else if(file.isDirectory()){
				File[] f=file.listFiles();
				for(int i=0; i<f.length; i++){
					System.out.println(f[i].getName());
				}
			}
		}
//		if(file.delete()){
//			System.out.println("������ ���� �Ǿ����ϴ�");
//		}else{
//			System.out.println("���� �����ϴ�");
//		}
		
	}

}
