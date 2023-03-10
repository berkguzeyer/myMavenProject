package myMavenProject.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import myMavenProject.Utilities.UtilityClass;

public class HoverOverAction extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com");
        WebDriverWait wait = new WebDriverWait(driver, 3);


        WebElement jewelry = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement earrings = driver.findElement(By.id("side-nav-category-link-10896"));
        WebElement clipOnEarrings = driver.findElement(By.id("catnav-l3-10904"));

        Actions actions = new Actions(driver);
        Action hoverOverJewelry = actions.moveToElement(jewelry).build();
        hoverOverJewelry.perform();

        wait.until(ExpectedConditions.visibilityOf(earrings));

        Action hoverOverEarring = actions.moveToElement(earrings).build();
        hoverOverEarring.perform();

        wait.until(ExpectedConditions.visibilityOf(clipOnEarrings));

        clipOnEarrings.click();

        String currentUrl = driver.getCurrentUrl();

        System.out.println(currentUrl);

        quitDriver(4);

    }
}
