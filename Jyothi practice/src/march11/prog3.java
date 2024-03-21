package march11;

import java.util.Scanner;

public class prog3 {
	public static String fun()
	{
		System.out.println("enter n1 and n2 values:");
		Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			int n2=sc.nextInt();
		try {
			int div=n1/n2;
			System.out.println(div);
			return "Operation performed";
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			return "operation is not successful";
		}
	}
	public static void main(String []args)
	{
		System.out.println(fun());
	}
}
