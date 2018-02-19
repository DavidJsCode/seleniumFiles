// Shows how to select one item from drop downs or many item if allowed

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//necessary for Select class:
import org.openqa.selenium.support.ui.Select;


public class DropDownBoxes_OneAndMany {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebDriverWait waitVar = new WebDriverWait(driver, 10);

        String baseURL = "http://newtours.demoaut.com/";
        String baseURL2 = "http://jsbin.com/osebed/2";
        String tagName;
        // Select dropDown = new Select (driver.findElement(By.partialLinkText("REG")));
        // Select dropDown_Multi = new Select (driver.findElement(By.id("fruits")));

        driver.get(baseURL);

        WebElement usernameTextbox = driver.findElement(By.name("userName"));
        usernameTextbox.sendKeys("tutorial");

        WebElement passwordTextbox = driver.findElement(By.name("password"));
        passwordTextbox.sendKeys("tutorial");

        WebElement submitButton = driver.findElement(By.name("login"));
        submitButton.click();


        Select drpCountry = new Select(driver.findElement(By.name("fromPort")));
        drpCountry.selectByVisibleText("London");

        driver.get(baseURL2);

        Select drpFruits = new Select(driver.findElement(By.id("fruits")));
        drpFruits.selectByIndex(0);
        drpFruits.selectByIndex(2);

        drpFruits.deselectByIndex(2);

        drpFruits.selectByValue("apple");
        drpFruits.selectByValue("grape");

        drpFruits.deselectByVisibleText("Apple");
        drpFruits.deselectByVisibleText("Grape");

        if (drpFruits.isMultiple()) {
            drpFruits.deselectAll();
        }
    }
}

