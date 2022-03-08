package com.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VeterinariansInformationPage {
	WebDriver driver;

	@FindBy(xpath = "//table[@id='vets']/tbody/tr/td[1]")
	List<WebElement> getVeterinariansName;

	/*
	 * Created constructor
	 * @param: driver
	 */
	public VeterinariansInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Method is used display owner name*/
	public String getVeterinariansName() {
		String veterinariansName="";
		System.out.println("----VETERINARIANS NAMES---");
		for (int i=0; i<getVeterinariansName.size();i++) {
			veterinariansName=getVeterinariansName.get(i).getText();
			System.out.println(getVeterinariansName.get(i).getText());
		}
		return veterinariansName;
	}

	/*Method is used verify veterinarians name is displayed*/
	public Boolean verifyVeterinariansNameIsDisplayed() {
		return getVeterinariansName.get(0).isDisplayed();

	}
}
