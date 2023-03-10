package myMavenProject.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import myMavenProject.Utilities.UtilityClass;

public class IFrame extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");


        // The first way:
        // driver.switchTo().frame("frame1");

        // The second way:
        WebElement iFrame = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iFrame);

        // The third way: also the best way***********
        //driver.switchTo().frame(0);

        WebElement topicInput = driver.findElement(By.tagName("input"));
        topicInput.sendKeys("John Snow");

        driver.switchTo().defaultContent(); // This will take you to the main page's html
        // driver.switchTo().parentFrame(); // This will take us one step back on the hierarchy

        //<span>Not a Friendly Topic</span>
        WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());


    }
}
