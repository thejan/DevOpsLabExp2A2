package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {
    private static WebDriver driver;
    @BeforeTest
    public void openBrowser() throws InterruptedException {
// Set the path of ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
// Open the web page (GitHub Pages URL or local file URL)
//driver.get("https://thejan.github.io/DevOpsLabExperiments/");
// OR if using local file
//
driver.get("file:///C:/Users/thejan/Desktop/Adv%20Java/DevOps_Lab/DevOpsExp2/src/main/resources/index.html");
    }
    @Test
    public void titleValidationTest() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "My Simple Website";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
