import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsselecteDisdisplayedIsEnable {

	public static void main(String[] args) 
	{

System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
	WebElement username = driver.findElement(By.id("email"));
	WebElement password = driver.findElement(By.id("pass"));
	
	boolean result = username.isDisplayed();
	boolean result1 = username .isDisplayed();
		System.out.println(result);
		System.out.println(result);
		
		//is displayed method is used to validate element is present or not
		//is enabled method is used to validate element is enable or disable
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("paresh");
		}
		else
		{
			System.out.println("username is not displayed");
		}
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("paresh");
		}
		else
		{
			System.out.println("password is not displayed");
		}
		
		WebElement checkbox = driver.findElement(By.id("persist_box"));
		
		//isselected method is used to validate checkbox or radio button is already selected or not
		boolean result11 = checkbox.isSelected();
		System.out.println(result);
		
	}
}