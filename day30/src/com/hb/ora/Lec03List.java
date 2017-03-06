package com.hb.ora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Lec03List {

	public static void main(String[] args) {
		// 보기
		String sql="select * from lec03 order by num desc";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		new oracle.jdbc.driver.OracleDriver();
		Properties info = new Properties();
		info.setProperty("user", "scott");
		info.setProperty("password", "tiger");
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			conn=DriverManager.getConnection(url, info);
			stmt=conn.createStatement();
			rs = stmt.executeQuery(sql);
			System.out.println("사번\t이름\t날짜");
			while(rs.next()){
				System.out.print(rs.getInt(1));
				System.out.print('\t');
				System.out.print(rs.getString(2));
				System.out.print('\t');
				System.out.println(rs.getDate(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}

	}

}
