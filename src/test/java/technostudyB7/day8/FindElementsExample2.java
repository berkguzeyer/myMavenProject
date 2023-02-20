package technostudyB7.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import technostudyB7.Utilities.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**1- Go to https://www.saucedemo.com/
 2- login with valid credentials
 3- Add 3 random products to the cart
 4- Click on the cart
 5- Click on the CheckOut button
 6- Fill the form and click on Continue
 7- Check if you see your products*/

public class FindElementsExample2 extends UtilityClass {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));
        loginButton.click();

        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<String> inventoryItemNames = new ArrayList<>();
        List<Integer> indexList = new ArrayList<>();


        while(productList.size()<3) {
            int randomNumber = (int) (Math.random() * productList.size());
            if (indexList.contains(randomNumber)){
                continue;
            }
            indexList.add(randomNumber);
            inventoryItemNames.add(productList.get(randomNumber).getText());
            productList.get(randomNumber).click();
            WebElement addToCartButton = driver.findElement(By.xpath("//button[text()='Add to cart']"));
            addToCartButton.click();
            driver.navigate().back();
        }

        WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        cart.click();


    }
}
