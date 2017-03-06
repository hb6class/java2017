package com.hb.ora;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Lec03Del {

	public static void main(String[] args) {
		// 삭제
		new oracle.jdbc.driver.OracleDriver();
		String sql="delete from lec03 where num=1111";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn=null;
		Statement stmt=null;
		Properties info = new Properties();//정보 map
//		info.setProperty("user", "scott");
//		info.setProperty("password", "tiger");
//		FileInputStream fis=null;
		
		try {
//			fis=new FileInputStream("./info.properties");
//			info.load(fis);
			conn=DriverManager.getConnection(url,info);
			stmt=conn.createStatement();
			int cnt=stmt.executeUpdate(sql);
			if(cnt>0){
				System.out.println("삭제 성공:"+cnt);
			}else{
				System.out.println("삭제 실패:"+cnt);
			}
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
//				if(fis!=null)fis.close();
			} catch (SQLException e) {
				e.printStackTrace();
//			} catch (IOException e) {
//				e.printStackTrace();
			}
		}
		
	}

}













