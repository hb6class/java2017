package com.hb.ora;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

public class Lec03Add {

	public static void main(String[] args) {
		// ����Ŭ lec03 ���̺� ����
		// curd
		// 1.�Է�
		
		// ����Ŭ url ����
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Properties info = new Properties();
		FileInputStream fis = null;
		Connection conn = null;
		Statement stmt = null;
		try {
			fis = new FileInputStream("./info.properties");
			info.load(fis);
			OracleDriver ora = new oracle.jdbc.driver.OracleDriver();
			conn = DriverManager.getConnection(url, info);
//			System.out.println("���Ӽ���:"+conn.toString());
			///////
			stmt = conn.createStatement();
			for(int i=1; i<10; i++){
				String sql="insert into lec03 (num,name,nalja) ";
				sql+=" values (";
				sql+=1111*i+",'user"+i+"',sysdate)";
			stmt.executeUpdate(sql);
			}
			///////
			System.out.println("�Է� ����");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)stmt.close();
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
