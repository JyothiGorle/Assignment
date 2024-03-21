package march8evngtask;

class Cycle
{
	void show()
	{
		System.out.println("A vechile with pedals");
	}
}

public class MotorCycle extends Cycle{
	void show()
	{
		super.show();
		System.out.println("A cycle with an engine");
	}
	public static void main(String []args)
	{
		MotorCycle ob=new MotorCycle();
		ob.show();
	}
}
