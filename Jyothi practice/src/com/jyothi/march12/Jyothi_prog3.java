package com.jyothi.march12;

import java.util.Scanner;

/*Anonymous Inner Class:  Write a Java program that demonstrates the use of an anonymous inner class for performing a simple math operation. 
 * Create a method in your main class that accepts two numbers and an operation (addition, subtraction, multiplication, or division). 
 * Use an anonymous inner class to perform the specified operation and display the result.
 */
class Outer2
{
	interface Inner1{
		void cal();
	}
}

public class Jyothi_prog3 {
	public static void main(String[] args) {
		Outer2.Inner1 ob=new Outer2.Inner1() {
			public void cal()
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the operator:");
				String ch=sc.next();
				System.out.println("Enter n1 and n2 values:");
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				switch(ch)
				{
				case "+":
					System.out.println("The result is:"+(n1+n2));
					break;
				case "-":
					System.out.println("The result is:"+(n1-n2));
					break;
				case "*":
					System.out.println("The result is:"+n1*n2);
					break;
				case "/":
					System.out.println("The result is:"+n1/n2);
					break;
				default:
					System.out.println("Please enter the valid operator");
					
				}
			}
		};
		ob.cal();
		
	}
}
