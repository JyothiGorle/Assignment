package com.jyothi.march13;

import java.util.*;
import java.util.Scanner;
/*Write a Java program to check whether a HashMap contains a specified Key or not*/
public class Jyothi_Prog7 {
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
		System.out.print("Enter any key:");
		int key=sc.nextInt();
		if(mp.containsKey(key))
		{
			System.out.println("yes!!The key is present and its value is:"+mp.get(key));
		}
		else {
			System.out.println("The specifed key is not present");
		}
		sc.close();	
	}
}
