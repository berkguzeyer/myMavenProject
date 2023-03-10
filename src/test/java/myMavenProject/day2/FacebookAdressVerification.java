package myMavenProject.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAdressVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String email = "berkguzeyer@hotmail.com";
        String password = "12345";

        driver.get("https://www.facebook.com");

        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys(email);

        WebElement passwordBox = driver.findElement(By.cssSelector("input[type='password']"));
        passwordBox.sendKeys(password);

        //< class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_5_Oj">Log In</button>
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        driver.quit();



    }
}
