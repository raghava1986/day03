package actionDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MouseDemo1 {
  @Test
  public void login() throws InterruptedException {
	  WebDriver testapp;
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");
	  testapp =new ChromeDriver();
	  testapp.get("http://10.188.144.28:8083/TestMeApp");
	  Thread.sleep(3000);
	  testapp.findElement(By.linkText("SignIn")).click();
	  testapp.findElement(By.name("userName")).sendKeys("Lalitha");
	  testapp.findElement(By.name("password")).sendKeys("Password123");
	  Thread.sleep(3000);
	  testapp.findElement(By.name("Login")).click();
	  Thread.sleep(30000);
  }
}
