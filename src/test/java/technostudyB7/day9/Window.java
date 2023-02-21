package technostudyB7.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.Set;

public class Window extends UtilityClass {
    public static void main(String[] args) {

        /*
        * Go to "https://www.selenium.dev/"
        * Click on Register Now
        * Print the title of the new page
        * */

        driver.get("https://www.selenium.dev/");

        String mainPageId = driver.getWindowHandle(); // We are getting the ID of the Main Page

        WebElement registerNowButton = driver.findElement(By.cssSelector("a[href='https://seleniumconf.com/']"));
        registerNowButton.click();

        Set<String> allIds = driver.getWindowHandles();

        for (String id: allIds){
            if (!id.equals(mainPageId)){
                driver.switchTo().window(id);
            }
        }

        System.out.println(driver.getTitle());


    }
}
