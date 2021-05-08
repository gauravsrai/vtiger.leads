package com.crm.vtiger.leadPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.BaseClass;

public class HomePage extends BaseClass {
	
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Leads")
	private WebElement leadLink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorIMG;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOutButton;
	

	public WebElement getLeadLink() {
		return leadLink;
	}
	
	public WebElement getAdministratorIMG() {
		return administratorIMG;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}

	public void toClickOnMenuLink()
	{
		leadLink.click();
	}
	
	public void signOutFromApp() throws InterruptedException
	{
		wUtil.waitAndClick(administratorIMG);
		wUtil.mouseOver(driver, administratorIMG);
		signOutButton.click();
		
	}
	
	

}
