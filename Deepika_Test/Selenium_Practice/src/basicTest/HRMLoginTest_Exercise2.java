package basicTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import utility.ConfigRead;

public class HRMLoginTest_Exercise2 {
	
	
	WebDriver driver;
	
	@Test
	public void verifyLogin() throws Exception {
		
		ConfigRead conf = new ConfigRead();
		String br = conf.getBrowser();
		System.out.println("Execution on browsers:" +br);
		
		if(br.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\003B5A744\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(br.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\003B5A744\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		else {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\003B5A744\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();	
		}
		
		driver.manage().window().maximize();
		driver.get(conf.getAppURL());
		
		Thread.sleep(3000);
		    
		 // Name -userName
        WebElement txt_UserName = driver.findElement(By.name("username"));
        txt_UserName.sendKeys("Admin");
        
        // Password - name
        driver.findElement(By.name("password")).sendKeys("admin123");

        // click on Login Button
        // Tagname - login
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(5000);
        // validation step

        String actualURL = driver.getCurrentUrl();
        String actualTitle = driver.getTitle();

        // validate application URL
        Assert.assertEquals("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList", actualURL);

        WebElement lblPIM = driver.findElement(By.tagName("h6"));

        // present on page
        // Validate PIM present on page
        boolean isPIMPresentOnPage = lblPIM.isDisplayed();
        System.out.println("is PIM displayed on page: " + isPIMPresentOnPage);

        Assert.assertTrue(isPIMPresentOnPage); /// pass step

        // validate text of specific element
        lblPIM.getText();
        Assert.assertEquals("PIM", lblPIM.getText());

        // Classname - oxd-userdropdown-name
        driver.findElement(By.className("oxd-userdropdown-name")).click();

        Thread.sleep(5000);
        
        
        
        // validate Add Employee
        WebElement lblAdEmp = driver.findElement(By.className("oxd-topbar-body-nav-tab-item"));

        // present on page
        // Validate Add Employee present on page
        boolean isAdEmpPresentOnPage = lblAdEmp.isDisplayed();
        System.out.println("is Add Employee displayed on page: " + isAdEmpPresentOnPage);

        Assert.assertTrue(isAdEmpPresentOnPage); /// pass step

        // validate text of specific element
        lblAdEmp.getText();
        Assert.assertEquals("Add Employee", lblAdEmp.getText());
        
        driver.findElement(By.className("oxd-topbar-body-nav-tab-item")).click();
        
        Thread.sleep(5000);
        
        
        
        
        
        

        // LinkText - Logout
        // driver.findElement(By.linkText("Logout")).click();

        // partialLinkText - Logout
        driver.findElement(By.partialLinkText("Logo")).click();

        Thread.sleep(5000);

        // Validation step
        boolean isLoginButtonPresent = driver.findElement(By.tagName("button")).isDisplayed();
        System.out.println("isLoginButtonPresent : " + isLoginButtonPresent);
        Assert.assertTrue(isLoginButtonPresent);

        Thread.sleep(5000);
        driver.close();

    }	
	}

