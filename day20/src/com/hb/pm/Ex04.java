package com.hb.pm;

import java.io.File;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file;
//		file=new File("c:\\java\\text\\aaa.txt");			// 절대경로
//		file=new File("./text/aaa.txt");			// 상대경로
		file=new File("./text");			// 상대경로
		
		System.out.println("파일 유무:"+file.exists());
		if(file.exists()){
			System.out.println("디렉토리:"+file.isDirectory());
			System.out.println("파일:"+file.isFile());
			if(file.isFile()){
			System.out.println("파일길이:"+file.length());
			System.out.println("읽기 권한:"+file.canRead());
			System.out.println("쓰기 권한:"+file.canWrite());
			System.out.println("절대 경로1:"+file.getAbsolutePath());
			System.out.println("절대 경로2:"+file.getCanonicalPath());
			System.out.println("상대 경로:"+file.getPath());
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
//			System.out.println("파일이 삭제 되었습니다");
//		}else{
//			System.out.println("파일 없습니다");
//		}
		
	}

}
