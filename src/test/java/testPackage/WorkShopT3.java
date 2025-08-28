package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkShopT3 {
WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void OpenBrowser(){

        driver.get("https://duckduckgo.com/");}

    @Test
    public void WorkShopT3()
    {
       WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"searchbox_input\"]"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();
        Assert.assertEquals("https://duckduckgo.com/?t=h_&q=Selenium+WebDriver&ia=web","https://www.selenium.dev/documentation/webdriver/");

    }
    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
}
