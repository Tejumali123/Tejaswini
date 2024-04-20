import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takescreenshotexample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		//firstly we are creating reference of takescreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//calling getscreenshots method to create image 
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		
		//move the file into new destination folder
		File destFile =new File("F:\\Images\\error.png");
		
	//we will copy the screenshot into destination folder
		Files.copy(srcfile, destFile);
		
		
	}

}
