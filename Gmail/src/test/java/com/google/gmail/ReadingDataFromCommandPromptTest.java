package com.google.gmail;

import org.testng.annotations.Test;

public class ReadingDataFromCommandPromptTest {
	
	@Test
	
	public void toDriveDataFromCommandPrompt()
	{
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		String URL=System.getProperty("url");
		
		System.out.println("==========="+USERNAME);
		System.out.println("==========="+PASSWORD);
		System.out.println("==========="+URL);
		
	}

}
