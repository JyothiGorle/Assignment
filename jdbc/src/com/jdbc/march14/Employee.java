package com.jdbc.march14;
public class Employee {
	private int id;
	private String name;
	private Department dept;
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return "Employee [id="+this.id+",name="+this.name+",deptname="+this.dept.getdeptname()+"]";
	}
}

	