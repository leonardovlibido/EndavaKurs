package lib.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
	
	protected WebDriver _driver;
	//private String url;
	
	
	
	@FindBy(id = "menu-item-158")
	private WebElement aboutUsLink;
	
	@FindBy(xpath = "id('menu-item-155')")
	private WebElement servicesLink;
	
	//@FindBy(xpath = "id('post-156')//h1")
	//private WebElement aboutUsHeader;
	
	@FindBy(id = "menu-item-374")
	private WebElement registrationLink;
	
	//WebDriver driver;
	
	public Page(WebDriver driver){
		this._driver = driver;
		PageFactory.initElements(_driver, this);
	}
	
	public RegistrationPage clickOnRegistrationLink(){
		registrationLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new RegistrationPage(_driver);
	}
	
	public AboutUs clickOnAboutUsLink(){
		aboutUsLink.click();
		Sleeper.sleepTightInSeconds(2);
		return new AboutUs(_driver);
	}
	
	//public void clickOnAboutUsLink(){
	//	aboutUsLink.click();
	//}
	
	//public String getTextAboutUs(){
	//	String text = aboutUsHeader.getText();
	//	return text;
	//}
	
}
