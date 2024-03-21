package com.jdbc.march15;
import java.sql.*;
public class Connections_class {
	Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	public boolean fun() throws SQLException
	{
		boolean flag=true;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(flag==true)
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","root");
			else
				flag=false;
			st=con.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return flag;
	}
	void insert(int id,String name,int deptid)
	{
		try {
			String q="insert into employee(id,name,deptid)values(?,?,?)";
			ps=con.prepareStatement(q);
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setInt(3,deptid);
			ps.execute();
			System.out.println("Values are inserted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	void Employeeretrive()
	{
		try {
			String q="select *from employee";
			rs=ps.executeQuery(q);
			StringBuilder sb=new StringBuilder();
			while(rs.next())
			{
				sb.append(rs.getInt(1));
				sb.append(" ");
				sb.append(rs.getString(2));
				sb.append(" ");
				sb.append(rs.getInt(3));
				sb.append("\n");
			}
			System.out.println(sb);
		}	
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	void update(int deptid,String deptname)
	{
		try {
			String s="Update department set deptname=? where deptid=?";
			ps=con.prepareStatement(s);
			ps.setString(1,deptname);
			ps.setInt(2, deptid);
			ps.execute();
			System.out.println("Records are updated successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void departmentretrive()
	{
		StringBuilder sb=new StringBuilder();
		try {
			String q="select *from department";
			rs=ps.executeQuery(q);
			while(rs.next())
			{
				sb.append(rs.getInt(1));
				sb.append(" ");
				sb.append(rs.getString(2));
				sb.append("\n");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(sb);
	}
	void delete(int deptid)
	{
		try {
			String s="delete from department where id=?";
			ps=con.prepareStatement(s);
			ps.setInt(1, deptid);
			ps.execute();
			System.out.println("Records are deleted successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
