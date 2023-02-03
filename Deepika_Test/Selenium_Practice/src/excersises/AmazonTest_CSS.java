package excersises;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.ConfigRead;

public class AmazonTest_CSS {
	
	@Test
	public void verifysearch() throws Exception {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003B5A744\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
		
		
		//System.setProperty("webdriver.edge.driver","C:\\Users\\003B5A744\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		

		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
        
        ConfigRead conf = new ConfigRead();
        
        String browser = conf.getBrowser();
        
        System.out.println("execution on browser: " + browser);
        
        if(browser.equalsIgnoreCase("chrome")){
            
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            
        }
        else if(browser.equalsIgnoreCase("edge")) {
            
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        
        else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            
        }
		
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String searchItem = "iphone 14";
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[class='nav-input nav-progressive-attribute']")).sendKeys(searchItem);

		driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		
		 Thread.sleep(4000);
	        //validation step
	        
	        String appTitle = driver.getTitle();
	        System.out.println("Application Title: " + appTitle);
	        Assert.assertEquals("Amazon.in : iphone 14", appTitle);
	        Assert.assertEquals("Amazon.in : "+searchItem, appTitle);
	        Assert.assertTrue(appTitle.contains(searchItem));
	        
	        Thread.sleep(4000);
	        driver.close();
	       
		
		
	}
	
	

}
