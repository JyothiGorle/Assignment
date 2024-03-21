package com.jyothi.local;

public class Outer {
	void innermethod()
	{
		class Inner
		{
			void message()
			{
				System.out.println("This is an inner class method");
			}
		}
		Inner ob=new Inner();
		ob.message();
	}
	public static void main(String[] args) {
		Outer ob=new Outer();
		ob.innermethod();			
	}
}
