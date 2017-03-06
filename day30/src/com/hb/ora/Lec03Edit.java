package com.hb.ora;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Lec03Edit {

	public static void main(String[] args) {
		// 수정
		String sql="update lec03 set name='user03' where num=3333";
		String url="jdbc:oracle:thin:@203.236.209.193:1521:xe";
		new oracle.jdbc.driver.OracleDriver();
		
		Properties info = new Properties();
		FileInputStream fis=null;
		Connection conn =null;
		Statement stmt=null;
		try {
			fis=new FileInputStream("./info.properties");
			info.load(fis);
			conn=DriverManager.getConnection(url, info);
			stmt=conn.createStatement();
			int cnt=stmt.executeUpdate(sql);
			if(cnt>0)
				System.out.println("수정성공:"+cnt);
			else 
				System.out.println("수정실패");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)conn.close();
				if(fis!=null)fis.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
