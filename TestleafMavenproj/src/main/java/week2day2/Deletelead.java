package week2day2;


import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class Deletelead extends ProjectSpecificWrappers{
	
	@Test(dependsOnMethods = "week2day2.CreateLead.createrlead")
	//Delete lead
	public void deleteerlead() throws InterruptedException{
		String leadId = "13963";
		login();
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Phone']");
		enterByXpath("//input[@name='phoneNumber']", "89562345689");
		clickByXpath("//button[text()='Find Leads']");
		verifyTextByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a", leadId);
		clickByXpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a");
		clickByXpath("//a[text()= 'Delete']");
		Thread.sleep(3000);
		clickByLink("Find Leads");
		Thread.sleep(3000);
		enterByXpath("//label[text()='Lead ID:']/following::input", leadId);
		clickByXpath("//button[text()='Find Leads']");
		Thread.sleep(3000);
		verifyTextContainsByXpath("//div[text()='No records to display']", "No records to display");
		closeAllBrowsers();
	}

}
