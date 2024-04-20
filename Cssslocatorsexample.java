import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssslocatorsexample {

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		// 1 by using tag and class name
		// WebElement un  = driver.findElement(By.className("input.inputtext"));
		
		// 2 by using tag and id
		// WebElement pass = driver.findElement(By.className("input#pass"));
		
		// un. sendkeys ("paresh");
		// pass.senkeys ("paresh");
		
		//3. by using tag and attributes
		WebElement un = driver.findElement(By.cssSelector("input[type='text'][name='email']"));
		
		//4. by using tag, class and attributes
		WebElement pass = driver.findElement(By.cssSelector("input.inputtext[type='password'][tabindex='2']"));
		
		un.sendKeys("paresh");
		pass.sendKeys("paresh");
		
		
		//5. by using tag id and attributes
		
		WebElement login = driver.findElement(By.cssSelector("input#u_0_b[type='submit'][value='Log In']"));
		
		login.click();
		
		//6 by using starts with-it will be find locator staring character.
		
		WebElement username = driver.findElement(By.cssSelector("input[name^='email']"));
        username.sendKeys("paresh");
        
        //7 ends with -it will find the locator based on ending character.
        WebElement password = driver.findElement(By.cssSelector("input[type$='password'"));
	    password.sendKeys("paresh123");
	    
	    //8 by using the contains-it will find the locator based on character which is present or not.
	    
	    WebElement login1 = driver.findElement(By.cssSelector("input#u_o_b[type*=bm']"));
	    login1.click();
	    
	    
	    
	    
		
		
	}

}
