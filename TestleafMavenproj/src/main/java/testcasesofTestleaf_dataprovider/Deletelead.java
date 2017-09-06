package testcasesofTestleaf_dataprovider;


import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class Deletelead extends ProjectSpecificWrappers{
	
	/*@Test(groups = {"sanity"},dependsOnGroups = "smoke",dataProvider = "deleteleaddata")
	*///Delete lead
	public void deleteerlead(String leadId) throws InterruptedException{
		//String leadId = "13963";
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Phone']");
		enterByXpath("//input[@name='phoneNumber']", "5488555");
		clickByXpath("//button[text()='Find Leads']");
		String leadID = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByXpath("//a[text()= 'Delete']");
		Thread.sleep(3000);
		clickByLink("Find Leads");
		Thread.sleep(3000);
		enterByXpath("//label[text()='Lead ID:']/following::input", leadID);
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		verifyTextContainsByXpath("//div[text()='No records to display']", "No records to display");
		
	}

}
