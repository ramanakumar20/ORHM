package com.Basic;

public class Array {

	public static void main(String[] args) 
	{
		int x[]= new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		//System.out.println(x[0]);
		//System.out.println(x[1]);
		//System.out.println(x[2]);
		//for(int i=0;i<=2;i++)
			for(int i=0;i<x.length;i++)
			{
				System.out.println(x[i]);
			}
	}

}
