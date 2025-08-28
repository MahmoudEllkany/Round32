package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkShopT1 {

    @Test
    public void test1(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "Google", "Page title does not match!");
        driver.quit();
    }
}
