//necessary for explicit waits
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {

    public static void main (String[]args){

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebDriverWait waitVar = new WebDriverWait(driver, 10);

        String baseURL = "";
        String tagName;

        driver.get(baseURL);
        driver.switchTo().frame("classFrame");
        //"locator" part of the code is same as any of the locators found in Selenium IDE
        driver.findElement(By.linkText("Deprecated")).click();

    }
}
