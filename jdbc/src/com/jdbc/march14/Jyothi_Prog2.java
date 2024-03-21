package com.jdbc.march14;

import java.sql.*;
import java.util.Scanner;
/* WAP to insert list of employees (only employees) in to database using stringBuilder to create insert query.*/
public class Jyothi_Prog2 {
		static Connection con=null;
		static Statement st=null;
		ResultSet rs=null;
		static int id;
		static String name;
		static int deptid;
		public static void insert(int list,int id1,String name1,int deptid1) throws SQLException
		{
			StringBuilder sb=new StringBuilder("insert into employee(id,name,deptid) values ");
			int i=0;
			while(list!=0)
			{	
				sb.append("(");
				sb.append(id1);
				sb.append(",\"");
				sb.append(name1);
				sb.append("\",");
				sb.append(deptid1);
				sb.append(")");
				if(i<list-1) {
					sb.append(", ");
				}else {
					sb.append(";");
				}
				list--;
				i++;
			}
			String value = sb.toString();
			System.out.println(value);
			PreparedStatement ps = con.prepareStatement(value);
			ps.execute();
			System.out.println("Insertion is successful");
		}
	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			System.out.println("connected to the database");
			st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the count of employees list:");
			int n=sc.nextInt();
			System.out.println("enter the id:");
			id=sc.nextInt();
			System.out.println("enter the name:");
			name=sc.next();
			System.out.println("enter the deptid:");
			deptid=sc.nextInt();
			insert(n,id,name,deptid);
		}
		catch(Exception e) {
			System.out.println(e);
	}
}
	
}
