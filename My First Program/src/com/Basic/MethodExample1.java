package com.Basic;

public class MethodExample1 
{
	int a=20;
	int b=10;
	int c;
	
		public void add()
		{
		c=a+b;

		System.out.println("The addition of two numbers:"+c);
	}
	public void subtraction()
	{
		c=a-b;
		System.out.println("The subtraction of two numbers:"+c);
	}
	public void Multiplication()
	{
		c=a*b;
		System.out.println("The Multiplication of two numbers:"+c);
	}
	public void division()
	{
		c=a/b;
		System.out.println("The division of two numbers:"+c);
	}
	public static void main( String[] args)
	{
		MethodExample1 m =new MethodExample1();
		m.add();
		m.subtraction();
		m.Multiplication();
		m.division();
	}
	

}
