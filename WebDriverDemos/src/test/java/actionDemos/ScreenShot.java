package actionDemos;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShot {
  @Test
  public void ScreenS() throws IOException {
	  WebDriver TestD;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");  
	  TestD = new ChromeDriver();
	  TestD.manage().window().maximize();
	  TestD.get("http://uitestpractice.com/");

	 TakesScreenshot tst =(TakesScreenshot)TestD;
	 File fls = tst.getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(fls, new File("./Screenshot/Login.jpeg"));
	 
	 
  }
}
