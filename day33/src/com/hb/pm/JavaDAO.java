package com.hb.pm;

import java.awt.Choice;
import java.awt.List;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaDAO {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String id="scott";
	String pw="tiger";
	Connection conn;
	Statement stmt;
	ResultSet rs;
	
	public void dbSellect(String sql, List list){
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pw);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				String item="";
				item+=rs.getString("vnum")+"||";
				item+=rs.getString("vname")+"||";
				item+=rs.getInt("kor")+"||";
				item+=rs.getInt("eng")+"||";
				item+=rs.getInt("math");
				list.addItem(item);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void dbNumSelect(String sql,TextField[] editTf){
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pw);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				editTf[0].setText(rs.getString("name"));
				editTf[1].setText(rs.getInt("kor")+"");
				editTf[2].setText(rs.getInt("eng")+"");
				editTf[3].setText(rs.getInt("math")+"");
				System.out.println(rs.getString("name")+","+rs.getInt("kor")+","+rs.getInt("eng")+","+rs.getInt("math"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void dbNumSelect(String sql,Choice editCho){
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pw);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				editCho.addItem(rs.getInt("num")+"");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	public void dbUpdate(String sql) {
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,id,pw);
			stmt=conn.createStatement();
			stmt.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}
}
