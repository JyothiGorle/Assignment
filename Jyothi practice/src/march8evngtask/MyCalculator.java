package march8evngtask;

import java.util.Scanner;

public class MyCalculator {
	
	public long power(int n,int  p) throws Exception 
	{
		if(n==0 && p==0)
			throw new Exception("n and p should not be zero");
		else if(n<0 || p<0)
				throw new Exception("n or p should not be negative.");
		else
			return (long)Math.pow(n, p);
	}
	public static void main(String []args)
	{
		int n,p,t;
		Scanner s=new Scanner(System.in);
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			n=s.nextInt();
			p=s.nextInt();
			MyCalculator ob=new MyCalculator();
			try {
				System.out.println(ob.power(n, p));
			}		
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		s.close();
	}
}
