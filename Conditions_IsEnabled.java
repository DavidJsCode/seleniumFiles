//necessary for explicit waits
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditions_IsEnabled {

    public static void main (String[]args){

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebDriverWait waitVar = new WebDriverWait(driver, 10);

        String baseURL = "http://newtours.demoaut.com/";
        String tagName;

        driver.get(baseURL);

        WebElement usernameTextbox = driver.findElement(By.name("userName"));

        if (usernameTextbox.isEnabled()) {
            usernameTextbox.sendKeys("You are a goofball");

        }
        else {
            usernameTextbox.sendKeys("You are not a goofball");
        }
    }
}
