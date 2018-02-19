
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseLocators {

    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

       // String baseURL = "https://www.facebook.com";
        // String tagName;

        driver.get("http://www.popuptest.com/popuptest2.html");
        //"locator" part of the code is same as any of the locators found in Selenium IDE
        //tagName = driver.findElement(By.className("inputtext")).getTagName();
        //System.out.println(tagName);
        driver.quit();
        System.exit(0);


    }
}
