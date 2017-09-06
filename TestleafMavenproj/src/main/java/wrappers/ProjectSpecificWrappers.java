package wrappers;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import exceldataprovider.Exceldata;


public class ProjectSpecificWrappers extends GenericWrappers{

	/*@Parameters({"browser","url","username","password"})
	    @BeforeMethod(groups={"all"})  
		public void login(String browser,String url,String username,String password){*/

	@Parameters({"brrowser","URrL"})
	@BeforeMethod(groups={"all"})
	public void login(String brrowser, String URrL)	{
		invokeApp(brrowser,URrL);
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	}


	@AfterMethod(groups = {"all"})
	public void close()
	{
		closeAllBrowsers();
	}


	@DataProvider(name="browsername")
	public Object[][] dataholder(){
		return new Object[][]{
			{"Chrome", "http://leaftaps.com/opentaps/control/main"},
		};
	}	


	//Data setup for all cases

	@DataProvider(name="Createleaddata")
	public Object[][] getData()
	{
		return new Object[][]{
			{"Cognizant","Balaji","Duraimani"},
		};
	}

	/*@DataProvider(name="fetchdata")
	public Object[][] getData() throws InvalidFormatException, IOException
	{
		Exceldata newobjct = new Exceldata();		
		return newobjct.excelinputs();

	}
	 */


	@DataProvider(name = "deleteleaddata")
	public Object[][] deleteleadinputdata(){
		return new Object[][]{
			{"14390"},
		};
	}



	@DataProvider(name="Editleaddata")
	public Object[][] editleadclass(){
		return new Object[][]{
			{"Balaji"},

		};
	}

	@DataProvider(name="duplicateleaddata")
	public Object[][] duplicateleaddata(){
		return new Object[][]{
			{"test@testleaf.com"},
		};
	}


	@DataProvider(name="Mergeleaddata")
	public Object[][] Mergeleaddata(){
		return new Object[][]{
			{"14395","14397"},			
		};
	}



}
