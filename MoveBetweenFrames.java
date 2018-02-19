import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveBetweenFrames {

    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseURL = "https://docs.oracle.com/javase/7/docs/api/index.html?java/lang/System.html";
        String tagName;

        driver.get(baseURL);
        driver.switchTo().frame("classFrame");
        //"locator" part of the code is same as any of the locators found in Selenium IDE
        driver.findElement(By.linkText("Deprecated")).click();


        //driver.quit();
        //System.exit(0);

    }}