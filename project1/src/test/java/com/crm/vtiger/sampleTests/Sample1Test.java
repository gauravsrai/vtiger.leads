package com.crm.vtiger.sampleTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample1Test {

	@Test(groups="smoke")
	public void sample3()
	{
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		String url=System.getProperty("url");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(url);
	}

	@Test(groups="regression")
	public void sample4()
	{
		String username1=System.getProperty("username1");
		String password1=System.getProperty("password1");
		String url1=System.getProperty("url1");
		
		System.out.println(username1);
		System.out.println(password1);
		System.out.println(url1);
	}
	

}
 