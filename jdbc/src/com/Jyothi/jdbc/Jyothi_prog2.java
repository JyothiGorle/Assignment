package com.Jyothi.jdbc;
import java.sql.*;
/*Create a Java method that takes a SQL query as input and executes it using JDBC. 
 * The method should return a ResultSet containing the results of the query. Ensure proper error handling.
 */

public class Jyothi_prog2 {
	static Connection con=null;
	static Statement st=null;
	ResultSet rs=null;
	public ResultSet  db(String q)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_practice","root","root");
			System.out.println("connected to the database");
			st=con.createStatement();
			rs=st.executeQuery(q);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return rs;
	}
	public static void main(String []args)
	{
		Jyothi_prog2 ob=new Jyothi_prog2();
		String s="select * from department1";
		ResultSet rs=ob.db(s);
		StringBuilder str=new StringBuilder();
		try {
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

		System.out.println(str);
		
	}
}
