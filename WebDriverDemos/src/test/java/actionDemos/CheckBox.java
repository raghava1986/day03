package actionDemos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBox {
  @Test
  public void CBf() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://10.188.144.28:8083/TestMeApp");
		driver.get("http://uitestpractice.com/Students/Form");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("document.querySelectorAll('input[value=read]')[0].click()");
		((JavascriptExecutor)driver).executeScript("document.querySelectorAll('input[value=cricket]')[0].click()");
		
		Thread.sleep(3000);
		driver.quit();
  }
}
