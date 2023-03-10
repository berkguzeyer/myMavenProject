package myMavenProject.day11;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import myMavenProject.Utilities.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenShot extends UtilityClass {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebDriverWait wait = new WebDriverWait(driver, 2);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));

        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys("Admin");


        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("asdasdasd");


        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")));
        WebElement errorMessage = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));

        if (errorMessage.isDisplayed()) {
            LocalDateTime localDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM_dd_yyyy_hh_mm_ss_SSS");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver; // got the screenshot
            File screenShotInTheMemory = takesScreenshot.getScreenshotAs(OutputType.FILE); // created a file for the screenshot
            FileUtils.copyFile(screenShotInTheMemory, new File("src/test/java/technostudyB7/screenshots/" + localDateTime.format(formatter) + "screenshot.png"));
        }

        driver.quit();
    }
}

