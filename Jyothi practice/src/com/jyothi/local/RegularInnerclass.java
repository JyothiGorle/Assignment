package com.jyothi.local;

public class RegularInnerclass {
	public class Inner{
		void message()
		{
			System.out.println("Inner class");
		}
	}
	public static void main(String []args)
	{
		/*RegularInnerclass.Inner inner=new RegularInnerclass().new Inner();
		inner.message();*/
		new  RegularInnerclass().new Inner().message();
	}
}
