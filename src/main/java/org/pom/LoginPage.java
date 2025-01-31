package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.CommonUtils;

public class LoginPage extends CommonUtils{
	
	public LoginPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="login")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='signin_btn']")
	private WebElement signInBtn;
	
	@FindBy(xpath="//div[@style='height: auto;']")
	private WebElement shadowElementDiv;
	
	

	@FindBy(xpath="(//div[@id='app'])//p[@class='error-message__27FL']")
	private WebElement errorMessage;


	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUserName() {
		return userName;
	}
	
	
	public WebElement getErrorMessage() {
		return errorMessage;
	}
	
	public WebElement getShadowElementDiv() {
		return shadowElementDiv;
	}
	
	
	
	

}
