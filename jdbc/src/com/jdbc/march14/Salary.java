package com.jdbc.march14;
import java.util.*;
public class Salary {
	private int year;
	private int salary;
	public Salary(int year,int salary)
	{
		this.year=year;
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString()
	{
		return "["+this.year+","+this.salary+"]";
	}
}
