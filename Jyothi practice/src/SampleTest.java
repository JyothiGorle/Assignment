
class F{
	int f;
}
public class SampleTest {
	public static void demo(String c) throws ClassNotFoundException,IllegalAccessException,
	 InstantiationException
	 {
		Object obj=Class.forName(c).newInstance();
		System.out.println("there is no exception"+obj.getClass().getName());
	 }
	public static void main(String []args) throws ClassNotFoundException,IllegalAccessException,
	InstantiationException
	{
		demo("F");
	}

}
