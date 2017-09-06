package week1day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().window().maximize();
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("adarsh");
		driver.findElementById("userRegistrationForm:password").sendKeys("adarsh1qwert");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("adarsh1qwert");
		WebElement securityq = driver.findElementById("userRegistrationForm:securityQ");
		Select gg = new Select(securityq);
		//gg.selectByValue("3");
		gg.selectByVisibleText("What is your favorite past-time?");
		
		
		List<WebElement> vgy = gg.getOptions();
		
		int Cour = vgy.size();
		
		System.out.println(Cour);
		
		gg.selectByIndex(Cour-2);
		
		
		
		
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Test");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Adharsh");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("A");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Prasana");
		driver.findElementById("userRegistrationForm:gender").click();
		driver.findElementById("userRegistrationForm:maritalStatus").click();
		driver.findElementById("userRegistrationForm:uidno").sendKeys("787673829234");
		driver.findElementById("userRegistrationForm:idno").sendKeys("uyhtj9878");
		driver.findElementById("userRegistrationForm:email").sendKeys("adharsh@testleaf.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9043856643");
		WebElement jh = driver.findElementById("userRegistrationForm:nationalityId");
		
		Select gh = new Select(jh);
		gh.selectByVisibleText("India");
		
		
		
		driver.findElementById("userRegistrationForm:address").sendKeys("plotno23 address");
		driver.findElementById("userRegistrationForm:street").sendKeys("2ndstreet");
		driver.findElementById("userRegistrationForm:area").sendKeys("palla");
   WebElement fi = driver.findElementById("userRegistrationForm:countries");
   Select vkl = new Select(fi);
   vkl.selectByVisibleText("India");
   
   
   
		
		//driver.findElementById("userRegistrationForm:pincode").sendKeys("600127");
		//driver.findElementById("userRegistrationForm:statesName").sendKeys("Chennai");
		//driver.findElementById("userRegistrationForm:landline").sendKeys("22775943");
		
		WebElement dr =driver.findElementById("userRegistrationForm:securityQ");
		Select bv = new Select(dr);
		List <WebElement> fg = bv.getOptions();
		int m = fg.size();
		bv.selectByIndex(m-2);
				
		
		
		

	}

}
