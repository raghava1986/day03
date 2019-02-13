package actionDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Target {
  @Test
  public void SearchT() throws InterruptedException {
	  WebDriver Ecom;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");
       Ecom =new ChromeDriver();
       Ecom.get("https://www.target.com");
       Ecom.findElement(By.name("searchTerm")).sendKeys("Bluetooth keyboard ");
       Thread.sleep(3000);
       Actions act = new Actions(Ecom);
       WebElement drd = Ecom.findElement(By.xpath("//*[text() ='in Computer & Office Accessories']"));
       act.moveToElement(drd).click().build().perform();
       Thread.sleep(3000);
       WebElement drd1 = Ecom.findElement(By.xpath("//*[text() ='Clear all']"));
       act.moveToElement(drd1).click().build().perform();
  }
  
}
