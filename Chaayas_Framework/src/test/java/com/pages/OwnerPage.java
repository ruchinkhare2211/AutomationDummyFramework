package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class OwnerPage {
	WebDriver driver;

	@FindBy(id = "firstName")
	WebElement firstNameTextBox;

	@FindBy(id = "lastName")
	WebElement lastNameTextBox;

	@FindBy(id = "address")
	WebElement addressTextBox;

	@FindBy(id = "city")
	WebElement cityTextBox;

	@FindBy(id = "telephone")
	WebElement telephoneTextBox;

	@FindBy(css = "button[type='submit']")
	WebElement addOwnerButton;

	@FindBy(xpath = "//div[@class='form-group has-error']/label")
	List<WebElement> blankFeildsName;

	/*
	 * Created constructor
	 * @param: driver
 	 */
	public OwnerPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*Method is used to click on add owner button at homepage
	* @param: firstName, lastName, address, city, telephoneNumber
	* */
	public void fillOwnerDetails(String firstName, String lastName, String address, String city, String telephoneNumber){
		firstNameTextBox.sendKeys(firstName);
		lastNameTextBox.sendKeys(lastName);
		addressTextBox.sendKeys(address);
		cityTextBox.sendKeys(city);
		telephoneTextBox.sendKeys(telephoneNumber);
		addOwnerButton.click();
		System.out.println(blanksFeilds());
	}

	public String blanksFeilds() {
		blankFeildsName.size();
		ArrayList<String> elementName=new ArrayList<String>();
		for(int i=0;i<blankFeildsName.size();i++){
			elementName.add(blankFeildsName.get(i).getText());
		}
		return String.valueOf(elementName);
	}
}
