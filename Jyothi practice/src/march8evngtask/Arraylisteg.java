package march8evngtask;

import java.util.ArrayList;

public class Arraylisteg {
	public static void display(ArrayList<Object> al)
	{
		int flag=0;
		for(Object ob:al)
		{
			if(ob.equals("###"))
			{
				flag=1;
				continue;
			}
			if(flag==1)
			{
				System.out.println(ob);
			}
		}
	}
	
	public static void main(String []args)
	{
		ArrayList<Object> al=new ArrayList<>();
		al.add(42);
		al.add(10);
		al.add("###");
		al.add("hello");
		al.add("Java");
		al.add("Jyothi");
		display(al);
	}
}
