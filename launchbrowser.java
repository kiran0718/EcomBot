package lambda;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.support.ui.Select;

public class launchbrowser {
    public static void main(String[] args) {
        // Set the path to ChromeDriver (Make sure the path is correct)
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Amazon website
        driver.get("https://www.amazon.com/");

        // Maximize browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();

        // Enter item in the search box
        WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
        searchItem.sendKeys("Samsung S23 Ultra");

        // Click on search button
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Wait and Click on the first product link dynamically
        driver.findElement(By.linkText("Galaxy S25 Ultra Cell Phone, 256GB AI Smartphone, Unlocked Android, AI Camera, Fast Processor, Long Battery Life, 2025, US 1 Yr Manufacturer Warranty, Titanium Gray")).click();
        
        
//        Quantity 
       Select sc = new Select(driver.findElement(By.name("quantity")));
       sc.selectByIndex(2);
        
//        click add to cart
        driver.findElement(By.id("add-to-cart-button")).click();
        // Close browser
        driver.quit();
    }
}
