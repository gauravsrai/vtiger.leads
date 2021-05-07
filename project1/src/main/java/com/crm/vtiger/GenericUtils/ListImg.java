package com.crm.vtiger.GenericUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImg implements ITestListener{
	

	public void onTestFailure(ITestResult result)
	{
		String failedTestName=result.getMethod().getMethodName();
		EventFiringWebDriver ed=new EventFiringWebDriver(BaseClass.sdriver);
		File srcImg=ed.getScreenshotAs(OutputType.FILE);
		File destImg=new File("./Screenshot/"+failedTestName+".png");
		try
		{
			FileUtils.copyFile(srcImg,destImg);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
