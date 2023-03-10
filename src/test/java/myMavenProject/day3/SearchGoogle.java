package myMavenProject.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        //<input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwi81IDVn4f9AhX_RzABHSKPD1MQ39UDCAc">
        String input = "bamboo pen";
        WebElement searchBar = driver.findElement(By.cssSelector("input[class='gLFyf']"));
        searchBar.sendKeys(input+ Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = "bamboo pen - Google Search";


        if (actualTitle.equals(expectedTitle)){
            System.out.println("Verification is done: PASS");
        }else {
            System.out.println("Verification has been failed");
            System.out.println("Actual title is: "+actualTitle);
        }







    }
}
