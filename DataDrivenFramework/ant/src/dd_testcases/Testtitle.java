package dd_testcases;


import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dd_core.Page;
import dd_util.TestUtil;


public class Testtitle extends Page {




	@BeforeTest
	public void isSkip(){

		if(!TestUtil.isExecutable("Testtitle")){

			throw new SkipException("Skipping the test as the Run mode is No");

		}


	}

	@Test(dataProvider="getData")
	public void doLogin(String username,String password) throws IOException{

		logs.debug("Inside Login Test");

		findElement("username").sendKeys(username);
		findElement("password").sendKeys(password);
		findElement("login").click();
		TestUtil.CaptureScreenshot();
		//GlobalUsername = username;


	}


	@DataProvider
	public static Object[][] getData(){

		return TestUtil.getData("Testtitle");



	}




}
