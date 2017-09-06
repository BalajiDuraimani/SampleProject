package testleaf_ReportsandExceldatapull;


import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class Editlead extends ProjectSpecificWrappers{
	
	@Test(groups ="sanity",dependsOnGroups={"smoke"})
	public void editerlead()
	{
		
		String leadnametoedit = "Balaji";

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

