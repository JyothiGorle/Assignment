package com.jdbc.march14;

import java.util.ArrayList;
/*/*Write plain Java classes Employee, Department (String[]) and perform CRUD operations on dept
  Ex: Employee : 1, Varma, ["IT","HR"] to 1, Varma, ["IT"] to 1, Vamsi, ["IT"] to to 1, Vamsi, []*/
public class Department1 {
	 private static ArrayList<String>dept;
	 public Department1()
	 {
		 this.dept=new ArrayList<>();
	 }
	 public void adddept(String deptname)
	 {
		 dept.add(deptname);
	 }
	 public void removedept(int index)
	 {
		 dept.remove(index);
	 }
	 public static void main(String[] args) {
		 ArrayList<String> al =new ArrayList<>();
		 al.add("IT");
		 al.add("HR");
		 Employee1 ob=new Employee1(1,"Jyothi",al);
		 System.out.println(ob.toString());
		 ob.getDept().remove("IT");
		 System.out.println(ob.toString());
		 ob.setName("Lavanya");
		 System.out.println(ob.toString());
		 ob.getDept().clear();
		 System.out.println(ob.toString());
//
//		 ob.dept.removedept(0);
//		 al.addAll(ob1.dept);
//		 System.out.println(ob.toString());
	}
	 		
}
