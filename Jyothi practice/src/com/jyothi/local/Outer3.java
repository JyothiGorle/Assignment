package com.jyothi.local;

interface inter3
{
	void msg();
}

public class Outer3 {
	public static void main(String []args)
	{
		inter3 ob1=new inter3(){
			public void msg()
			{
				System.out.println("Anonymous inner classes");
			}
		};
		ob1.msg();
	}
}
