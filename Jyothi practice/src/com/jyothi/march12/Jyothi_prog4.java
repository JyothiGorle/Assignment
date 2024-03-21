package com.jyothi.march12;

import java.util.Scanner;

/*Local Inner Class: Create a program with a method in an outer class that defines a local inner class. 
 * The inner class should have a method that returns the cube of a given number.*/

class Outer3{
	void display() {
		class Inner{
			int cal()
			{
				System.out.print("Enter a number:");
				Scanner s=new Scanner(System.in);
				int n=s.nextInt();
				return n*n*n;
			}
		}
		Inner ob1=new Inner();
		System.out.println("The cube of a number is:"+ob1.cal());
	}
}

public class Jyothi_prog4 {
	public static void main(String[] args) {
		new Outer3().display();
		
	}
}
