package technostudyB7.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        //<input autofocus="" type="text" class="form-control" placeholder="Please enter your Message" id="user-message">

        WebElement messageBox = driver.findElement(By.id("user-message"));
        messageBox.sendKeys("Hello Selenium");

        //<button type="button" onclick="showInput();" class="btn btn-default">Show Message</button>

        WebElement showButton = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        showButton.click();

        // <span id="display">Hello Selenium</span>
        WebElement result = driver.findElement(By.id("display"));

        System.out.println(result.getText());

        String expResult = "Hello Selenium";
        String actualResult = result.getText();

        if (expResult.equals(actualResult)){
            System.out.println("Verification is done: PASS!");
        }else {
            System.out.println("Verification has been failed!");
            System.out.println("Actual result is: " + actualResult);
        }
        }

    }
