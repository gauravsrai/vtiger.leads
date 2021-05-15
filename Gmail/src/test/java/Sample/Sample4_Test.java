package Sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample4_Test {
	
	@Test()
	
	public void login()
	{
	 int c=10/0;
	  Reporter.log("Logged into the application");
	}
	
     @Test(dependsOnMethods="login",alwaysRun=true)
	
	public void applogOut()
	{
	Reporter.log("Logged out from application");
	}


}
