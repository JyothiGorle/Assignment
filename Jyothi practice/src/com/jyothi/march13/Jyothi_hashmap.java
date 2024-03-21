package com.jyothi.march13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Jyothi_hashmap {
	public static void main(String []args)
	{
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
		System.out.print("Enter the key to get that value:");
		int key=sc.nextInt();
		System.out.println(mp.get(key));
		HashMap<Integer,String>hm=new HashMap<>(mp);
		System.out.println(hm.equals(mp));
		mp.putAll(hm);
		System.out.println(mp);
		System.out.println(mp.keySet());
		mp.clear();
		System.out.println(mp);
	}
}
