package controlExample;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleRadioCheck extends BaseTest {
	
	@Test
	public void verifyRadioCheckbox() throws InterruptedException {
	      
        Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@value='Bike']")).click();
	      System.out.println("Checkbox Bike-------------");
	      
	        Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@value='Car']")).click();
	      System.out.println("Checkbox Car-------------");
	      
	        Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@value='Boat']")).click();
	      System.out.println("Checkbox Boat-------------");
	      

	        Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@value='male']")).click();
	      System.out.println("RadioButton male-------------");
	      

	        Thread.sleep(2000);
	      driver.findElement(By.xpath("//input[@value='female']")).click();
	      System.out.println("RadioButton female-------------");
		
	}
	

}
