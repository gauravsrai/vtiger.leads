package com.google.gmail;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDataFromPropertyFileTest {
	@Test
	
	public void readDataTest() throws IOException
	{
		/* read the data from properties File */
		  //step-1 : get the java representation object of the Physical file*/
		    FileInputStream fis = new FileInputStream("./Data/PropertyData.properties");
		    
		  //step-2 : create an Object of the Properties class & load the all keys:value pair
		    Properties pObj = new Properties();
		    pObj.load(fis);
		    
		    
		  //step-3 : read the value using getPropert("Key")
		     String URL = pObj.getProperty("url");
		     String BROWSER = pObj.getProperty("browser");
		     String USERNAME = pObj.getProperty("username");
		     String TIMEOUT = pObj.getProperty("timeout");
		     
		     System.out.println(URL);
		     System.out.println(BROWSER);
		     System.out.println(USERNAME);
		     System.out.println(TIMEOUT);
		
	}

}
