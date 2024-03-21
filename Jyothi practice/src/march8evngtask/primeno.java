package march8evngtask;

import java.util.ArrayList;
import java.util.Scanner;

public class primeno {
	public static void prime(ArrayList<Object> al)
	{
		ArrayList<Object>ob=new ArrayList<>();
		for(int i=0;i<al.size();i++)
		{
			Integer ele=(Integer)al.get(i); 
			if(ele==2)
			{
				ob.add(ele);
				ob.add(" ");
			}
			else if(ele>2)
			{
				int flag=1;
				for(int j=2;j<ele;j++)
				{
					if(ele%j==0)
					{
						flag=0;
						break;
					}
				}
				if(flag==1)
				{
					ob.add(ele);
					ob.add(" ");
				}
			}
			for(int index=0;index<ob.size()&&i>0;index++)
			{
				System.out.print(ob.get(index));
			}
			System.out.println();
		}
	}
	public static void main(String []args)
	{
		int t,n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no of testcases:");
		t=sc.nextInt();
		System.out.println("enter"+" "+t+" "+"values:");
		ArrayList<Object> al=new ArrayList<>();
		for(int i=0;i<t;i++)
		{
			n=sc.nextInt();
			al.add(n);
		}
		prime(al);
		sc.close();
	}
}
