package com.jyothi.march13;
import java.util.*;
/*a) Write a Java program to reverse elements in a array list
   b) Write a Java program to search an element in a array list
   c) Write a Java program to Find maximum element in ArrayList*/
public class Jyothi_Prog3 {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		System.out.print("Enter the no of elements to add:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int index=0;index<n;index++)
		{
			int x=sc.nextInt();
			al.add(x);
		}
		Collections.reverse(al);
		System.out.println("reverse of elements in a array list:"+al);
		System.out.print("Enter the serach element:");
		int ele=sc.nextInt();
		System.out.println("Is the search element is present?"+al.contains(ele));
		System.out.println("The maximum element in the array list is:"+Collections.max(al));
	}
}
