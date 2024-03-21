package com.jyothi.march13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;
import java.util.Scanner;

/* Write a Java program to compare two sets and retain elements which are same on both sets*/
public class Jyothi_Prog8 {
	public static void main(String[] args) {
		HashSet<Integer>hs1=new HashSet<>();
		System.out.print("Enter the no of elements to add for set1:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the set1 elements:");
		for(int index=0;index<n;index++)
		{
			int x=sc.nextInt();
			hs1.add(x);
		}
		HashSet<Integer>hs2=new HashSet<>();
		System.out.print("Enter the no of elements to add for set2:");
		int n2=sc.nextInt();
		System.out.println("Enter the set2 elements:");
		for(int index=0;index<n2;index++)
		{
			int x=sc.nextInt();
			hs2.add(x);
		}
		//hs1.retainAll(hs2);
		//System.out.println("The retained elements are:"+hs1);
		
		
		//performing the reverse of retainAll()(i.e not storing the common elements remaining elements are stored in map and printed)
		HashMap<Integer,Integer>mp=new HashMap<>();
		for(Integer it:hs1)
		{
			if(mp.containsKey(it))
			{
				int count=mp.get(it).intValue();
				mp.put(it,++count);
			}	
			else
				mp.put(it,1);
		}
		for(Integer it:hs2)
		{
			if(mp.containsKey(it)) {
			int count=mp.get(it).intValue();
				mp.put(it,++count);
			}
			else
				mp.put(it,1);
		}
		for(Map.Entry<Integer, Integer>en:mp.entrySet())
		{
			if(en.getValue()==1)
				System.out.println(en.getKey());
		}
	}
}
