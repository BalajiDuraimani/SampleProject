package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.management.RuntimeErrorException;
import javax.print.DocFlavor.STRING;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class GenericWrappers implements Wrappers {
	RemoteWebDriver driver;
	int i = 1;



	public void invokeApp(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
			driver = new ChromeDriver();			
		}else {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");		
			driver = new FirefoxDriver();			
		}			
		driver.get(url);		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);		

		driver.manage().window().maximize();
		System.out.println("The Browser "+ browser +" is launched");
		//takeSnap();
	}

	public void enterById(String idValue, String data) {

		try {

			driver.findElementById(idValue).clear();
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("The text Field " + idValue + " is entered with text " +data);
			takeSnap();
		} catch (NoSuchElementException e) {
			System.err.println("The entering element" + idValue + "is not found");
		}catch (WebDriverException e) {
			System.err.println("The browser closed or some other error has ocured");

		}
		finally {
			takeSnap();
		}
	}


	public void enterByName(String nameValue, String data) {
		driver.findElementByName(nameValue).sendKeys(data);
		takeSnap();

	}

	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			System.out.println("The text Field  "+ xpathValue +"  is entered with text "+data);
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The entering element " + xpathValue + " is not found");
		}catch (WebDriverException e) {
			System.err.println("The browser closed or some other error has ocured");

		}
		finally {
			takeSnap();
		}

	}

	public boolean verifyTitle(String title) {
		try {
			String titleofpage = driver.getTitle();
			System.out.println("Page title is"+titleofpage);
			if(titleofpage.equalsIgnoreCase(title))
			{
				System.out.println("The title is verified in the page");

			}
			else 
			{
				System.out.println("The page title is not same as string" +title);
			}

		} catch (WebDriverException e) {
			System.err.println("The browser closed or some other error has ocured");

		}
		finally {
			takeSnap();
		}
		return false;
	}

	public void verifyTextById(String id, String text) {
		try {
			String verifytext= driver.findElementById(id).getText();
			System.out.println("the text to be Verified" + verifytext);
			if (verifytext.contains(text))
			{
				System.out.println("The Text value is verified");
			}

			else
			{
				System.out.println("The text value is not equal to" + text);
			}
		} catch (WebDriverException e) {
			System.err.println("The browser closed or some other error has ocured");

		}
		finally {
			takeSnap();
		}
	}

	public void verifyTextByXpath(String xpath, String text) {
		String verifytext= driver.findElementByXPath(xpath).getText();
		System.out.println("the text to be Verified " + verifytext);
		if (verifytext.equalsIgnoreCase(text))
		{
			System.out.println("The Text value is verified");
		}

		else
		{
			System.out.println("The text value is not equal to"+text);
		}

	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			String verifytext= driver.findElementByXPath(xpath).getText();
			if (verifytext.contains(text))
			{
				System.out.println("The Text value is verified");
			}

			else
			{
				System.out.println("The text value is not equal to" + text);
			}
		} catch (WebDriverException e) {
			System.err.println("The browser closed or some other error has ocured");

		}
		finally {
			takeSnap();
		}
	}

	public void clickById(String id) {

		try {
			driver.findElementById(id).click();
			takeSnap();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("No Such element " + id);
		}
	}

	public void clickByClassName(String classVal) {

		driver.findElementByClassName(classVal).click();
		System.out.println("The button "+ classVal +" is clicked");
		takeSnap();

	}



	public void clickByName(String name) {
		driver.findElementByName(name).click();
		takeSnap();

	}

	public void clickByLink(String name) {
		try {

			driver.findElementByLinkText(name).click();
			System.out.println("The button " + name + " is clicked");
		} catch (NoSuchElementException e) {
			System.err.println("The Element " + name + " not found");

		}
		catch (WebDriverException e) {
			System.err.println("Browser closed");
		}
		finally {
			takeSnap();
		}


	}

	public void clickByLinkNoSnap(String name) {
		driver.findElementByPartialLinkText(name).click();


	}

	public void clickByXpath(String xpathVal) {
		driver.findElementByXPath(xpathVal).click();
		System.out.println(" The Xpath link " + xpathVal + " is clicked");
		takeSnap();
	}

	public void clickByXpathNoSnap(String xpathVal)
	{

	}

	public String getTextById(String idVal) {
		String textval = driver.findElementById(idVal).getText();
		return textval;


	}

	public String getTextByXpath(String xpathVal) {
		String textval = driver.findElementByXPath(xpathVal).getText();
		return textval;

	}

	public void selectVisibileTextById(String id, String value) {

		WebElement object = driver.findElementById(id);
		Select object2 = new Select(object);
		object2.selectByVisibleText(value);
		System.out.println("The dropdown " + value + " is selected");
		takeSnap();
	}



	public void selectIndexById(String id, int value) {
		WebElement selector = driver.findElementById(id);
		Select objselec = new Select(selector);
		objselec.selectByIndex(value);
		System.out.println("The Dropdown value " + value +" is selected");
		takeSnap();
	}




	public void switchToParentWindow() {
		// Closes the child window		
		String firstwindow = driver.getWindowHandle();
		driver.switchTo().window(firstwindow).close();

		Set<String> allhandles= driver.getWindowHandles();
		for (String singlehandle : allhandles) {
			driver.switchTo().window(singlehandle);
			System.out.println(singlehandle);

		}
		String activepage= driver.getTitle();

		System.out.println("You are now active on the parent window " + activepage);
	}





	public void switchToLastWindow() {

		Set <String> allwindhandes	= driver.getWindowHandles();
		for (String singlewin : allwindhandes) 
		{
			driver.switchTo().window(singlewin);
		}

		System.out.println("The newer window has been switched");
	}


	public void acceptAlert() {

		driver.switchTo().alert().accept();
		takeSnap();




	}

	public void dismissAlert() {

		Alert first = driver.switchTo().alert();
		first.dismiss();


	}

	public String getAlertText() {
		driver.switchTo().alert().getText();

		return null;
	}

	public void takeSnap() {
		//		// TODO Auto-generated method stub
		//		try {
		//			File src = driver.getScreenshotAs(OutputType.FILE);
		//			File desc = new File("./Snapshot/snap"+i+".jpg");
		//			FileUtils.copyFile(src, desc);
		//			i++;
		//		} catch (WebDriverException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		} catch (IOException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}


	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		takeSnap();
		driver.close();
	}

	public void closeAllBrowsers() {
		driver.close();


	}

	public void switchbackwhenlatestwindowcloses() {
		// TODO Auto-generated method stub

	}

	public void waitExplicit(String xpathExpression) {
		WebDriverWait waitobj = new WebDriverWait(driver, 10);
		waitobj.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));

	}		
}




