package myMavenProject.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MentoringProject {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/insurance/v1/index.php");

        //<a href="register.php" class="btn btn-default">Register</a>
        WebElement registerButton = driver.findElement(By.linkText("Register"));
        registerButton.click();

        WebElement titleDropdown = driver.findElement(By.id("user_title"));
        Select titleDropdownMenu = new Select(titleDropdown);
        titleDropdownMenu.selectByVisibleText("Captain");

        WebElement firstName = driver.findElement(By.id("user_firstname"));
        firstName.sendKeys("John");

        WebElement surname = driver.findElement(By.id("user_surname"));
        surname.sendKeys("Doe");

        WebElement phone = driver.findElement(By.id("user_phone"));
        phone.sendKeys("123456789");

        WebElement year = driver.findElement(By.id("user_dateofbirth_1i"));
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText("1994");

        WebElement month = driver.findElement(By.id("user_dateofbirth_2i"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("July");

        WebElement day = driver.findElement(By.id("user_dateofbirth_3i"));
        Select selectDay = new Select(day);
        selectDay.selectByVisibleText("15");



    }
}
