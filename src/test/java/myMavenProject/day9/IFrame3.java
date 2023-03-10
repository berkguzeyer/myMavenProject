package myMavenProject.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import myMavenProject.Utilities.UtilityClass;

public class IFrame3 extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        WebElement iFrame1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iFrame1);

        WebElement topicInput = driver.findElement(By.tagName("input"));
        topicInput.sendKeys("John Snow");

        WebElement iFrame3 = driver.findElement(By.id("frame3"));
        driver.switchTo().frame(iFrame3);

        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

        driver.switchTo().defaultContent();

        WebElement header = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
        System.out.println(header.getText());

        driver.switchTo().frame(1);

        WebElement animalDropdown = driver.findElement(By.id("animals"));
        Select animalDropdownMenu = new Select(animalDropdown);
        animalDropdownMenu.selectByIndex(2);

    }
}
