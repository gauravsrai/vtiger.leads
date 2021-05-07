package com.crm.vtiger.leadsTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class TC_10_CreateNewLeadByAssignToGroupTest {
	@Test
	public void TC_10_CreateNewLeadByAssignToGroup()
	{
		JavaUtility ju=new JavaUtility();
		WebDriverUtility wdu=new WebDriverUtility();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		
		driver.findElement(By.name("lastname")).sendKeys("Gaurav");
		
		driver.findElement(By.name("company")).sendKeys("TestYantra"+ju.getRandomData());
		
		driver.findElement(By.xpath("//input[@name='assigntype' and @value='T']")).click();
		
		WebElement groupDropDown=driver.findElement(By.name("assigned_group_id"));
		
		wdu.SelectOption(groupDropDown,"Support Group");
		
		 driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			
		String administatorXpath="//img[@src='themes/softed/images/user.PNG']";
		WebElement administratorButton=driver.findElement(By.xpath(administatorXpath));
			
		wdu.waitForElementVisibility(driver, administratorButton);			
		
		Actions actions=new Actions(driver);
		actions.moveToElement(administratorButton).perform();
		
	    
	    WebElement signOutButton=driver.findElement(By.xpath("//a[text()='Sign Out']"));
	    
		actions.moveToElement(signOutButton).click().perform();	
		
		driver.quit();
			 
		
		

	}

}
