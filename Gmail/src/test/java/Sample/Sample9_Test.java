package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample9_Test {
	@Parameters({"browserName","username","password"})
	@Test()
	public void signInToSkillRayApp(String browser,String username,String password)
	{
        WebDriver driver=null;
        if(browser.equalsIgnoreCase("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        	 driver=new ChromeDriver();
        }
         else if(browser.equalsIgnoreCase("firefox"))
        {
        	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
        	driver=new FirefoxDriver();
        }
        
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.get("http://localhost:8888/");
        driver.findElement(By.name("user_name")).sendKeys(username);
        driver.findElement(By.name("user_password")).sendKeys(password);
        driver.findElement(By.id("submitButton")).click();
        driver.quit();

		
	}
	
	

}
