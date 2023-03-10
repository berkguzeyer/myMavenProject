package myMavenProject.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        //<button autocomplete="off" type="button" onclick="swapInput()">Enable</button>
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));
        WebElement inputField = driver.findElement(By.cssSelector("#input-example>input"));


        boolean isInputFieldEnable = inputField.isEnabled();
        System.out.println("Before clicking on enable button: " + isInputFieldEnable);

        enableButton.click();

        boolean isInputFieldEnable2 = inputField.isEnabled();
        System.out.println("After clicking on enable button: " + isInputFieldEnable2);


    }
}
