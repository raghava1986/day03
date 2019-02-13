package actionDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Uppercase {
  @Test
  public void f() {
	  WebDriver Google;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");  
	 
	  Google = new ChromeDriver();
	  Google.get("https://google.com");
	  Actions Upcase = new Actions(Google);
	WebElement SeBox =  Google.findElement(By.name("q"));
    Upcase.keyDown(Keys.SHIFT).click(SeBox).sendKeys("absbdkhsdhjk").keyUp(Keys.SHIFT).doubleClick(SeBox).build().perform();
    
	  
  }
}
