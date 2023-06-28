package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {

    @FindBy(how=How.XPATH,using="//input[@name='firstName']") private WebElement firstname;
	
	@FindBy(how=How.XPATH,using="//input[@name='lastName']") private WebElement lastname;
	
	@FindBy(how=How.XPATH,using="//input[@name='phone']") private WebElement phone;
	
	@FindBy(how=How.XPATH,using="//input[@id='userName']") private WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@name='address1']") private WebElement Address;
	
	@FindBy(how=How.XPATH,using="//input[@name='city']") private WebElement city;
	
	@FindBy(how=How.XPATH,using="//input[@name='state']") private WebElement state;
	
	@FindBy(how=How.XPATH,using="//input[@name='postalCode']")private WebElement code;
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")private WebElement country;
	
	@FindBy(how=How.XPATH,using="//input[@name='email']")private WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")private WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@name='confirmPassword']")private WebElement confirm_pass;
	
	@FindBy(how=How.NAME,using="submit")private WebElement Submit;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getPhone() {
		return phone;
	}


	public WebElement getUsername() {
		return username;
	}

	public WebElement getAddress() {
		return Address;
	}


	public WebElement getCity() {
		return city;
	}


	public WebElement getState() {
		return state;
	}


	public WebElement getCode() {
		return code;
	}


	public WebElement getCountry() {
		return country;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirm_pass() {
		return confirm_pass;
	}


	public WebElement getSubmit() {
		return Submit;
	}
}
