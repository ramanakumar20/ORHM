package com.Basic;

public class ObjectArray {

	public static void main(String[] args) 
	{
		Object a[]= new Object[3];
		a[0]=10;
		a[1]="Ram";
		a[2]=10.12;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
