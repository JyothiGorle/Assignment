package com.jyothi.march13;

import java.util.*;

public class Jyothi_LinkedHashMap {
	public static void main(String []args)
	{
		LinkedHashMap<Integer,String>mp=new LinkedHashMap<>();
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
		System.out.println("The elements in Linked hashmap are:"+mp);
		sc.close();
	}
}
