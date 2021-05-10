package com.crm.vtiger.sampleTests;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test(groups="smoke")
	public void sample1()
	{
		/*String username=System.getProperty("username");
		String password=System.getProperty("password");
		String url=System.getProperty("url");*/
		
		System.out.println("username2");
		System.out.println("password2");
		System.out.println("url2");
	}

	@Test(groups="regression")
	public void sample2()
	{
		/*String username=System.getProperty("username");
		String password=System.getProperty("password");
		String url=System.getProperty("url");*/
		
		System.out.println("username3");
		System.out.println("password3");
		System.out.println("url3");
	}

}
