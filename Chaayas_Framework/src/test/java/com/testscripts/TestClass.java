package com.testscripts;

import com.basepage.BasePage;
import com.pages.OwnerPage;
import com.utility.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class TestClass extends BasePage {

//    @Test
//    public void test() throws IOException, InterruptedException {
//        driver.navigate().to("http://localhost:8080/owners/new");
//        OwnerPage ownerPage=new OwnerPage(driver);
//
//        ownerPage.fillOwnerDetails(Constants.OWNER_FIRST_NAME, "", "", "", Constants.OWNER_TELEPHONE_NUMBER);
//    }
//    @Test()
//    public void test2(){
//        driver.get("https://sakshingp.github.io/assignment/login.html");
//        driver.findElement(By.id("username")).sendKeys("abc");
//        driver.findElement(By.id("password")).sendKeys("abc");
//        driver.findElement(By.id("log-in")).click();
//        driver.findElement(By.id("amount")).click();
//
//        ArrayList<WebElement> amount=new ArrayList<WebElement>(driver.findElements(By.xpath("//table[@id='transactionsTable']/tbody/tr/td[5]")));
//
//        for(int i=0;i<amount.size();i++){
//            amount.get(i).getText();
//
//        }
//
//
//
//    }

    @Test
    public void test3(){
        int arr[]={3,20,7,11,19,12};
        int temp=0;
    for(int i=0;i<arr.length-1;i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if(arr[i]<arr[j]){ //3
                temp=arr[j]; // 20

            }
        }
    }
    }
}
