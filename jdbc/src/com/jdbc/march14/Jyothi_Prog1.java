package com.jdbc.march14;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*Create Java Classes Employee (int id, String name, Department dept), Department(int id, String name).
DB: Employee (id,name,departmentId), Department (id,name)
1) Write a method to retrieve and return Employee List  with Department (only 1 dept tagged for a user) from DB.
 in main method print data as string from Employee List using toString in Objects*/
public class Jyothi_Prog1 {
	static Connection con=null;
	static Statement st=null;
	static ResultSet rs=null;
	static ArrayList<Employee>al=new ArrayList<>();
	public static ArrayList<Employee> fun(String s)
	{
		try {
			rs=st.executeQuery(s);
			Employee e;
			while(rs.next())
			{
				e=new Employee();
				e.setid(rs.getInt(1));
				e.setname(rs.getString(2));
				Department d=new Department();
				d.setdeptid(rs.getInt(1));
				d.setdeptname(rs.getString(3));
				e.setDept(d);
				al.add(e);
				e=null;
				d=null;
			}
			
		} 
		catch (SQLException e1) {
			e1.printStackTrace();
		}
		return al;
		
	}
	public static void main(String []args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			System.out.println("connected to the database");
			st=con.createStatement();
			String s="select id,name,deptname from employee e inner join department d where e.deptid=d.deptid";
			ArrayList<Employee>rs=fun(s);
			if(rs!=null)
			{
				for(Employee e:rs)
				{
					System.out.println(e.toString());
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			try {
				if(con!=null)
					con.close();
				if(st!=null)
					st.close();
				if(rs!=null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
