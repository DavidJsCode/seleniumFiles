// package com.company.java

//import Selenium-specific libraries
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchHotel01 {

public static void main (String[] args){

    //tell Selenium what and where driver that starts Chrome is
    System.setProperty(
            "webdriver.chrome.driver",
            "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");

    WebDriver driver = new ChromeDriver();

    //Sets URL to navigate to
    String appurl = "http://www.phptravels.net/en";

    driver.get(appurl);

    //Maximize browser window
    driver.manage().window().maximize();

    //Set expected page title as a string variable
    String expectedTitle =  "PHPTRAVELS | Travel Technology Partner";

    //Gets actual page title string
    String actualTitle = driver.getTitle();

    //Compares actual title with expected
    if (expectedTitle.equals(actualTitle))
    {        System.out.println("Title is correct");

    }
    else {
        System.out.println("Title is not correct");
    }

    //find item by URL:
    WebElement cheese = driver.findElement(By.linkText("Blog"));













}

}
