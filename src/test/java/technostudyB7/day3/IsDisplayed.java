package technostudyB7.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.TreeSet;

public class IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");


        //<button>Start</button>
        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));


        //<h4>Hello World!</h4>
        WebElement text = driver.findElement(By.cssSelector("#finish>h4"));

        startButton.click();
        Thread.sleep(7000);

        if (text.isDisplayed()){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL!");
        }


    }
}
