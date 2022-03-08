package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    @FindBy(css = "img[src*='pets.png']")
    WebElement petImageIcon;

    @FindBy(css = "a[title='find owners']")
    WebElement findOwnerLink;

    @FindBy(css = "a[title='veterinarians']")
    WebElement veterinariansLink;

    /*
     * Created constructor
     * @param: driver
     */
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*Method is used to verify pet icon is appearing at homepage*/
    public Boolean petImageIconisDisplayed() {
        return petImageIcon.isDisplayed();
    }

    /*Method is used to click on find owner link at homepage*/
    public void clickOnFindOwnerLink() {
        findOwnerLink.click();
    }

    /*Method is used to click on veterinarians link at homepage*/
    public void clickOnVeterinariansLink() {
        veterinariansLink.click();
    }


}
