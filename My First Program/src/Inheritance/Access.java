package Inheritance;

public class Access extends Base
{
	public void test2()
	{
		System.out.println("Method test2 executed successfully");
	}
	public static void main(String[] args) 
	{
		Access a = new Access();
		a.test2();
		a.test1();

	}

}
