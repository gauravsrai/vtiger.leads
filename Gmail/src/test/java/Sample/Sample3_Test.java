package Sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3_Test {
	
	@Test(priority=1)
	
	public void login()
	{
	 //int c=10/0;
	  Reporter.log("Logged into the application");
	}
	
     @Test(enabled=false,priority=2)
	
	public void applogOut()
	{
	Reporter.log("Logged out from application");
	}


}
