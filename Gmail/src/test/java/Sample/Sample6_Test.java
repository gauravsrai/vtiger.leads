package Sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample6_Test {
	
	@Test()
	
	public void login()
	{
	 //int c=10/0;
	  Reporter.log("Logged into the application second time",true);
	}
	
     @Test()
	
	public void applogOut()
	{
	Reporter.log("Logged out from application second time",true);
	}


}
