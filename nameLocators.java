import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocators {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		 WebElement username = driver.findElement(By.id("email"));
			
			WebElement password = driver.findElement(By.id("pass"));
			
			username.sendKeys("paresh");
			password.sendKeys("paresh123");
	}

}
