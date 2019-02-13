package actionDemos;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JscriptExe {
  @Test
  public void f() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_H1b.06.15\\Desktop\\Selenium Plus\\drivers\\Selenium_Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://10.188.144.28:8083/TestMeApp");
		driver.get("http://demo.guru99.com");
		
		
				JavascriptExecutor js =(JavascriptExecutor)driver;
				String DomainName = js.executeScript("return document.domain;").toString();
				System.out.println("Domain Name of the site = "+DomainName);
				//js.executeScript("alert('Welcome to javaScript executor topic')");
				String url = js.executeScript("return document.URL;").toString();
				System.out.println("URL of the site = "+url);
				String TitleName = js.executeScript("return document.title;").toString();
				System.out.println("Title of the site = "+TitleName);
				
				js.executeScript("window.location = 'http://demo.grur99.com/v4/'");
				Thread.sleep(40000);
				driver.quit();
	}
}

