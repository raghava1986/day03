package actionDemos;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotReusable {
public static void screenshotmethod(WebDriver driver,String Screenshot) throws IOException {

	TakesScreenshot ts=(TakesScreenshot)driver;
	File fls= ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(fls,new File("./Screenshots/"+timestamp()+Screenshot+".png"));
    System.out.println("Screenshot taken..");
}

public static String timestamp() {
	   return new SimpleDateFormat("yyyy-mm-dd HH-mm-ss").format(new Date());
	}
}

