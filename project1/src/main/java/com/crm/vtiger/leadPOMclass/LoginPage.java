package com.crm.vtiger.leadPOMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement userNameTextField;
	
	@FindBy(name="user_password")
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public void loginToApp(String username,String password) throws Throwable
	{
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		
	}

	
}
