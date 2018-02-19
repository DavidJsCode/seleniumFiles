import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchPopups {

    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/David/Coding/selenium/selenium-java-3/lib/chromedriver");

        String baseURL = "http://output.jsbin.com/usidix/1";
        String alertMessage;

        WebDriver driver = new ChromeDriver();
        driver.get(baseURL);

        //escape characters to mitigate quotes to distinguish value
        driver.findElement(By.cssSelector("input[value = \"Go!\"]")).click(); //("input[value=\"Go!\"]")
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();

        System.out.println(alertMessage);

    }
}