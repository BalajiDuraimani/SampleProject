package testleaf_ReportsandExceldatapull;


import org.testng.annotations.Test;

import wrappers.GenericWrappers;
import wrappers.ProjectSpecificWrappers;

public class DuplicateLead extends ProjectSpecificWrappers{
	
	
	@Test(groups = "regression",dependsOnGroups = {"sanity"})
	
	public void duplead () throws InterruptedException{
		clickByLink("Leads");
		clickByLink("Find Leads");
		clickByXpath("//span[text()='Email']");
		enterByXpath("//input[@name='emailAddress']", "test@test.com");
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
		
		
		
		
		
	}

}
