package com.jdbc.march15;

import java.sql.*;
import java.util.*;
public class Jyothi_Prog1 {
	public static void main(String[] args) {
		Connections_class ob=new Connections_class();
		Employee e=new Employee();
		Department d=new Department();
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);
		try {
			boolean val=ob.fun();
			if(val==true)
				System.out.println("connected to the database");
			else
				System.out.println("Not connected");
			e.setId(5);
			e.setName("rama");
			e.setDeptid(5);
			ob.insert(e.getId(),e.getName(),e.getDeptid());
			ob.Employeeretrive();
			d.setDeptid(3);
			d.setDeptname("QA");
			ob.update(d.getDeptid(), d.getDeptname());
			ob.departmentretrive();
			ob.delete(d.getDeptid());
			ob.departmentretrive();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
