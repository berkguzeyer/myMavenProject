package myMavenProject.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask_2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");


        //<input type="text" class="form-control" placeholder="Enter value" id="sum1">
        WebElement firstValue = driver.findElement(By.id("sum1"));
        firstValue.sendKeys(Integer.toString(2));

        //<input type="text" class="form-control" placeholder="Enter value" id="sum2">
        WebElement secondValue = driver.findElement(By.id("sum2"));
        secondValue.sendKeys(Integer.toString(4));

        //<button type="button" onclick="return total()" class="btn btn-default">Get Total</button>
        WebElement getTotalButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        getTotalButton.click();

        WebElement result = driver.findElement(By.id("displayvalue"));
        String actResult = result.getText();

        int input1 = 2; int input2 = 4; int sumOfInputs = input1+input2;
        String expectedResult = Integer.toString(sumOfInputs);


        if (expectedResult.equals(actResult)) {
            System.out.println("Verification is done : Pass");
        } else {
            System.out.println("Verification is done : FAIL");
        }

    }
}
