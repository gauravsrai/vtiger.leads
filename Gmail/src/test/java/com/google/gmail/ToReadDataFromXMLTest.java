package com.google.gmail;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ToReadDataFromXMLTest {
	
	@Test
	
	public void readDataFromXml(XmlTest xml)
	{
		System.out.println("run currengt program");
		String URL=xml.getParameter("url");
		String USERNAME=xml.getParameter("username");
		String Password=xml.getParameter("password");
		System.out.println(URL);
		System.out.println(USERNAME);

		System.out.println(Password);

	}
	

}
