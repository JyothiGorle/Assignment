package march11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandlingeg {
	
	public static void main(String []args)
	{
		int n1,n2,result=0;
		boolean flag=false;
		while(!flag)
		{
			try {
				System.out.println("Enter the n1 and n2 values:");
				Scanner sc=new Scanner(System.in);
				n1=sc.nextInt();
				n2=sc.nextInt();
				if(n2==0)
					throw new ArithmeticException();
				if(n1<0 || n2<0)
					throw new IllegalArgumentException();
				result=n1/n2;
				System.out.println("The result is:"+result);
				flag=true;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
				System.out.println("Provide non-zero denominator");
			}
			catch(InputMismatchException e)
			{
				System.out.println("Please enter only Integers");
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e.getMessage());
				System.out.println("please provide non negative integers");
			}
			catch(Exception e)
			{
				System.out.println("Unexpected error");
			}
		
		}
		
	}		
	}
