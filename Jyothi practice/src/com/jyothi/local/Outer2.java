package com.jyothi.local;

interface inter1
{
	interface inter2{
		void msg();
	}
}

public class Outer2 implements inter1.inter2{
	public void msg()
	{
		System.out.println("this is a msg method");
	}
	public static void main(String []args)
	{
		inter1.inter2 ob=new Outer2();
		ob.msg();
	}
}
