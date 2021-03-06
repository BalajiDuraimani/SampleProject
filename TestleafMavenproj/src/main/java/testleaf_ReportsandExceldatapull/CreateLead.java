package testleaf_ReportsandExceldatapull;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrappers.ProjectSpecificWrappers;

public class CreateLead extends ProjectSpecificWrappers{

@Test(groups={"smoke"})
	public void createrlead(){

		clickByLink("Create Lead");
		enterById("createLeadForm_companyName", "Cognizant");
		enterById("createLeadForm_firstName","Balaji");
		enterById("createLeadForm_lastName","Duramani");
		enterById("createLeadForm_lastNameLocal", "Sage Of Six Paths");
		enterById("createLeadForm_personalTitle","King");
		selectVisibileTextById("createLeadForm_dataSourceId", "Direct Mail");
		//Don't give parent acccount number
		
		//enterById("createLeadForm_parentPartyId","900200");
		enterById("createLeadForm_firstNameLocal","Adharsh");
		enterById("createLeadForm_departmentName","Adharsh");
		enterById("createLeadForm_numberEmployees","94");
		enterById("createLeadForm_tickerSymbol","vrio");
		enterById("createLeadForm_description","Sage Of Six Paths");
		enterById("createLeadForm_importantNote","Kokoto yoru");
		enterById("createLeadForm_primaryPhoneNumber","5488555");
		enterById("createLeadForm_primaryPhoneAskForName", "ksjs");
		enterById("createLeadForm_primaryWebUrl", "ksjs");
		enterById("createLeadForm_generalToName", "ksjs");
		enterById("createLeadForm_generalAddress1", "ksjs");
		enterById("createLeadForm_generalCity", "ksjs");
		enterById("createLeadForm_generalPostalCode", "ksjs");
		enterById("createLeadForm_generalAttnName", "ksjs");
		enterById("createLeadForm_generalAddress2", "ksjs");
		selectVisibileTextById("createLeadForm_generalStateProvinceGeoId","Alaska");
		selectVisibileTextById("createLeadForm_generalCountryGeoId","United States");
        enterById("createLeadForm_generalProfTitle","Mr");
		enterById("createLeadForm_annualRevenue","100000");
		selectVisibileTextById("createLeadForm_marketingCampaignId","Automobile");
		selectVisibileTextById("createLeadForm_industryEnumId","Computer Software");
		selectVisibileTextById("createLeadForm_ownershipEnumId","Partnership");
		enterById("createLeadForm_sicCode", "12345");
		enterById("createLeadForm_primaryPhoneAreaCode","5698564521");
		enterById("createLeadForm_primaryPhoneExtension","56452");
		enterById("createLeadForm_primaryEmail","test@test.com");
		clickByClassName("smallSubmit");
		String ms = getTextById("viewLead_companyName_sp");
		System.out.println(ms);
	
		




	}

}
