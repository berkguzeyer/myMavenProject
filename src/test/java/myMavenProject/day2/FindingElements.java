package myMavenProject.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        // setting up the browser driver (Selenium will knock the door of browser driver)
        WebDriverManager.chromedriver().setup();

        // to open the browser, we create the object
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techno.study"); // get method will wait to download the whole page

        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com"); // navigate().to won't wait to download the whole page

        driver.navigate().back(); // do BACK on the current page
        driver.navigate().forward(); // do FORWARD on the current page

        // finding the WebElement on FB page (Connect with friends and the world around you on Facebook.)
        WebElement sloganText = driver.findElement(By.className("_8eso"));

        String expectedText = "Connect with friends and the world around you on Facebook.";
        String actSloganText = sloganText.getText();

        if (expectedText.equals(actSloganText)){
            System.out.println("Verification is done : PASS");
            System.out.println("Expected text was: \"" + expectedText + "\"");
        }else{
            System.out.println("Verification has been failed");
            System.out.println("Actual slogan text is :" + actSloganText);
        }


    }
}
