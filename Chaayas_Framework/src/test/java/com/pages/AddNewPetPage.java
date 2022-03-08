package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewPetPage {
	WebDriver driver;

	@FindBy(id = "name")
	WebElement petNameTextBox;

	@FindBy(id = "birthDate")
	WebElement birthDateTextBox;

	@FindBy(id = "type")
	WebElement petTypeDropDown;

	@FindBy(css = "button[type='submit']")
	WebElement addPetButton;

	/*
	 * Created constructor
	 * @param: driver
 	 */
	public AddNewPetPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*Method is used to click on add owner button at homepage
	* @param: name, birthDate, typeOfPet
	* */
	public void fillPetDetails(String name, String birthDate, String typeOfPet){
		petNameTextBox.sendKeys(name);
		birthDateTextBox.clear();
		birthDateTextBox.sendKeys(birthDate);
		Select petType=new Select(petTypeDropDown);
		petType.selectByVisibleText(typeOfPet);
		addPetButton.click();
		System.out.println("Added");
	}

}
