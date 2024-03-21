package march8evngtask;

import java.util.Scanner;

class flower{
	String whatsYourName()
	{
		return "I am superclass and my name is flower";
	}
}
class Jasmine extends flower{
	String whatsYourName()
	{
		return "Jasmine";
	}
}
class Lily extends flower{
	String whatsYourName()
	{
		return "Lily";
	}
}
class Lotus extends flower{
	String whatsYourName()
	{
		return "Lotus";
	}
}
class Andhraprasdesh extends flower{
	String whatsYourName()
	{
		return "Lily";
	}
}
class WestBengal extends flower{
	String whatsYourName()
	{
		return "Jasmine";
	}
}
class Karnataka extends flower{
	String whatsYourName()
	{
		return "Lotus";
	}
}
public class Covarianteg {
	public static void main(String []args)
	{
		String s;
		Scanner sc=new Scanner(System.in);
			s=sc.next();
		switch(s)
		{
		case "Andhrapradesh":
			Lily ob=new Lily();
			System.out.println(ob.whatsYourName());
			break;
		case "WestBengal":
			Jasmine ob1=new Jasmine();
			System.out.println(ob1.whatsYourName());
			break;
		case "Karnataka":
			Lotus ob2=new Lotus();
			System.out.println(ob2.whatsYourName());
			break;	
		}
		sc.close();
		}
	}
