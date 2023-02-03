package basicTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLoginTest {
	
	@Test
	public void verifyLogin() throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\003B5A744\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	      
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			Thread.sleep(3000);

	        //Identification
	        //Locator
//	      id
//	      name
//	      className
//	      tagname
	//
//	      linkText
//	      partialLinkText
	//
	//
//	      xpath
//	      css selector
	        
	        
	        
	        //Name -userName
	        WebElement txt_UserName = driver.findElement(By.name("username"));          // 
	        txt_UserName.sendKeys("Admin");
	        
	        //Password - name
	        driver.findElement(By.name("password")).sendKeys("admin123");
	        
	        
	        //click on Login Button
	        //Tagname - login 
	        
	        driver.findElement(By.tagName("button")).click();
	        
	        Thread.sleep(5000);
	        //validation step
	        
	        
	        
	        //Classname - oxd-userdropdown-name
	        driver.findElement(By.className("oxd-userdropdown-name")).click();
	        
	        Thread.sleep(5000);
	        
	        //LinkText - Logout
	        driver.findElement(By.linkText("Logout")).click();
	        
	        
	        //partialLinkText - Logout
	        //driver.findElement(By.partialLinkText("Logo")).click();
	        
	        
	        Thread.sleep(5000);
	        
	        
	        //Validation step
	        
	        driver.close();
			
		
		
	}
	

}
