package march11;

public class Prog3withfinally {
	public static int fun()
	{
		int a=10;
		try {
			throw new Exception();
		}
		catch(Exception e)
		{
			a=20;
			System.out.println(a);
			return a;
		}
		finally {
			a=30;
			System.out.println(a);
		}
	}
	public static void main()
	{
		fun();
	}
}
