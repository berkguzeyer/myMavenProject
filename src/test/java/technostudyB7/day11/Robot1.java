package technostudyB7.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technostudyB7.Utilities.UtilityClass;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Robot1 extends UtilityClass {
    public static void main(String[] args) throws AWTException {
        driver.get("http://demo.guru99.com/test/upload/");
        Wait(3);

        Robot robot = new Robot();


        for (int i = 0; i < 21; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        StringSelection stringSelection = new StringSelection("\"C:\\Users\\berkg\\OneDrive\\Desktop\\kill chrome driver.txt\"");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection,stringSelection);

        Wait(2);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        Wait(2);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement termsButton = driver.findElement(By.id("terms"));
        termsButton.click();

        WebElement submitButton = driver.findElement(By.id("submitbutton"));
        submitButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement successMessage = driver.findElement(By.id("res"));


        wait.until(ExpectedConditions.visibilityOf(successMessage));

        if (successMessage.getText().contains("successfully")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }






    }


}
