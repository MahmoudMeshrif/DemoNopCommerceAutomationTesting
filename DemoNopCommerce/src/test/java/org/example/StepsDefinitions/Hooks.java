package org.example.StepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class Hooks {
   public static WebDriver driver;
   @Before
    public static void openBrowser(){
       //WebDriverManager.chromedriver().setup();
     ChromeOptions options = new ChromeOptions();
     options.addArguments("--remote-allow-origins=*");
      driver = new ChromeDriver(options);
      // driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       driver.navigate().to("https://demo.nopcommerce.com/");
   }

   @After
    public  static void closeBrowser() throws InterruptedException {
       Thread.sleep(3000);
       driver.quit();
   }
}
