package com.jyothi.march13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jyothi_ListCrud {
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
		System.out.print("Enter any index and element to update the number:");
		int indx=sc.nextInt();
		int ele=sc.nextInt();
		al.set(indx, ele);
	/*	for(Integer it:al)
		{
			System.out.print(it+" ");
		}*/
		System.out.println(al);
		System.out.println("\n");
		al.remove(2);
		Collections.reverse(al);
		System.out.println("The elements are reversed:");
		System.out.println(al);
		System.out.println("The elements are removed");
		System.out.println(al);
	}
}
