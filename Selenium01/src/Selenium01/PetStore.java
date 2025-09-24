package Selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class PetStore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\EdgeDriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement sign=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]"));
		sign.click();
		Thread.sleep(2000);
		//Register
		WebElement Reg=driver.findElement(By.xpath("/html/body/div[2]/div/a"));
		Reg.click();
		Thread.sleep(2000);
		WebElement userId =driver.findElement(By.name("username"));
		userId.sendKeys("Subu@Edp");
		Thread.sleep(2000);
		WebElement psd =driver.findElement(By.name("password"));
		psd.sendKeys("subuhana123@edp");
		Thread.sleep(2000);
		WebElement repPsd =driver.findElement(By.name("repeatedPassword"));
		repPsd.sendKeys("subuhana123@edp");
		Thread.sleep(2000);
		WebElement fname =driver.findElement(By.name("account.firstName"));
		fname.sendKeys("Subuhana");
		Thread.sleep(2000);
		WebElement lname =driver.findElement(By.name("account.lastName"));
		lname.sendKeys("Saifudeen");
		Thread.sleep(2000);
		WebElement email =driver.findElement(By.name("account.email"));
		email.sendKeys("subuzzz2023@gmail.com");
		Thread.sleep(2000);
		WebElement phn =driver.findElement(By.name("account.phone"));
		phn.sendKeys("9876543218");
		Thread.sleep(2000);
		WebElement address1 =driver.findElement(By.name("account.address1"));
		address1.sendKeys("S.S Vihar Palavacode");
		Thread.sleep(2000);
		WebElement add2 =driver.findElement(By.name("account.address2"));
		add2.sendKeys("S.S Vihar Palavacode");
		Thread.sleep(2000);
		WebElement city =driver.findElement(By.name("account.city"));
		city.sendKeys("Trivandrum");
		Thread.sleep(2000);
		WebElement state =driver.findElement(By.xpath("/html/body/div[2]/div/form/table[2]/tbody/tr[8]/td[2]/input"));
		state.sendKeys("Kerala");
		Thread.sleep(2000);
		WebElement zip =driver.findElement(By.name("account.zip"));
		zip.sendKeys("695603");
		Thread.sleep(2000);
		WebElement country=driver.findElement(By.name("account.country"));
		country.sendKeys("India");
		Thread.sleep(2000);
		//dropdown
		WebElement lang=driver.findElement(By.name("account.languagePreference"));
		Select language= new Select(lang) ;
		language.selectByVisibleText("english");
		Thread.sleep(2000);
		WebElement categ=driver.findElement(By.name("account.favouriteCategoryId"));
		Select category=new Select(categ);
		category.selectByIndex(2);
		Thread.sleep(2000);
		WebElement enablelist =driver.findElement(By.name("account.listOption"));
		enablelist.click();
		Thread.sleep(2000);
		WebElement enableBanner =driver.findElement(By.name("account.bannerOption"));
		enableBanner.click();
		Thread.sleep(2000);
		WebElement save =driver.findElement(By.name("newAccount"));
		save.click();
		Thread.sleep(2000);
		
		
		
		
		
		

	}

}
