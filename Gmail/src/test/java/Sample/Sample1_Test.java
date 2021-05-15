package Sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1_Test {
	
	@Test
	public void addition()
	{
		int a=10;
		int b=20;
		int c=a+b;
		Reporter.log("the value is"+c);
		
	}

}
