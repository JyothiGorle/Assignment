package com.jyothi.march13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class Jyothi_setcrud {
	public static void main(String []args)
	{
		HashSet<Integer>hs=new HashSet<>();
		System.out.print("Enter the no of elements to add:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int index=0;index<n;index++)
		{
			int x=sc.nextInt();
			hs.add(x);
		}
		System.out.println(hs.size());
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		System.out.print("Enter the element to be removed:");
		int ele=sc.nextInt();
		System.out.println(hs.remove(ele));
		System.out.print("Enter the element to find:");
		int ele1=sc.nextInt();
		System.out.println(hs.contains(ele1));
		ArrayList<Integer> al=new ArrayList<>();
		al.add(3);
		al.add(2);
		System.out.println("The array list is added to the hashset:"+hs.addAll(al));
		System.out.println("The hashset will retain all the elements from the arraylist:"+hs.retainAll(al));
		TreeSet<Integer>ts=new TreeSet<Integer>(hs);
		System.out.println("The tree set which keeps the elements in order:"+ts);
		hs.clear();
		System.out.println("Is the hashset is empty:"+hs.isEmpty());
		
	}
}
