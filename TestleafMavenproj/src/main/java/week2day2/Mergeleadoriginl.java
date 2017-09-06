package week2day2;



import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class Mergeleadoriginl extends ProjectSpecificWrappers {
	
	
	@Test(groups ={"regression"})
	
	
	
	public void mergerlead() throws Exception
	{
		String firstleadID = "14028";
		String secondleadID= "14029";
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
