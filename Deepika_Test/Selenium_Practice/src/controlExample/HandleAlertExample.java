package controlExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HandleAlertExample extends BaseTest {
	
	@Test
	public void simpleAlert() throws InterruptedException {

      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
      System.out.println("Alert popup-------------");
      
      //handle alert
      
      Alert simpleAlert = driver.switchTo().alert();
      
      //get the text of alert
      String actualAlertText = simpleAlert.getText();
      
     //Validation steps
      System.out.println("Alert text: " + actualAlertText);
      Assert.assertEquals("Hi.. This is alert message!", actualAlertText);
      Assert.assertTrue(actualAlertText.contains("alert message"));
      
		
	}

}
