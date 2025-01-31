package org.leet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pom.LoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utility.CommonUtils;

public class LeetLogin extends CommonUtils{
	
	
	@BeforeClass
	public void beforeClass() {
		launchBrowser();
		
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		urlLaunch("https://leetcode.com/accounts/login/");
		LoginPage lp = new LoginPage();
		
		//jsSelecter(lp.getSignInBtn());
		
		sendKeys(lp.getUserName(), "kirfdfd");
	    sendKeys(lp.getPassword(), "zfsf");

	    Thread.sleep(5000);
	    
	    getShadowElement(lp.getShadowElementDiv());
	
		Thread.sleep(5000);
		clickEvent(lp.getSignInBtn());
		
		Thread.sleep(5000);
		WebElement errorMessage = lp.getErrorMessage();
		
		System.out.println(errorMessage.getText());
	}
	
		
	
	
	

}
