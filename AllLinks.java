// Shows how to test all links on a page

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//necessary for Select class:
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class AllLinks {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseURL = "http://newtours.demoaut.com/";
        String linkUnderConst = " :under construction";

        //uses "ListElements", not clear on pointy bracket syntax
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));






    }
}