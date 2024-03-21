package com.Jyothi.jdbc;
/*WAP to print dynamic email body using string builder. Subscriber, Topic should be method inputs and String 
Create 4-8 Subscribers, 4-5 Topics predefined.
Input:
Subscriber: Varma
Topic: Java
Output:
Dear Varma,
Java is a high-level, class-based, object-oriented programming language that designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers "write once, run anywhere" (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.
Thanks and Regards
Mailer*/
import java.util.*;
public class Jyothi_prog5 {
	public static void fun()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Choose a subscriber from subscriber list:");
		String s=sc.next();
		System.out.print("choose a topic from topic list:");
		String t=sc.next();
		StringBuilder sb=new StringBuilder();
		sb.append("Dear ");
		sb.append(s);
		sb.append(',');
		sb.append("\n\n");
		switch(t)
		{
			case "java":
				sb.append("Java is a high-level, class-based, object-oriented programming language that designed to have as "
						+ "few implementation dependencies as possible. It is a general-purpose programming language intended to let"
						+ " application developers \"write once, run anywhere\" (WORA), meaning that compiled Java code can run "
						+ "on all platforms that support Java without the need for recompilation.\r\n");
				//System.out.println(sb);
				break;
			case "python":
				sb.append("python is a general-purpose, object-oriented programming language that has several implications across the software,"
						+ " web development, data science and automation environments. The language’s dynamic semantics, high-level built in "
						+ "data structures, dynamic typing and dynamic binding make it one of the most useful languages for rapid application development.");
				//System.out.println(sb);
				break;
			case "c++":
				sb.append("C++, version of the traditional C programming language augmented with object-oriented programming and other "
						+ "features. C++ is an “intermediate-level” language, meaning that it facilitates “high-level” programming—i.e., "
						+ "in the abstract—and “low-level” programming of actual hardware");
				//System.out.println(sb);
				break;
			case "c":
				sb.append("C is a procedural language that provides no support for objects and classes. C++ is a combination of OOP "
						+ "and procedural programming languages. C has 32 keywords and C++ has 63 keywords. C supports built-in data "
						+ "types, while C++ supports both built-in and user-defined data types.");
				//System.out.println(sb);
				break;
		}
		sb.append("\n\n");
		sb.append("Thanks and Regards \n");
		sb.append("  Jyothi");
		System.out.println(sb);
		
		
	}
	public static void main(String []args)
	{
		int n;
		System.out.print("Enter the number of subsrcribers:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		ArrayList<String>subscribers=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			String x=sc.next();
			subscribers.add(x);
		}
		System.out.println("Enter no of topics:");
		ArrayList<String>topics=new ArrayList<>();
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			String x=sc.next();
			topics.add(x);
		}
		System.out.print("Subscribers present are:");
		for(String s:subscribers)
			System.out.println(s);
		System.out.println("Topics present are:");
		for(String s:topics)
			System.out.println(s);
		fun();
	}
}
