package com.crm.vtiger.leadsTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.leadPOMclass.HomePage;

public class TC_06_CreateNewLeadBySelectingDifferentLeadSourceFromDropDownTest extends BaseClass {
	
	@Test(groups="smokeTest")
	public void TC_06_CreateNewLeadBySelectingDifferentLeadSourceFromDropDown() throws Throwable
	{
		HomePage hp=new HomePage(driver);
		hp.toClickOnMenuLink();
		
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		
		driver.findElement(By.name("lastname")).sendKeys(eUtil.getExcelData("lead", "TC_06", "lastName")+ju.getRandomData());
		
		driver.findElement(By.name("company")).sendKeys(eUtil.getExcelData("lead", "TC_06", "company")+ju.getRandomData());
		
		WebElement leadSourceDropDown=driver.findElement(By.name("leadsource"));
		
		wUtil.SelectOption(leadSourceDropDown,eUtil.getExcelData("lead", "TC_06", "LeadSource"));
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
	}

}
