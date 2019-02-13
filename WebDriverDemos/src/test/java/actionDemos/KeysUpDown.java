package actionDemos;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class KeysUpDown {
  @Test
  public void Keysud() throws IOException {
  
	  WebDriver TestD;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");  
	  TestD = new ChromeDriver();
	  TestD.manage().window().maximize();
	  TestD.get("http://uitestpractice.com/Students/Actions");
	  TakesScreenshot tst =(TakesScreenshot)TestD;
		 File fls = tst.getScreenshotAs(OutputType.FILE);
		 FileHandler.copy(fls, new File("./Screenshot/Login.jpeg"));

	 Actions KUD = new Actions(TestD);
	 WebElement n1 = TestD.findElement(By.name("one"));
	 WebElement n5 = TestD.findElement(By.name("five"));
	 WebElement n7 = TestD.findElement(By.name("seven"));
	 KUD.keyDown(Keys.CONTROL).click(n1).click(n5).click(n7).keyUp(Keys.CONTROL).build().perform();
  

	 File fls1 = tst.getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(fls1, new File("./Screenshot/result.jpeg"));
  }
  
}
