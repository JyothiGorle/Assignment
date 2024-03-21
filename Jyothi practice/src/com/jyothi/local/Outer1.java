package com.jyothi.local;

public class Outer1 {
	static int x=10;
	static class Inner
	{
		static void msg()
		{
			System.out.println("The value is:"+x);
		}
	}
	public static void main(String []args)
	{
		//Outer1.Inner ob=new Outer1.Inner();
		Outer1.Inner.msg();
	}
}
