package test;

import org.testng.annotations.Test;

import lib.pages.AboutUs;
import lib.pages.HomePage;
import lib.pages.Page;
import lib.pages.RegistrationPage;
import lib.util.Browser;

import org.testng.annotations.BeforeClass;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestDrugi {
	  WebDriver driver;
	  
	  HomePage homePage;
	  AboutUs aboutUsPage;
	  RegistrationPage registrationPage;
  @Test
  public void test() {
	  try{
		  homePage = new HomePage(driver);
		  aboutUsPage = homePage.clickOnAboutUsLink();
	  
		  Assert.assertEquals(aboutUsPage.isDisplayedAboutUsHeader(), true);
		  Assert.assertEquals(aboutUsPage.getTextAboutUsHeader(), "About us");
	  } catch(Exception e){
		  e.printStackTrace();
	  }
	  
  }
  @BeforeClass
  public void setUp() {
	  driver = Browser.openBrowser("http://demoqa.com/");
  }

  @AfterClass
  public void afterClass() {
  }

}
