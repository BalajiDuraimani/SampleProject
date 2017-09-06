package testcasesofTestleaf_dataprovider;


import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class DuplicateLead extends ProjectSpecificWrappers{
	
	
	@Test(groups = {"regression"},dataProvider="duplicateleaddata")
	
	public void duplead (String mailid) throws InterruptedException{
		invokeApp("chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Email']");
		enterByXpath("//input[@name='emailAddress']", mailid);
		clickByXpath("	//button[text()='Find Leads']");
		 String firstname = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]/a");
		 System.out.println("Text is displayed" +firstname);
		 Thread.sleep(3000);
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a");
		Thread.sleep(3000);
		clickByLink("Duplicate Lead");
		verifyTitle("Duplicate Lead | opentaps CRM");
		clickByXpath("//input[@value='Create Lead']");
		String cheking = getTextById("viewLead_firstName_sp");
		//System.out.println(cheking);
		//System.out.println(firstname);
		if (firstname.equals(cheking))
		{
			System.out.println("The strings compared are same");
		}
		
		closeAllBrowsers();
		
		
		
	}

}
