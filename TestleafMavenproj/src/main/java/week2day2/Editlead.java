package week2day2;


import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class Editlead extends ProjectSpecificWrappers{
	
	@Test(groups = {"sanity"})
	public void editerlead()
	{
    //Edit lead		
//		invokeApp("chrome", "http://leaftaps.com/opentaps/control/main");
//		enterById("username", "DemoSalesManager");
//		enterById("password", "crmsfa");
//		clickByClassName("decorativeSubmit");
//		clickByLink("CRM/SFA");

		invokeApp("chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
	clickByLink("Leads");
	clickByLink("Find Leads");
	enterByXpath("(//input[@name='firstName'])[3]", "Balaji");
	clickByXpath("//button[text()='Find Leads']");
	clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	verifyTitle("View Lead | opentaps CRM");
	clickByLink("Edit");
	enterById("updateLeadForm_companyName", "jsjjsj");
	clickByXpath("//input[@value='Update']");
	verifyTextById("viewLead_companyName_sp", "jsjjsj");
	close();
	}
	
}

