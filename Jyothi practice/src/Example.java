import java.util.ArrayList;
//Appending the Modi to each element of the arraylist
public class Example {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>()
		{
			@Override
			public boolean add(String val)
			{
				return super.add(val+"Modi");
			}
		};
		al.add("Jyothi");
		System.out.println(al);
	}
	
}
