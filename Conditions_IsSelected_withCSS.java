//isSelected() verify whether a certain check box, radio button, or option in a drop-down box is selected

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Conditions_IsSelected_withCSS {

    public static void main (String[]args){

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebDriverWait waitVar = new WebDriverWait(driver, 10);

        String baseURL = "http://newtours.demoaut.com/";
        String tagName;

        driver.get(baseURL);


        WebElement usernameTextbox = driver.findElement(By.name("userName"));
        usernameTextbox.sendKeys("tutorial");

        WebElement passwordTextbox = driver.findElement(By.name("password"));
        passwordTextbox.sendKeys("tutorial");

        WebElement submitButton = driver.findElement(By.name("login"));
        submitButton.click();

        //check box

        //(By.cssSelector("input[id=email']"));
        if (driver.findElement(By.cssSelector("input[value=roundtrip]")).isSelected()) {
            driver.findElement(By.cssSelector("input[value=oneway]")).click();}

            if (driver.findElement(By.cssSelector("option[value=Acapulco]")).isSelected()) {
                driver.findElement(By.cssSelector("option[value=Frankfurt]")).click();
            }

            else {

                driver.findElement(By.cssSelector("option[value=Paris]")).click();

            }

        }
    }


