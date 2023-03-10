package myMavenProject.day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import myMavenProject.Utilities.UtilityClass;

public class CaptchaExample extends UtilityClass {

    /** Navigate to https://www.phptravels.net
     * Click on Account button
     * Click on Customer Sign Up
     * Fill the form
     * Check the "I am not robot" check box
     * Click on Sign Up button
     * Check if the title is "Login - PHPTRAVELS"
     * Enter same login information that you used during registration and click login
     * Verify the welcome message contains the first name that you used during registration then close the browser
     *
     * Note: You can use any locator you want.
     * */
    public static void main(String[] args) {
        driver.get("https://www.phptravels.net");

        //<button class="btn btn-primary dropdown-toggle waves-effect" type="button" id="ACCOUNT" data-bs-toggle="dropdown" aria-expanded="false">
        //                                    <svg class="pe-1" xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="#ffffff" stroke-width="1.5" stroke-linecap="round" stroke-linejoin="round"><path d="M20 21v-2a4 4 0 0 0-4-4H8a4 4 0 0 0-4 4v2"></path><circle cx="12" cy="7" r="4"></circle></svg>
        //                                    Account                                    <i class="la la-angle-down"></i>
        //                                    </button>
        WebElement accountButton = driver.findElement(By.id("ACCOUNT"));
        accountButton.click();

        WebElement customerSignUpButton = driver.findElement(By.xpath("//a[text()='Customer Signup']"));
        customerSignUpButton.click();

        WebElement fName = driver.findElement(By.xpath("//input[@name='first_name']"));
        fName.sendKeys("John");

        WebElement lName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lName.sendKeys("Doe");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("6142859409");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("asdasdasdasd@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("12345");

//        WebElement iAmNotARobotCheckBox = driver.findElement(By.id("recaptcha-anchor"));
//        iAmNotARobotCheckBox.click();

        WebElement gotItButton = driver.findElement(By.id("cookie_stop"));
        gotItButton.click();

        WebElement signUpButton = driver.findElement(By.id("button"));

        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();









    }
}
