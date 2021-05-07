package com.crm.vtiger.sampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.WebDriverUtility;

public class CreateOrganizationWithIndustryTest {
	
	@Test
	public void createOrganizationWithIndustry() throws InterruptedException
	{
		WebDriverUtility wdu=new WebDriverUtility();
	    		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8888");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		
		driver.findElement(By.name("accountname")).sendKeys("testYantra2017");
		
		
		
	    WebElement industryDropdown=driver.findElement(By.name("industry"));
	    
	    wdu.SelectOption(industryDropdown,"Energy");
	    
        driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
        
        Thread.sleep(5000);
		
		String administatorXpath="//img[@src='themes/softed/images/user.PNG']";
		WebElement administratorButton=driver.findElement(By.xpath(administatorXpath));
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(administratorButton));
	
		
		Actions actions=new Actions(driver);
		actions.moveToElement(administratorButton).perform();
		
	    
	     WebElement signOutButton=driver.findElement(By.xpath("//a[text()='Sign Out']"));
	    
		 actions.moveToElement(signOutButton).click().perform();
	    
		
		

	}
}
