package week2day2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Step 1 
		driver.get("http://leaftaps.com/opentaps");

		//Step 2
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Step 3
		driver.findElementById("password").sendKeys("crmsfa");

		//Step 4
		driver.findElementByClassName("decorativeSubmit").click();

		//Step 5
		driver.findElementByLinkText("CRM/SFA").click();

		//Step 6
		driver.findElementByLinkText("Leads").click();

		//Step 7
		driver.findElementByLinkText("Merge Leads").click();

		//Step 8
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

		//Step9

		Set<String> windowsopen = driver.getWindowHandles();
		int windowcount  = windowsopen.size();


		for (String individualpage : windowsopen) {
			driver.switchTo().window(individualpage);
		}

		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("13224");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();

		//Step10
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		Set<String> windowsopen1 = driver.getWindowHandles();
		int windowcount1  = windowsopen1.size();


		for (String individualpage : windowsopen1) {
			driver.switchTo().window(individualpage);
		}

		//Step 11
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		//  Thread.sleep(6000);
		Set<String> windowsopen11= driver.getWindowHandles();
		windowcount = windowsopen11.size();

		for (String rjini : windowsopen11) {
			driver.switchTo().window(rjini);
		}
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("13222");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		driver .findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();



		Set<String> windowsopen111	=driver.getWindowHandles();
		windowcount = windowsopen111.size();

		for (String individualpage : windowsopen111) {
			driver.switchTo().window(individualpage);
		}
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		driver.findElementByClassName("buttonDangerous").click();


		//Alert handling
		driver.switchTo().alert().accept();


		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("13224");
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		WebElement textval = driver.findElementByXPath("//div[contains(text(),'No records to display')]");

		if (textval.isEnabled()) 

		{
			System.out.println("This element is there");
		}

		driver.close();
		
//		int i;
//		
//		switch (i) {
//		case ((i+1)/2):
//			
//			break;
//
//		default:
//			break;
//		}

	}
	




















	}

}
