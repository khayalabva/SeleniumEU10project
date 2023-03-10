package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //Do browser driver setup
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void tearDownMethod(){
        driver.close();
    }

    @Test
    public void selenium_test(){

        //Get "https://google.com"
        driver.get("https://google.com");

        //Assert: title is "Google"
        Assert.assertEquals(driver.getTitle(), "Google", "Title is not matching");


    }

}
