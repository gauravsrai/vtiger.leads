package com.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToActiTimeTest {
	
	@DataProvider(name="credentials",parallel=true)
	public String[][]data()
	{
		String[][]str= {{"trainee","trainee"},{"admin","manager"}};
		return str;
	}
	
	@Test(dataProvider="credentials",description="script to login to the application")
	public static void loginToApplication(String username,String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("successfully logged out from the application");
		driver.quit();
	}

}
