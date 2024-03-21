package march8evngtask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {
	public static void main(String []args)
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		try {
		a=s.nextInt();
		b=s.nextInt();
		int div=a/b;
		System.out.println(div);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally {
			s.close();
		}
	}
}
