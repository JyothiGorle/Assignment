package com.jyothi.march13;
/*2. a) Write a Java program to insert an element into the array list at the first position
   b) Write a Java program to remove the fifth element from a array list
   c) Write a Java program to retrieve an element (at a specified index) from a given array list*/
import java.util.*;
public class Jyothi_Prog2 {
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
		System.out.println("Inserted an element at first position:"+al.set(1,100));
		System.out.println("removed the fifth element from array list:"+al.remove(5));
		System.out.println("retrieve an element (at a specified index) from a given array list:"+al.get(2));
		System.out.println(al);
		sc.close();
	}
}
