//use catches to exceptions described below

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exceptions {

    public static void main (String[]args){

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebDriverWait waitVar = new WebDriverWait(driver, 10);

        String baseURL = "http://newtours.demoaut.com/";
        String tagName;

        driver.get(baseURL);



    }
}
