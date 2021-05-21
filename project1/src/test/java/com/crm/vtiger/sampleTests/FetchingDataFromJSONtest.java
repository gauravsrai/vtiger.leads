package com.crm.vtiger.sampleTests;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class FetchingDataFromJSONtest {
	
	@Test
	public void toFetchDataFromJsonFile() throws IOException, ParseException
	{
		FileReader reader=new FileReader("./Data/credentials.json");
		JSONParser parser=new JSONParser();
		Object object=parser.parse(reader);
		JSONObject jObject=(JSONObject)object;
		String url=jObject.get("url").toString();
		String username=jObject.get("username").toString();
		String password=jObject.get("password").toString();
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
