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

public class ZwagLabsJunit01 {
	WebDriver driver;
    @Before
    public void enter() {
    	System.setProperty("webdriver.edge.driver", "D:\\EdgeDriver\\msedgedriver.exe");
    	driver=new EdgeDriver();
    	driver.get("https://www.saucedemo.com/");
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implict wait
    	driver.manage().window().maximize();
    	
    }
    @Test
    public void login() {
    	WebElement usr=driver.findElement(By.id("user-name"));
    	usr.sendKeys("standard_user");
    	WebElement pass=driver.findElement(By.id("password"));
    	pass.sendKeys("secret_sauce");
    	WebElement login=driver.findElement(By.id("login-button"));
    	login.click();
    	
    	String expectedUrl="https://www.saucedemo.com/inventory.html";
    	String actualUrl=driver.getCurrentUrl();
        assertEquals("User should be enter to inventory page after login", expectedUrl, actualUrl);
        WebElement add =driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		add.click();
		WebElement gocart=driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
		gocart.click();
		WebElement check=driver.findElement(By.id("checkout"));
		check.click();
		WebElement fname=driver.findElement(By.id("first-name"));
		fname.sendKeys("Amala");
		WebElement lname=driver.findElement(By.id("last-name"));
		lname.sendKeys("Devan");
		WebElement Zip=driver.findElement(By.id("postal-code"));
		Zip.sendKeys("695408");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement finish=driver.findElement(By.id("finish"));
		finish.click();
		WebElement btohome=driver.findElement(By.id("back-to-products"));
		btohome.click();
    }
    @After 
    public void out() {
    	if (driver != null) {
   		driver.quit();
    	
    }

}
} 