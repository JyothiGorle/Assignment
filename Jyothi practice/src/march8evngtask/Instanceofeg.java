package march8evngtask;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	int studid;
}
class Rockstar
{
	int rockstarid;
}
class Hacker
{
	int hackerid;
}
public class Instanceofeg {
	public static void fun(ArrayList<Object> al)
	{
		int c1=0,c2=0,c3=0;
		for(int i=0;i<al.size();i++)
		{
			Object ele=al.get(i);
			if(ele instanceof Student)
				c1++;
			if(ele instanceof Rockstar)
				c2++;
			if(ele instanceof Hacker) 
				c3++;
		}
		System.out.println(c1+" "+c2+" "+c3);
	}
	public static void main(String []args)
	{
		int t;
		System.out.print("enter the no of testcases:");
		Scanner s=new Scanner(System.in);
			t=s.nextInt();
		Student ob1=new Student();
		Rockstar ob2=new Rockstar();
		Hacker ob3=new Hacker();
		ArrayList<Object> al=new ArrayList<>();
		System.out.println("Enter"+" "+t+" "+"classes");
		for(int i=0;i<t;i++)
		{
			String s1=s.next();
			if(s1.equals("Student"))
				al.add(ob1);
			if(s1.equals("Rockstar"))
				al.add(ob2);
			if(s1.equals("Hacker"))
				al.add(ob3);
		}
		fun(al);
		s.close();
	}
}
