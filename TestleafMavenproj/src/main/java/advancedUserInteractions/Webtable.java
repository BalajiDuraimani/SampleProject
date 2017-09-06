package advancedUserInteractions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	
	
	public void webTableinteraction(){
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in/");
		driver.findElementById("txtStationFrom").sendKeys("Chennai Beach Jn");
		driver.findElementById("txtStationTo").sendKeys("Mumbai Central");
		driver.findElementById("c").click();
		driver.findElementByXPath("//table[@class='DataTable TrainList']")
		
		
		
		
	}

}
