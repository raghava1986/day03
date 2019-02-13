package actionDemos;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrollaction {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://10.188.144.28:8083/TestMeApp");
		driver.get("http://uitestpractice.com/Students/Form");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");
		
	Thread.sleep(1000);
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-200)");
  }
}
