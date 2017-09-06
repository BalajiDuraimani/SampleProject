package automationsavaari;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SaavariAutomate {



	@Test
	public void Testcase1() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.savaari.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@id='from_city']").sendKeys("Bangalore, Karnataka");
		driver.findElementByXPath("//input[@id='to_city_1']").sendKeys("Mysore, Karnatak");
		driver.findElementByXPath("//input[@id='go']").click();

		List<WebElement> collection = driver.findElementsByXPath("(//div[@class='large-8 medium-8 small-8 columns small-push-12 col-pad-10'])/h5/strong");
		WebElement aman = collection.get(1);
		System.out.println(aman.getText());
		int count=0;
		for (@SuppressWarnings("unused") WebElement webElement : collection) {
			count=count+1;
			System.out.println(count);
		}

Thread.sleep(4000);
		int i;
		//String carname="";
		Map<String, String> carlist = new HashMap<String, String>();
		for (i=1;i<count;i++)
		{
			WebElement firstlevel = driver.findElementByXPath("((//div[@class='large-8 medium-8 small-8 columns small-push-12 col-pad-10'])/h5/strong)["+i+"]");
			String FinalCarname  = firstlevel.getText();
			WebElement pricefirstlevel = driver.findElementByXPath("((//div[@class='large-12 medium-12 small-4 columns text-right']/h3/strong))["+i+"]");
			String Finalprice  = pricefirstlevel.getText();
			String modifiedvalue= Finalprice.replaceAll("[^0-9]","");
			carlist.put(FinalCarname, modifiedvalue);	
			
		}

System.out.println(carlist);
		
	}
}
