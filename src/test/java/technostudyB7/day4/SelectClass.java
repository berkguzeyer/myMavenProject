package technostudyB7.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        //<select class="form-control" id="select-demo">
        WebElement dropdownMenu = driver.findElement(By.id("select-demo"));

        Select dropDown = new Select(dropdownMenu);

        dropDown.selectByIndex(2);
        Thread.sleep(3000);
        dropDown.selectByValue("Tuesday");
        Thread.sleep(3000);
        dropDown.selectByVisibleText("Friday");


    }
}
