package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1
{
	@Test(priority=0)
	public void ApplicationLaunch()
	{
		System.out.println("Gmail Appliction Launch");
	}
	@Test(priority=1)
	public void Login()
	{
	System.out.println("Testing Login funcionality");
	
	}
	@Test(priority=2)
	public void inbox()
	{
		System.out.println("Testing inbox functionality");
	}
	@Test(enabled=false)
	public void composeMail()
	{
		System.out.println("Testing compose mail functionality");
	}
}

