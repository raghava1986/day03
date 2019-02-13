package actionDemos;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoouseHover {
  @Test
  public void Mhover() throws InterruptedException, IOException {
	  WebDriver Mh ;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");
	   Mh = new ChromeDriver();
	   Mh.get("http://10.188.144.28:8083/TestMeApp");
	   Thread.sleep(3000);
	   ScreenShotReusable.screenshotmethod(Mh, "MainPage");
	   Mh.findElement(By.linkText("SignIn")).click();;
	   ScreenShotReusable.screenshotmethod(Mh, "LoginPage");
	   Thread.sleep(3000);
	   Mh.findElement(By.name("userName")).sendKeys("Lalitha");
	   Mh.findElement(By.name("password")).sendKeys("Password123");
	   Mh.findElement(By.name("Login")).click();
	   Thread.sleep(3000);
	   ScreenShotReusable.screenshotmethod(Mh, "Welcomepage");
	   Actions act = new Actions(Mh);
	   WebElement al = Mh.findElement(By.xpath("//*[text() ='All Categories']"));
	   WebElement el = Mh.findElement(By.xpath("//*[text() ='Electronics']"));
	  act.moveToElement(al).moveToElement(el).click().build().perform();
	   Thread.sleep(30000);
	   ScreenShotReusable.screenshotmethod(Mh, "Electronics page");
	   WebElement Hp = Mh.findElement(By.xpath("//*[text() ='Head Phone']"));
	   act.moveToElement(Hp).click().build().perform();
	   ScreenShotReusable.screenshotmethod(Mh, "Headphone");
  }
}
