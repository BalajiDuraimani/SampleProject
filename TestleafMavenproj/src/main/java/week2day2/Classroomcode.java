package week2day2;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Classroomcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  
          ChromeDriver driver = new ChromeDriver();

          driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

          driver.manage().window().maximize();

          driver.findElementByLinkText("Contact Us").click();

          Set<String> allWindows = driver.getWindowHandles();

          System.out.println(allWindows.size());

          for (String eachwindow : allWindows) {

                 driver.switchTo().window(eachwindow);
          }
//
//          WebElement text = driver.findElementByLinkText("care@irctc.co.in");
//
//          String foundtext = text.getText();

          // if (text.isDisplayed());
          // System.out.println("Element is displayed");

         // String realtext = "care@irctc.co.in";
          String titlofpage = driver.getTitle();
           System.out.println(titlofpage);
          String verifictiontext = "IRCTC";
//          if (verifictiontext.equals(titlofpage))
//          
//        	  System.out.println("Title of page is " +titlofpage);
//          
//          
//          
//          
////          if (realtext.contains(foundtext))
////
////                 System.out.println("Element is displayed");
////         
////          List<WebElement> count = driver.findElementsByTagName("a");
////          int data = count.size();
////         
////          System.out.println(data);
////          driver.close();
//
//

	}

}
