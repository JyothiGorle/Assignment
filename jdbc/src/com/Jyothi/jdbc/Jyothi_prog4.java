package com.Jyothi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jyothi_prog4 {
	static Connection con=null;
	static Statement st=null;
	ResultSet rs=null;
	void connect()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_practice","root","root");
			System.out.println("connected to the database");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	StringBuilder display(String q)
	{
		StringBuilder str=new StringBuilder();
		try {
			rs=st.executeQuery(q);
			while(rs.next())
			{
				int Department_id=rs.getInt("dept_id");
				String Department_name=rs.getString("dept_name");
				str.append(Department_id);
				str.append(" ");
				str.append(Department_name);
				str.append("\n");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(st!=null)
					st.close();
				if(rs!=null)
					rs.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		return str;
	}
	public static void main(String []args)
	{
		Jyothi_prog4 ob=new Jyothi_prog4();
		String s="select * from department1";
		ob.connect();
		System.out.println(ob.display(s));
		
		
	}
}
