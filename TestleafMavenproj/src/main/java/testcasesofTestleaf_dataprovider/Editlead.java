package testcasesofTestleaf_dataprovider;


import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class Editlead extends ProjectSpecificWrappers{
	
	@Test(groups={"smoke"},dataProvider = "Editleaddata")
	public void editerlead(String leadnametoedit)
	{
		
		//String leadnametoedit = "Balaji";
		    //Edit lead		
//		invokeApp("chrome", "http://leaftaps.com/opentaps/control/main");
//		enterById("username", "DemoSalesManager");
//		enterById("password", "crmsfa");
//		clickByClassName("decorativeSubmit");
//		clickByLink("CRM/SFA");

	/*	invokeApp("chrome", "http://leaftaps.com/opentaps/control/main");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");*/
	clickByLink("Leads");
	clickByLink("Find Leads");
	enterByXpath("(//input[@name='firstName'])[3]", leadnametoedit);
	clickByXpath("//button[text()='Find Leads']");
	clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
	verifyTitle("View Lead | opentaps CRM");
	clickByLink("Edit");
	enterById("updateLeadForm_companyName", "jsjjsj");
	clickByXpath("//input[@value='Update']");
	verifyTextById("viewLead_companyName_sp", "jsjjsj");
	
	}
	
}

