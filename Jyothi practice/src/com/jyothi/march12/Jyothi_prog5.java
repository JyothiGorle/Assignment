package com.jyothi.march12;

import java.util.Scanner;

/*Static Inner Class: Implement a Java program with an outer class and a static inner class. 
 * The inner class should have a static method to calculate the factorial of a number using recursion.
 */
class Outer4{
	static class Inner{
		static int fact(int n)
		{
			if(n<0)
				return 0;
			else if(n==0 || n==1)
				return 1;
			else
				return n*fact(n-1);
		}
	}
}
public class Jyothi_prog5 {
	public static void main(String[] args) {
		System.out.print("Enter a number to perform factorial:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Outer4.Inner in=new Outer4.Inner();
		System.out.println(in.fact(n));
	}
}
