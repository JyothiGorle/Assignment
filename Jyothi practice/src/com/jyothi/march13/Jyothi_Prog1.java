package com.jyothi.march13;
/* Write a Java program to create a new array list, add some elements (string) and print out the collection*/
import java.util.*;
public class Jyothi_Prog1 {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		System.out.print("Enter the no of elements to add:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int index=0;index<n;index++)
		{
			String x=sc.next();
			al.add(x);
		}
		System.out.println("The elements in the array list are:"+al);
		sc.close();
	}
}
