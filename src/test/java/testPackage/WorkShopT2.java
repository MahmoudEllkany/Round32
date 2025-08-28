package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkShopT2 {
    WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void OpenBrowser(){

        driver.get("https://duckduckgo.com/");


    }

    @Test
            public void workShopT2(){
        WebElement Logo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/article/div[1]/div[1]/div[2]/div/header/div/section[1]/a/img"));
        Assert.assertTrue(Logo.isDisplayed(),"is displayed");


    }

    @AfterTest
    public void CloseBrowser(){
        driver.quit();

    }


}
