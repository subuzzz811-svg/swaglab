package Junit002;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitJunitSwaglabs {
    WebDriver driver;
    WebDriverWait wait;
    
    @Before
    public void start() {
    	
    	System.setProperty("webdriver.edge.driver", "D:\\EdgeDriver\\msedgedriver.exe");
    	driver=new EdgeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    	driver.manage().window().maximize();
    	
    
    }
    @Test
    public void log() {
    	WebElement usr=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
    	usr.sendKeys("standard_user");
    	WebElement psd=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
    	psd.sendKeys("secret_sauce");
    	WebElement log=wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
    	log.click();
    	String expectedUrl="https://www.saucedemo.com/inventory.html";
    	String actualUrl=driver.getCurrentUrl();
        assertEquals("User should be enter to inventory page after login", expectedUrl, actualUrl);
        WebElement add=wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-sauce-labs-backpack")));
    	add.click();
    	WebElement goCaart =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")));
     	goCaart.click();
     	WebElement check =wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout")));
     	check.click();
     	WebElement fname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
    	fname.sendKeys("Abraham");
    	WebElement lname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last-name")));
    	lname.sendKeys("John");
    	WebElement zip=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postal-code")));
    	zip.sendKeys("697803");
    	WebElement cont =wait.until(ExpectedConditions.elementToBeClickable(By.id("continue")));
    	cont.click();
    	WebElement finish=wait.until(ExpectedConditions.elementToBeClickable(By.id("finish")));
    	finish.click();
    	WebElement bckHome=wait.until(ExpectedConditions.elementToBeClickable(By.id("back-to-products")));
    	bckHome.click();
    	
    }
    @After
    public void out() {
    	if(driver !=null) {
 		driver.quit();
   }
    }}

