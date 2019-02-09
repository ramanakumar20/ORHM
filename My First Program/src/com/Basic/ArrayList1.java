package com.Basic;

import java.util.ArrayList;
import java.util.List;
public class ArrayList1
{

	public static void main(String[] args) 
	{
		List<String> a=  new ArrayList<>();
		a.add("LiveTech");
		a.add("Testing");
		a.add("Selenium");
		a.add("LoadRunner");
		for(int k=0;k<a.size();k++)
		{
			System.out.println(a.get(k));
		}
	}

}
