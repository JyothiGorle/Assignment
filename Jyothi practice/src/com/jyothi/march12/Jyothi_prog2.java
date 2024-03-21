package com.jyothi.march12;
/*Create an outer class and an inner class with different
*  access modifiers (public, private, protected, default).
*  Demonstrate how these access modifiers affect the visibility and accessibility of the inner-class members. 
*/
class Outer1{
	class Inner{
		int n1=10;
	}
	public class Inner1{
		int n2=20;
	}
	protected class Inner2{
		int n3=30;
	}
	private class Inner3{
		private int n4=40;

		public int getN4() {
			return n4;
		}

		public void setN4(int n4) {
			this.n4 = n4;
		}
		
	}
	void display()
	{
		Inner3 ob=new Inner3();
		System.out.println(ob.getN4());
		System.out.println(ob.n4=35);
	}
}
public class Jyothi_prog2 {
	public static void main(String []args)
	{
		Outer1.Inner in=new Outer1().new Inner();
		System.out.println(in.n1=100);
		Outer1.Inner1 in1=new Outer1().new Inner1();
		System.out.println(in1.n2=500);
		Outer1.Inner2 in2=new Outer1().new Inner2();
		System.out.println(in2.n3=700);
		Outer1 ob1=new Outer1();
		ob1.display();


	}
}
