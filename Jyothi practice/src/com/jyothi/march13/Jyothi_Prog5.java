package com.jyothi.march13;

import java.util.HashMap;
import java.util.Scanner;

/*Write a Java program to test if a map contains a mapping for the specified value*/
public class Jyothi_Prog5 {
	public static void main(String[] args) {
		HashMap<Integer,String>mp=new HashMap<>();
		System.out.print("Enter the no  elements to add:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int index=0;index<n;index++)
		{
			int x=sc.nextInt();
			String name=sc.next();
			mp.put(x,name);
		}
		System.out.println("The elements in hashmap are:"+mp);
		System.out.print("Enter the value to test the mapping of value");
		String v=sc.next();
		if(mp.containsValue(v))
		{
			System.out.println("The value is mapped");
		}
		else
		{
			System.out.println("The value is not present");
		}
	}
}
