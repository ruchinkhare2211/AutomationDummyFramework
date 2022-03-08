package com.chaayostestcase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.basepage.BasePage;
import com.pages.HomePage;


public class PetIcon extends BasePage
{
	HomePage homePage;

	@Test
	public void verifypetImageIconisDisplayed() throws InterruptedException, IOException
	{
		homePage=new HomePage(driver);
		Assert.assertTrue(homePage.petImageIconisDisplayed());
	}
}
