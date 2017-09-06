package advancedUserInteractions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Userinteraction {
	
	
		/*@Test
		public void interactionElements(){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://jqueryui.com/droppable");
			driver.manage().window().maximize();
			driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		    WebElement draggable= driver.findElementByXPath("//*[@id='draggable']/p");
		    WebElement droppable= driver.findElementByXPath("//*[@id='droppable']");
		    Actions builder=new Actions(driver);
		    builder.dragAndDrop(draggable,droppable).perform();
		}*/
		
		
		
	/*	@Test
		public void interactionSelectable(){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://jqueryui.com/selectable");
			driver.manage().window().maximize();
			driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
			WebElement item1=driver.findElementByXPath("//*[@id='selectable']/li[1]");
			WebElement item6=driver.findElementByXPath("//*[@id='selectable']/li[6]");
			Actions builder=new Actions(driver);
			builder.clickAndHold(item1).release(item6).build().perform();
			
		}*/
		
		@Test
		public void interactionMouseOver() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://flipkart.com");
			driver.manage().window().maximize();
			WebElement appliances=driver.findElementByXPath("//*[@id='container']/div/header/div[2]/div/ul/li[2]/a/span");
			WebElement fridge=driver.findElementByXPath("//*[@id='container']/div/header/div[2]/div/ul/li[2]/ul/li/ul/li[2]/ul/li[5]/a/span[1]");
			Actions builder=new Actions(driver);
			builder.moveToElement(appliances).perform();
			Thread.sleep(3000);
			builder.click(fridge).perform();
			
		}

}
	