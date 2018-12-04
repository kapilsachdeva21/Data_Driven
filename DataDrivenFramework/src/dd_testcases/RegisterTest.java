package dd_testcases;


import java.io.IOException;
import java.sql.SQLException;

import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dd_core.Page;
import dd_util.DbManager;
import dd_util.TestUtil;


public class RegisterTest extends Page {



	@BeforeTest
	public void isSkip(){

		if(!TestUtil.isExecutable("RegisterTest")){

			throw new SkipException("Skipping the test as the Run mode is No");

		}


	}

	@Test(dataProvider="getData")
	public void gotoProfile(String fname,String lname) throws IOException, ClassNotFoundException, SQLException{


		findElement("register").click();
		//System.out.println(LoginTest.GlobalUsername);

		findElement("firstname").sendKeys(fname);
		findElement("lastname").sendKeys(lname);
		//DbManager.setMysqlDbConnection();
	    //  DbManager.getMysqlQuery("select * from emp");
	}


	@DataProvider
	public static Object[][] getData(){

		return TestUtil.getData("RegisterTest");



	}




}
