package com.Jyothi.jdbc;
import java.sql.*;
/*Write a Java program to establish a connection to a MySQL database using JDBC. Include code to handle any potential exceptions.*/
public class Jyothi_prog1 {
	public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_practice","root","root");
				System.out.println("connected to the database");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
