package myMavenProject.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import myMavenProject.Utilities.UtilityClass;

public class ActionsClick extends UtilityClass {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons/");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        Action action = actions.doubleClick(doubleClickButton).build();
        action.perform();

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        Action rightClickAction = actions.contextClick(rightClickButton).build();
        rightClickAction.perform();

        //<button id="MCxMx" type="button" class="btn btn-primary">Click Me</button>
        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Action clickAction = actions.click(clickMeButton).build();
        clickAction.perform();

        //`MOVETO` ELEMENT  -  doubleClick
        Action doubleclickAction2 = actions.moveToElement(doubleClickButton).doubleClick().build();
        doubleclickAction2.perform();

        //MOVETO rightClick
        Action rightClickAction2 = actions.moveToElement(rightClickButton).contextClick().build();
        rightClickAction2.perform();



    }
}
