package com.testscripts;

import com.basepage.BasePage;
import com.pages.*;
import com.utility.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class AddOwnerAndPet extends BasePage {
    HomePage homePage;
    FindOwnerPage findOwnerPage;
    OwnerPage ownerPage;
    OwnerInformationPage ownerInformationPage;
    AddNewPetPage addNewPetPage;


    /*Method is used to verify pet icon is appearing at homepage*/
    @Test
    public void addOwnerAndPet() throws InterruptedException, IOException {
        homePage = new HomePage(driver);
        findOwnerPage = new FindOwnerPage(driver);
        ownerPage = new OwnerPage(driver);
        ownerInformationPage = new OwnerInformationPage(driver);
        AddNewPetPage addNewPetPage = new AddNewPetPage(driver);

        homePage.clickOnFindOwnerLink();
        findOwnerPage.clickOnAddOwnerButton();
        ownerPage.fillOwnerDetails(Constants.OWNER_FIRST_NAME, Constants.OWNER_LAST_NAME, Constants.OWNER_ADDRESS, Constants.OWNER_CITY, Constants.OWNER_TELEPHONE_NUMBER);
        ownerInformationPage.clickOnAddNewPetButton();
        addNewPetPage.fillPetDetails(Constants.PET_NAME, Constants.PET_BIRTHDATE, Constants.PET_TYPE);
        Assert.assertEquals(ownerInformationPage.getOwnerNameLabel(), Constants.OWNER_FIRST_NAME + " " + Constants.OWNER_LAST_NAME);
    }
}
