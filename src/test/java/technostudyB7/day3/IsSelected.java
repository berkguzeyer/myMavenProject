package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        //<input type="checkbox" id="isAgeSelected" value="">
        WebElement checkbox = driver.findElement(By.id("isAgeSelected"));
        checkbox.click();

        if (checkbox.isSelected()){
            System.out.println("Verification is done: PASS");
        }else {
            System.out.println("Verification has been failed!");
        }

        driver.quit();
    }
}
