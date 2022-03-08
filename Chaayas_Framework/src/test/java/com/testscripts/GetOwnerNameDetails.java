package com.testscripts;

import com.basepage.BasePage;
import com.pages.FindOwnerPage;
import com.pages.HomePage;
import com.pages.OwnerInformationPage;
import com.pages.VeterinariansInformationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class GetOwnerNameDetails extends BasePage
{
	HomePage homePage;
	FindOwnerPage findOwnerPage;
	OwnerInformationPage ownerInformationPage;
	
	/*Method is used to verify veterinarians details*/
	@Test
	public void traverseOwnerDetails() throws InterruptedException, IOException
	{
		homePage=new HomePage(driver);
		findOwnerPage=new FindOwnerPage(driver);
		ownerInformationPage=new OwnerInformationPage(driver);

		homePage.clickOnFindOwnerLink();
		findOwnerPage.clickOnFindOwnerButton();
		ownerInformationPage.getOwnerName();
		Assert.assertTrue(ownerInformationPage.verifyOwnerNameIsDisplayed());
	}
}
