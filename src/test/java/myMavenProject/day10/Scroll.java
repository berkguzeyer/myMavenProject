package myMavenProject.day10;

import org.openqa.selenium.JavascriptExecutor;
import myMavenProject.Utilities.UtilityClass;

public class Scroll extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://www.youtube.com/");

        Wait(3);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // scrollBy(int x, int y) -> positive value means scroll down/up & left/right by a specified pixel | x means horizontal, y means vertical
        // negative value means scroll up & left
        // scrollTo(0, "document.body.scrollHeight") // scroll to the end of the page
        //"arguments[0].scrollIntoView(true)" -> Scroll to the specified element

        js.executeScript("window.scrollBy(0, 5000)"); //we scrolled down by 5000 pixels
        Wait(3);
        js.executeScript("window.scrollBy(0,-1000");//we scrolled up by 1000 pixels


        quitDriver(2);



    }
}
