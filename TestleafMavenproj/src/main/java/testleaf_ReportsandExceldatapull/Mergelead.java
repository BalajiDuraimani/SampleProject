package testleaf_ReportsandExceldatapull;



import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class Mergelead extends ProjectSpecificWrappers {
	
	
	@Test(groups = "regression")
	
	
	public void mergerlead() throws Exception
	{
		
		invokeApp("Chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		String firstleadID = "14146";
		String secondleadID= "14147";
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		enterByName("id", firstleadID);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToLastWindow();
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		enterByName("id", secondleadID);
		clickByXpath("//button[contains(text(),'Find Leads')]");
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		switchToLastWindow();
   		clickByClassName("buttonDangerous");
   		acceptAlert();
   		clickByLink("Find Leads");
   		enterByName("id", firstleadID);
   		clickByXpath("//button[contains(text(),'Find Leads')]");
   		verifyTextByXpath("//div[text()='No records to display']", "No records to display");
  
   		
	
		
	}
	
	
	
	
	

}
