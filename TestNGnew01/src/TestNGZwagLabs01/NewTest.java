package TestNGZwagLabs01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test(priority=1)
  public void f() throws InterruptedException {
	  
	    WebElement user=driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement log=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input"));
		log.click();
		Thread.sleep(2000);
	 
  }
  @Test(priority=2)
  public void cart() throws InterruptedException {
	    WebElement add =driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		add.click();
		Thread.sleep(2000);
		WebElement gocart=driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
		gocart.click();
		Thread.sleep(2000);
		WebElement check=driver.findElement(By.id("checkout"));
		check.click();
		Thread.sleep(2000);
	  
	  
  }
  @Test(priority=3)
  public void checkOut() throws InterruptedException {
	  WebElement fname=driver.findElement(By.id("first-name"));
		fname.sendKeys("Subuhana");
		Thread.sleep(2000);
		WebElement lname=driver.findElement(By.id("last-name"));
		lname.sendKeys("Saifudeen");
		Thread.sleep(2000);
		WebElement zip =driver.findElement(By.id("postal-code"));
		zip.sendKeys("695603");
		Thread.sleep(2000);
		WebElement cont=driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input"));
		cont.click();
		Thread.sleep(2000);
		WebElement finish=driver.findElement(By.id("finish"));
		finish.click();
		Thread.sleep(2000);
		WebElement backhome=driver.findElement(By.id("back-to-products"));
		backhome.click();
	  
		
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver", "D:\\EdgeDriver\\msedgedriver.exe");
      driver=new EdgeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }

  @AfterTest
  public void afterTest() {
      if(driver!=null) {
		 driver.quit();
	  }
  }

}
