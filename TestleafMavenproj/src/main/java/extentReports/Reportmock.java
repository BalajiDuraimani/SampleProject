package extentReports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reportmock {


	@Test
	public void extenreporting(){

		//Step 1


		ExtentReports nertreport = new ExtentReports("./XMLmock/nertreport.html");


		//Step 2 

		ExtentTest testrun = nertreport.startTest("TC001","This step creates the lead");
		testrun.assignAuthor("Aadarh");
		testrun.assignCategory("Testleaf test");
		ExtentTest testrun1 = nertreport.startTest("TC002","This step creates the lead");
		testrun.assignAuthor("Aadarh");
		testrun.assignCategory("Testleaf test");
		ExtentTest testrun2 = nertreport.startTest("TC003","This step creates the lead");
		testrun.assignAuthor("Balaji");
		testrun.assignCategory("Testleaf test");
		ExtentTest testrun3 = nertreport.startTest("TC004","This step creates the lead");
        testrun.assignAuthor("Balaji");
        testrun.assignCategory("Testleaf test");



		//Step 3
		testrun.log(LogStatus.PASS, "This test ran sucessfully");



		//step 4
		nertreport.endTest(testrun);
		nertreport.flush();




	}

}
