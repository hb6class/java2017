package com.hb.am;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print(">");
		InputStream inn = System.in;
		File file = new File("./text/data.txt");
		FileInputStream fis = null;
		try {
			fis=new FileInputStream(file);
			Scanner sc = new Scanner(fis);
//			while(sc.hasNextLine()){
//				System.out.println(sc.nextLine());
//			}
//			while(sc.hasNext()){
//				System.out.println(sc.next());
//			}
			System.out.println(sc.next());
			System.out.println(sc.next());
			System.out.println(sc.hasNextInt());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		System.out.println("입력값은 ->"+sc.next());
//		System.out.println("입력값은 ->"+sc.nextLine());
//		System.out.println("입력값은 ->"+sc.nextInt());
//		System.out.println("입력값은 ->"+sc.nextDouble());
	}

}
