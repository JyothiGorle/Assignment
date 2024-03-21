package com.jyothi.march13;

import java.util.LinkedHashSet;
import java.util.*;

public class Jyothi_LinkedHashSet {
	public static void main(String []args)
	{
		ArrayList<Integer>al=new ArrayList<>();
		System.out.print("Enter the no  elements to add:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int index=0;index<n;index++)
		{
			int x=sc.nextInt();
			al.add(x);
		}
		System.out.println("The array list:"+al);
		LinkedHashSet<Integer>lhs=new LinkedHashSet<>(al);
		System.out.println("The array list is added to the Linkedhashset:"+lhs);
		System.out.println("All the elements of the arraylist are to be removed:"+al.removeAll(al));
		System.out.println(al.retainAll(lhs));
		System.out.println("Converting the lhs into the array:"+lhs.toArray());
		System.out.println("The size of the lhs:"+lhs.size());
		lhs.clear();
		System.out.println("The lhs is empty?"+lhs.isEmpty());
	}
}
