import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextandpartiallinklocator {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		// webElement forgot=driver.finfelement(by.linktext("forgot your password?));
		// forgot.click();
		WebElement forgot =driver.findElement(By.partialLinkText("pass"));
		forgot.click();

	}

}
