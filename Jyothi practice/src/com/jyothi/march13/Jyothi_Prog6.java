package com.jyothi.march13;

import java.util.HashMap;
import java.util.Scanner;

/*Write a Java program to get keys from a HashMap collection*/
public class Jyothi_Prog6 {
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
		System.out.println("The keys in the map are:"+mp.keySet());
	}
}
