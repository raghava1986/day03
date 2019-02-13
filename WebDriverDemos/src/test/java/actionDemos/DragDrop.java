package actionDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {
  @Test
  public void Dradro() throws InterruptedException {
	  WebDriver TestD;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");  
	  TestD = new ChromeDriver();
	  TestD.manage().window().maximize();
	  TestD.get("http://uitestpractice.com/");

	 Actions Drad = new Actions(TestD);
	 WebElement Drag = TestD.findElement(By.id("draggable"));
	 WebElement Drop = TestD.findElement(By.id("droppable"));
	 
	 Drad.clickAndHold(Drag).release(Drop).perform();
	 Thread.sleep(3000);
	 Drad.dragAndDrop(Drop, Drag).click().perform();
	
	 TestD.quit();
	 
	
	 
  }
}
