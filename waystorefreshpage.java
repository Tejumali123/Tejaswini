import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.indexeddb.model.Key;

public class waystorefreshpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.manage().window().maximize();
//1 by using the refresh method
		
		driver.navigate().refresh();
//2 by using get and get and getcurrent url method 
		driver.get(driver.getCurrentUrl());
		
		//3 by using the get cureent url and add that into navigate method
		driver.navigate().to(driver.getCurrentUrl());
		
		//4 by using the f5 press
		driver.findElement(By.id("email")).sendKeys(Keys.F5);
		
		//5 by using ascii value
		driver.findElement(By.id("email")).sendKeys("\uE035");
		
	}

}
