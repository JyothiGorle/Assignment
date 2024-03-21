package com.jyothi.march13;

import java.util.*;
import java.util.Scanner;

/*4. Write a Java program how to Convert a ArrayList to HashSet*/
public class Jyothi_Prog4 {
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
		System.out.println("The array list is:"+al);
		HashSet<Integer>hs=new HashSet<>(al);
		System.out.println("The hash set is :"+hs);
		sc.close();
	}
}
