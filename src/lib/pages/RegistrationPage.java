package lib.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Page{
	
	String single = "Single";
	String merried = "Merried";
	
	@FindBy(id = "name_3_firstname")
	private WebElement firstName;
	
	@FindBy(id = "name_3_lastname")
	private WebElement lastName;

	@FindBy(id = "phone_9")
	private WebElement phoneNumber;

	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(id = "email_1")
	private WebElement email;
	
	@FindBy(id = "password_2")
	private WebElement passWord;
	
	@FindBy(id = "confirm_password_password_2")
	private WebElement confirmPassWord;
	
	public RegistrationPage(WebDriver driver) {
		
		
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void sendKeysToFirstNameInput(String firstname){
		firstName.sendKeys(firstname);
	}
	
	public void sendKeysToLastNameInput(String lastname){
		lastName.sendKeys(lastname);
	}
	void sendKeysToPhoneNumberInput(String phonenumber){
		phoneNumber.sendKeys(phonenumber);
	}
	void sendKeysToUserNameInput(String username){
		userName.sendKeys(username);
	}
	void sendKeysToEmailInput(String email){
		this.email.sendKeys(email);
	}
	
	void sendKeysToPassWordInput(String password){
		passWord.sendKeys(password);
	}
	void sendKeysToConfirmPasswordInput(String confirmpassword){
		confirmPassWord.sendKeys(confirmpassword);
	}
	
	
	public void selectMartialStatus(String martialStatus){
		List<WebElement> listOfInputs = _driver.findElements(By.xpath("id('pie_register')/li[2]/div/div/input"));
		if(martialStatus.equalsIgnoreCase(this.single)){
			listOfInputs.get(0).click();
		}
		else if(martialStatus.equalsIgnoreCase(this.merried)){
			listOfInputs.get(1).click();
		}
		else {
			listOfInputs.get(2).click();
		}
	}
	
	
	
	
}
