package testleaf_ReportsandExceldatapull;


import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class Deletelead extends ProjectSpecificWrappers{
	
	//@Test(groups = {"sanity"},dependsOnGroups={"smoke"})
	//Delete lead
	@Test
	public void deleteerlead() throws InterruptedException{
		String phnenumber = "5488555";
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Phone']");
		enterByXpath("//input[@name='phoneNumber']", phnenumber);
		clickByXpath("//button[text()='Find Leads']");
		/*verifyTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a", leadId);*/
		String leadID  = getTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
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
