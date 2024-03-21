package com.jdbc.march14;
/*Write plain java program to set data into Employee list with Salary of last 3 years. 
Java Object Structure to follow below Employee(id,name,List<Salary>),
 *  Salary (year,salary)Print the above employee list using toString()
 */
import java.util.*;
class Jyothi_Prog4{
		public static void main(String []args)
		{
			ArrayList<Salary>sal=new ArrayList<>();
			/*Salary s=new Salary((2020,1000));
			/*s.setYear(2020);
			s.setSalary(1000);
			sal.add(s);*/
			sal.add(new Salary(2021,1000));
			sal.add(new Salary(2022,2000));
			sal.add(new Salary(2023,3000));
			Employee2 e=new Employee2();
			e.setId(1);
			e.setName("jyothi");
			e.setSal(sal);
			System.out.println(e.toString());
		}
}

