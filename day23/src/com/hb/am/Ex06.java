package com.hb.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("./text/data.txt");
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		try {
			fis=new FileInputStream(file);
			ois=new ObjectInputStream(fis);
			Student stu=(Student)ois.readObject();
			System.out.println(stu.kor);
			System.out.println(stu.eng);
			System.out.println(stu.math);
			System.out.println(stu.jumin);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
