package myMavenProject.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import myMavenProject.Utilities.UtilityClass;

public class Scroll3 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");
        WebElement element = driver.findElement(By.xpath("//div[text()='Hire faster']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;



        Wait(3);
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println(element.getText());
        quitDriver(2);




    }
}
