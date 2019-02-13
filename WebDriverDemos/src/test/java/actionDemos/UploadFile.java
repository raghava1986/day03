package actionDemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFile {
  @Test
  public void Ufile() throws InterruptedException, AWTException {
	  WebDriver TestD;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");  
	  TestD = new ChromeDriver();
	  TestD.manage().window().maximize();
	  TestD.get("http://uitestpractice.com/Students/Widgets");
	  Thread.sleep(20000);
	  TestD.findElement(By.id("image_file")).click();
	  Robot rob = new Robot ();
	  rob.setAutoDelay(2000);
	  StringSelection ssel =new StringSelection("C:\\Users\\training_H1b.06.15\\Pictures\\Screenshots\\Screenshot1.png");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ssel, null);
	  
	  rob.setAutoDelay(20000);
	  rob.keyPress(KeyEvent.VK_CONTROL);
	  rob.keyPress(KeyEvent.VK_V);
	  
	  rob.keyRelease(KeyEvent.VK_CONTROL);
	  rob.keyRelease(KeyEvent.VK_V);
	  rob.setAutoDelay(20000);
	  rob.keyPress(KeyEvent.VK_ENTER);
	  rob.setAutoDelay(20000);
	  TestD.findElement(By.xpath("*//input[@value='Upload']")).click();
  }
}
