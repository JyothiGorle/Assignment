package com.Jyothi.jdbc;
import java.sql.*;
/*Implement a Java class that encapsulates database operations for a specific table (e.g., "Employee"). 
 * Include methods for inserting a new record, updating an existing record, deleting a record, and retrieving records 
 * based on certain criteria. Make sure to handle exceptions appropriately.
 */
public class Jyothi_prog3 {
	static Connection con=null;
	static Statement st=null;
	static ResultSet rs=null;
	int Department_id;
	String Department_name;
	void display()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_practice","root","root");
			System.out.println("Connection established to the Database");
			st=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	void insert()
	{
		PreparedStatement ps = null;
		try {
			String s="insert into department1 values(?,?)";
			ps=con.prepareStatement(s);
			ps.setInt(1, 7);
			ps.setString(2,"HR");
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void update()
	{
		PreparedStatement ps = null;
		try {
			String s="Update department1 set dept_name=? where dept_id=?";
			ps=con.prepareStatement(s);
			ps.setString(1, "Testing");
			ps.setInt(2, 3);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void delete()
	{
		PreparedStatement ps = null;
		try {
			String s="delete from department1 where id=?";
			ps=con.prepareStatement(s);
			ps.setInt(1, 3);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	void retrive()
	{
		StringBuilder str=new StringBuilder();
		try {
			String s="select * from department1";
			rs=st.executeQuery(s);
			while(rs.next())
			{
				Department_id=rs.getInt("dept_id");
				Department_name=rs.getString("dept_name");
				str.append(Department_id);
				str.append(" ");
				str.append(Department_name);
				str.append("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Jyothi_prog3 ob=new Jyothi_prog3();
		ob.display();
		ob.retrive();
		ob.insert();
		ob.retrive();
		ob.update();
		ob.retrive();		
		ob.delete();
		ob.retrive();		
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
			System.out.println(e.getMessage());
		}
	}
}
