package march11;

import java.util.Scanner;

public class program5 {
	public static void main(String []args)
	{
		fun();
	}
	public static void fun()
	{
		int n1,n2,flag=0;
		System.out.println("enter the n1 and n2 values:");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		try {
			int div=n1/n2;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please enter the denominator greater than zero");
			flag=1;
		}
		if(flag==1)
		{
			n2=5;
			System.out.println("Handling using default value:"+n1/n2);
		}
		else
		{
			System.out.println(n1/n2);
		}
		sc.close();
	}
}
