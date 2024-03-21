package march8evngtask;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patternregex {
	static boolean ValidRegex(String s1)
	{
		try
		{
			Pattern.compile(s1);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public static void main(String []args)
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();                                                      
		for(int i=0;i<t;i++)
		{
			String s=sc.next();
			if(ValidRegex(s))
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		sc.close();
	}
}