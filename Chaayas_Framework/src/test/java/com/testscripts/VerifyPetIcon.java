package com.testscripts;

import com.basepage.BasePage;
import com.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class VerifyPetIcon extends BasePage
{
	HomePage homePage;

	/*Method is used to verify pet icon is appearing at homepage*/
	@Test
	public void verifyPetImageIconIsDisplayed() throws InterruptedException, IOException {
		homePage=new HomePage(driver);
		Assert.assertTrue(homePage.petImageIconisDisplayed());
	}
}
