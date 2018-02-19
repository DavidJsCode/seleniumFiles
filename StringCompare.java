//How to compare string content

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StringCompare {

    public static void main (String[] args) {

        WebDriver driver = new FirefoxDriver();

        String baseURL = "http://www.phptravels.net/en";
        String expectedTitle = "PHPTRAVELS | Travel Technology Partner";
        String actualTitle;

        driver.get(baseURL);

        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed " + actualTitle);
        }
        else System.out.println("Test failed, actual title is " + actualTitle);

        driver.close();




    }
}
