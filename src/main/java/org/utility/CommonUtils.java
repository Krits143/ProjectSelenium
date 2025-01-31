package org.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CommonUtils {

	public static WebDriver driver;

	public static void launchBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void urlLaunch(String url) {
		// TODO Auto-generated method stub
		driver.get(url);

	}
	
	public void sendKeys(WebElement element,String userName) {
		// TODO Auto-generated method stub
      element.sendKeys(userName);
	}
	
	public void clickEvent(WebElement e) {
		// TODO Auto-generated method stub
		System.out.println("inside click "+e.getText());
		e.click();

	}
	
	public void jsSelecter(WebElement e) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].removeAttribute('disabled')", e);
	}
	
	
	public void getShadowElement(WebElement e) {
        Actions act = new Actions(driver);		
		act.doubleClick(e).perform();
		
	}
	
	


}
