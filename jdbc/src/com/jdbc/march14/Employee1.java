package com.jdbc.march14;
import java.util.*;
public class Employee1 {
	private int id;
	private String name;
	private ArrayList<String> dept;
	public Employee1(int id,String name,ArrayList<String> dept)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
	}
	public ArrayList<String> getDept() {
		return dept;
	}
	public void setDept(ArrayList<String> dept) {
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "Employee ["+this.id+","+this.name+","+this.dept+"]";
	}
}
