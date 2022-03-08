package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OwnerInformationPage {
	WebDriver driver;


	@FindBy(linkText = "Add New Pet")
	WebElement addNewPetButton;

	@FindBy(xpath = "//th[text()='Name']/following-sibling::td/b")
	WebElement ownerNameLabel;

	@FindBy(xpath = "//th[text()='Address']/following-sibling::td")
	WebElement ownerAddressLabel;

	@FindBy(xpath = "//th[text()='City']/following-sibling::td")
	WebElement ownerCityLabel;

	@FindBy(xpath = "//th[text()='Telephone']/following-sibling::td")
	WebElement ownerTelephoneLabel;

	@FindBy(xpath = "//dt[text()='Name']/following-sibling::dd")
	WebElement petNameLabel;

	@FindBy(xpath = "//dt[text()='Type']/following-sibling::dd")
	WebElement petTypeLabel;

	@FindBy(xpath = "//table[@id='owners']/tbody/tr/td[1]/a")
	List<WebElement> getOwnerName;

	/*
	 * Created constructor
	 * @param: driver
 	 */
	public OwnerInformationPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*Method is used to click on add new pet button*/
	public void clickOnAddNewPetButton(){
		addNewPetButton.click();
	}

	/*Method is used to get owner name*/
	public String getOwnerNameLabel() {
		return ownerNameLabel.getText();
	}

	/*Method is used to get owner address*/
	public String getAddressLabel() {
		return ownerAddressLabel.getText();
	}

	/*Method is used to get owner city name*/
	public String getCityLabel() {
		return ownerCityLabel.getText();
	}

	/*Method is used to get owner telephone number*/
	public String getTelephoneLabel() {
		return ownerTelephoneLabel.getText();
	}

	/*Method is used to get pet name*/
	public String getPetNameLabel() {
		return petNameLabel.getText();
	}

	/*Method is used to get pet type*/
	public String getPetTypeLabel() {
		return petTypeLabel.getText();
	}

	/*Method is used display owner name*/
	public String getOwnerName() {
		String ownerName="";
		System.out.println("----OWNER NAMES---");
		for (int i=0; i<getOwnerName.size();i++) {
			ownerName=getOwnerName.get(i).getText();
			System.out.println(getOwnerName.get(i).getText());
		}
		return ownerName;
	}

	/*Method is used verify owner name is displayed*/
	public Boolean verifyOwnerNameIsDisplayed() {
		return getOwnerName.get(0).isDisplayed();
	}

}
