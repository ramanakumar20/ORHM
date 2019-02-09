package com.Basic;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		try
		{
			int a=10;
			int b=0;
			int c;
			c=a/b;
			System.out.println(c);
		}
catch(Exception e)
		{
	System.out.println("cannot perform operation"); 
	System.out.println(e);
		}
	}

}
