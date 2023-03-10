package myMavenProject.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import myMavenProject.Utilities.UtilityClass;

public class getCssValue extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");

        WebElement searchInput = driver.findElement(By.id("inputValEnter"));

        System.out.println("getAttribute(autocomplete) -> " + searchInput.getAttribute("autocomplete"));
        System.out.println("getAttribute(name) -> " + searchInput.getAttribute("name"));
        System.out.println("getAttribute(id) -> " + searchInput.getAttribute("id"));

        System.out.println(searchInput.getCssValue("background"));
        System.out.println(searchInput.getCssValue("color"));



        driver.quit();


    }
}
