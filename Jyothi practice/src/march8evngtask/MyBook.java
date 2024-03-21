package march8evngtask;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

public class MyBook extends Book{
	void setTitle(String title)
	{
		System.out.println("The title is:" +title);
	}
	public static void main(String []args)
	{
		MyBook ob=new MyBook();
		ob.setTitle("A tale of two cities");
	}
}
