import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitiwaitexample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("htpps://adactin.com/HoteleApp/index.php");
		driver.manage().window().maximize();
//1.fristly we needto createobject of webdriver wait class
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
//2 we will until method of webdiverwait class tp implement the
		//condition of expected class
		WebElement username = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("paresh");
		
		WebElement password= driver.findElement(By.id("password"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
		password.sendKeys("paresh123");
		
		WebElement login = driver.findElement(By.id("u_0b"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		
	}

}
