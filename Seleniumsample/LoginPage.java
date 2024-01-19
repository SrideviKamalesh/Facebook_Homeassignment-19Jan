package Seleniumsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	
	driver.get("http://leaftaps.com/opentaps/.");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	
	driver.findElement(By.linkText("Accounts")).click();
	
	driver.findElement(By.linkText("Create Account")).click();
	
	driver.findElement(By.id("accountName")).sendKeys("Kamalesh");
	
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	
	WebElement dropdown=driver.findElement(By.name("industryEnumId"));
	
	Select obj=new Select(dropdown);
	
	obj.selectByIndex(3);
	
	WebElement dropdown1=driver.findElement(By.name("ownershipEnumId"));
	
	Select obj1=new Select(dropdown1);
	
	obj1.selectByVisibleText("S-Corporation");
	
	WebElement dropdown2=driver.findElement(By.id("dataSourceId"));
	
	Select obj2=new Select(dropdown2);
	
	obj2.selectByValue("LEAD_EMPLOYEE");
	
	WebElement dropdown3=driver.findElement(By.id("marketingCampaignId"));
	
	Select obj3=new Select(dropdown3);
	
	obj3.selectByIndex(6);
	
	WebElement dropdown4=driver.findElement(By.id("generalStateProvinceGeoId"));
	
	Select obj4=new Select(dropdown4);
	
	obj4.selectByValue("TX");
	
	driver.findElement(By.className("smallSubmit")).click();
	
    driver.close();
	
}
	    
	}
			
		
	


	
	
	
