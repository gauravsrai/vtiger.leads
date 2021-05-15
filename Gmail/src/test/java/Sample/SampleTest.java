package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTest {
	@DataProvider(name="credentials",parallel=true)
	public String[][] getData()
	{
		String[][]datas= {{"http://localhost:8888/","admin","admin"},{"http://localhost:8888/","manager","manager"}};
		return datas;
	}
	
	@Test(dataProvider="credentials",description="to sign in to app")
	public void signInToSkillRayApp(String url,String username, String password)
	{
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.get(url);
        driver.findElement(By.name("user_name")).sendKeys(username);
        driver.findElement(By.name("user_password")).sendKeys(password);
        driver.findElement(By.id("submitButton")).click();
        driver.quit();

		
	}
	
	

}
