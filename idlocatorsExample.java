import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocatorsExample {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		
		// to find the element by using id locators firstly we need to create refereance variable interface and need to use below syntax
        WebElement username = driver.findElement(By.id("email"));
		
		WebElement password = driver.findElement(By.id("pass"));
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		
		
	//sendkeys method is used to enter the value in textbox

		username.sendKeys("pareshrana7@gmail.com");
		password.sendKeys("paresh123");
		
		//click method is sued to click on any button radio button checkbox or link
		login.clear();
	}

}
