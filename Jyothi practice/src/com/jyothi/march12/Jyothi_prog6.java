package com.jyothi.march12;
/*Nested Inner Class: Design a program with an outer class having a method that returns an object of a nested inner class.
 *  Demonstrate the creation of objects of both the outer and inner classes and access the methods of the inner class.*/

class Outer5 {
	String name;
	public Outer5(String name)
	{
		this.name=name;
	}
	class Inner{
		void display(){
			System.out.println(name);
		}
		String modified_name=name;
	}
	public Inner show()
	{
		return this.new Inner();
	}
}

public class Jyothi_prog6 {
	public static void main(String[] args) {
		Outer5 ob=new Outer5("Jyothi");
		Outer5.Inner ob1=ob.show();
		ob1.display();
		StringBuilder s=new StringBuilder();
		s.append(ob1.modified_name="Jyothi Gorle");
		System.out.println(s);
	}
}
