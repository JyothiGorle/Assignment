package march11;

import java.util.Scanner;

public class Exception_propagation {
 void A()
 {
	 int n1,n2;
	 Scanner sc=new Scanner(System.in);
	 n1=sc.nextInt();
	 n2=sc.nextInt();
	 try {
		int div=n1/n2;
		System.out.println(div);
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println(e);
	 }
	 finally
	 {
		 sc.close();
	 }
 }
 	void B()
 	{
 		A();
 	}
 	void C()
 	{
 		B();
 	}
 public static void main(String []args)
 {
	 Exception_propagation ep=new Exception_propagation();
	 ep.C();
 }
}
