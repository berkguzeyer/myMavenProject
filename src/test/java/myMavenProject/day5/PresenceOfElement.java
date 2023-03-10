package myMavenProject.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PresenceOfElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/");

        WebDriverWait wait = new WebDriverWait(driver, 10);


        //<a href="/testng-tutorials" title="">TestNG</a>
        WebElement button = driver.findElement(By.linkText("TestNG"));
        button.click();

        //<h1>TestNG Tutorials</h1>
        WebElement testNGText = driver.findElement(By.cssSelector(".section-title>h1"));
        wait.until(ExpectedConditions.presenceOfElementLocated((By) testNGText));
    }
}
