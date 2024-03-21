package com.jdbc.march14;

public class Department {
	private int deptid;
	private String deptname;
	public int getdeptid()
	{
		return deptid;
	}
	public void setdeptid(int deptid)
	{
		this.deptid=deptid;
	}
	public String getdeptname()
	{
		return deptname;
	}
	public void setdeptname(String deptname)
	{
		this.deptname=deptname;
	}
	public String toString()
	{
		return "Department [id="+this.deptid+",name="+this.deptname+"]";
	}
}
