package com.testscripts;

import com.basepage.BasePage;
import com.pages.*;
import com.utility.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;


public class GetVeterinariansDetails extends BasePage
{
	HomePage homePage;
	VeterinariansInformationPage veterinariansInformationPage;

	/*Method is used to verify veterinarians details*/
	@Test
	public void verifyVeterinariansDetails() throws InterruptedException, IOException
	{
		homePage=new HomePage(driver);
		veterinariansInformationPage=new VeterinariansInformationPage(driver);
		homePage.clickOnVeterinariansLink();
		veterinariansInformationPage.getVeterinariansName();
		Assert.assertTrue(veterinariansInformationPage.verifyVeterinariansNameIsDisplayed());
	}
}
