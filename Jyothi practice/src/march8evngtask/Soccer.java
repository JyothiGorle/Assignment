package march8evngtask;

class Sports
{
	String getName()
	{
		return "Generic Sports";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has n players in"+" "+getName());
	}
}
public class Soccer extends Sports {
	@Override
	String getName()
	{
		return "Soccer Class";
	}
	@Override
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has 11 players in"+" "+getName());
	}
	public static void main(String []args)
	{
		Sports obj=new Sports();
		System.out.println(obj.getName());
		obj.getNumberOfTeamMembers();
		Soccer ob=new Soccer();
		System.out.println(ob.getName());
		ob.getNumberOfTeamMembers();
		
	}
}
