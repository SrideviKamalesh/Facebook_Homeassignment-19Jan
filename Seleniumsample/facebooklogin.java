package Seleniumsample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklogin {

	public static void main(String[] args) {
		
     ChromeDriver driver=new ChromeDriver();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
     
     driver.get("https://en-gb.facebook.com/");
     
     driver.manage().window().maximize();
     
     driver.findElement(By.linkText("Create new account")).click();
     
     driver.findElement(By.name("firstname")).sendKeys("Sridevi");
     
     driver.findElement(By.name("lastname")).sendKeys("Kamalesh");
     
     driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8122104655");
     
     driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Kamalsri@9921");
     
     WebElement dropdown=driver.findElement(By.xpath("//select[@id='day']"));
     
     Select obj=new Select(dropdown);
     
     obj.selectByValue("7");
     
     WebElement dropdown1=driver.findElement(By.xpath("//select[@id='month']"));
     
     Select obj1=new Select(dropdown1);
     
     obj1.selectByVisibleText("Jul");
     
     WebElement dropdown2=driver.findElement(By.xpath("//select[@id='year']"));
     
     Select obj2=new Select(dropdown2);
     
     obj2.selectByValue("1996");
     
     driver.findElement(By.xpath("//label[text()='Female']")).click();
     
     String title=driver.getTitle();
	    
	    System.out.println("Title name :"+title);
	    
	    String currentUrl=driver.getCurrentUrl();
	    
	    System.out.println("Using url :" +currentUrl);
	    
	    if (title.contains("log in or sign up")) {
	    	System.out.println("its successful");
			
		} else {
			System.out.println("its not successful");

		}
     
     
    	
     

	}

	private static Select Select(WebElement dropdown) {
		// TODO Auto-generated method stub
		return null;
	}

}
