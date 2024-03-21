package com.jyothi.march12;
/*Write a Java program that demonstrates the use of a simple inner class. Define an outer class containing a method 
 * that creates an instance of the inner class and invokes its method.*/ 

class Outer
{
	public void msg()
	{
		System.out.println("This is the method in the Outer class");
	}
	class Inner
	{
		void msg()
		{
			Outer.this.msg();
			StringBuilder s=new StringBuilder();
			s.append("This is method in the Inner class");
			System.out.println(s);
		}
	}
	
}
public class Jyothi_prog1 {
	public static void main(String[] args) {
		Outer.Inner ob=new Outer().new Inner();
		ob.msg();
	}
}
