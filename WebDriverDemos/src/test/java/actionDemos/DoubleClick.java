package actionDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {
  @Test
  public void Dc() {
  WebDriver TestD;
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");  
  TestD = new ChromeDriver();
  TestD.manage().window().maximize();
  TestD.get("http://uitestpractice.com/");

 Actions DClicks = new Actions(TestD);
 WebElement Dclick = TestD.findElement(By.name("dblClick"));
 //DClicks.moveToElement(Dclick).doubleClick().build().perform();
 DClicks.doubleClick(Dclick).build().perform();
 
 
 
  
  
  
  
  }
  
}
