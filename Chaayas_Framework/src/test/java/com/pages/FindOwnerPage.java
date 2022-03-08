package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindOwnerPage {
	WebDriver driver;

	@FindBy(linkText = "Add Owner")
	WebElement addOwnerButton;

	@FindBy(css = "button[type='submit']")
	WebElement findOwnerButton;

	/*
	 * Created constructor
	 * @param: driver
 	 */
	public FindOwnerPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*Method is used to click on add owner button at homepage*/
	public void clickOnAddOwnerButton(){
		addOwnerButton.click();
	}

	/*Method is used to click on find owner button at homepage*/
	public void clickOnFindOwnerButton(){
		findOwnerButton.click();
	}


}
