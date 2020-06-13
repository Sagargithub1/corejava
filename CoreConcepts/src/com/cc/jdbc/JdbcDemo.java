package com.cc.jdbc;

import java.sql.*;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/learningDB?autoReconnect=true&useSSL=false","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from user095");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			}
			con.close();
			
		}
		catch(Exception e) {
		System.out.println(e);
		}
		
	}

}
