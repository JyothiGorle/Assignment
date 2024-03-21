package com.jdbc.march14;
import java.util.*;
public class Employee2 {
	private int id;
	private String name;
	private ArrayList<Salary>sal;
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
	public ArrayList<Salary> getSal() {
		return sal;
	}
	public void setSal(ArrayList<Salary> sal) {
		this.sal = sal;
	}
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Employee");
		sb.append("[");
		sb.append(this.id);
		sb.append(",");
		sb.append(this.name);
		sb.append(",");
		sb.append(this.sal);
		sb.append("]");
		return sb.toString();
	}
}
