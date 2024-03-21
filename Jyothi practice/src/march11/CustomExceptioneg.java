package march11;

import java.util.Scanner;
class MyException extends RuntimeException
{
	MyException(String s)
	{
		super(s);
	}
	MyException(Throwable msg,String s)
	{
		super(s,msg);
	}
}
public class CustomExceptioneg {
	public static void fun()
	{
		System.out.print("Enter the balance:");
		Scanner sc=new Scanner(System.in);
		int bal=sc.nextInt();
		try 
		{
		 if(bal>0)
		 {
			System.out.println("Approval for checkbook");
		 }
		 else
		 {
			System.out.println("Please maintain enough balance in the account");
		 }
		}
		catch(MyException e)
		{
			throw new MyException(e,"Please maintain enough balance in the account");
		}
		finally {
			sc.close();
		}
	}
	
	public static void main(String []args)
	{
		final int balance=100;
		int amt;
		System.out.print("Enter the amount:");
		Scanner sc=new Scanner(System.in);
		amt=sc.nextInt();
		try {
			if(amt>balance)
			{
				throw new MyException("Insufficent amount in the account");
			}
			else
			{
				System.out.println("Amount withdrawl is successful");
			}
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
		fun();
	}
}