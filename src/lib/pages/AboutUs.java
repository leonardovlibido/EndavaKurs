package lib.pages;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs extends Page{
	@FindBy(xpath = "id('post-156')/header/h1")
	private WebElement aboutAsHeader;
	
	
	public AboutUs(WebDriver driver){
		super(driver);
	}
	
	public boolean isDisplayedAboutUsHeader() {
		try{
			return aboutAsHeader.isDisplayed();
		} catch(NoSuchElementException e){
			return false;
		}
	}
	
	public String getTextAboutUsHeader() {
		return aboutAsHeader.getText();
	}
	
}
