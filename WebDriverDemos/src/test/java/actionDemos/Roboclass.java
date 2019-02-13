package actionDemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Roboclass {
  @Test
  public void RClass() throws AWTException {
	  WebDriver TestD;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");  
	  TestD = new ChromeDriver();
	  TestD.manage().window().maximize();
	  TestD.get("https://google.com");
	  TestD.findElement(By.name("q")).sendKeys("Abcdefhj");
	  Robot rca = new Robot ();
	  rca.keyPress(KeyEvent.VK_ENTER);
	  rca.keyRelease(KeyEvent.VK_ENTER);
  }
}
