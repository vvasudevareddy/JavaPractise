package com.criticalThinking.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterString {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		 * 1. Register the Driver Software
		 * 2.Create Connection
		 * 3.Statement
		 * 4.ResultSet
		 */
	System.out.println("Welcome");
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ems","root","password");
		String str="insert into employee values(33,'kjkjc')";
		Statement st=con.createStatement();
		st.execute(str);
	ResultSet resultSet=st.executeQuery("select * from employee");
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2));
	}
 
		
		
	}

}
