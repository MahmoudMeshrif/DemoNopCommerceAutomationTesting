package org.example.Pages;

import org.example.StepsDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ShoppingCart {
    public void ClickOnShoppingCartbutton(){
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();
    }
    public void SuccessMessageForShoppingCart(){
       String Success_message= Hooks.driver.findElement(By.className("content")).getText();
        SoftAssert Soft = new SoftAssert();
        System.out.println(Success_message);
        Soft.assertEquals(Success_message,"The product has been added to your shopping cart");
        Soft.assertAll();
    }
    public void BackgroundColorForShoppingCart(){
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       String BackgroundColor= Hooks.driver.findElement(By.xpath("//*[@class='bar-notification success']")).getCssValue("background-color");
       System.out.println(BackgroundColor);
       String color = Color.fromString(BackgroundColor).asHex();
       System.out.println(color);
       SoftAssert soft = new SoftAssert();
       soft.assertEquals(color,"#4bb07a");
       soft.assertAll();


    }
    public void ClickOnShoppingCartTab(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class='bar-notification success']")));
        Hooks.driver.findElement(By.id("topcartlink")).click();
    }
    public void CheckQuantityValue() {
        String quantity = Hooks.driver.findElement(By.className("qty-input")).getAttribute("value");
        System.out.println(quantity);
        int Quantity_Value= Integer.parseInt(quantity);
        System.out.println(Quantity_Value);
        SoftAssert Soft = new SoftAssert();
        Soft.assertTrue(Quantity_Value>0);
        Soft.assertAll();

    }
    public void MessageAppearsIsEmptyForShoppingCart(){
        String MessageIsEmpty= Hooks.driver.findElement(By.className("no-data")).getText();
        System.out.println(MessageIsEmpty);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(MessageIsEmpty,"Your Shopping Cart is empty!");
        soft.assertAll();
    }
}
