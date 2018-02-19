//Explicit waits are preferred over implicit
//It is not a pause, just a variable in seconds that acts as a timeout
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaits {
    public static void main (String[]args){

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebDriverWait waitVar = new WebDriverWait(driver, 10);

        String testURL = "http://newtours.demoaut.com";


        driver.get(testURL);

        waitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
        driver.findElement(By.name("userName")).sendKeys("tutorial");


    }
}
