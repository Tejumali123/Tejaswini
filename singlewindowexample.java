import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.scene.Parent;

public class singlewindowexample {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		//getwindowhanlde method will store the unique session id of opened window
		String Parentwindow = driver.getWindowHandle();
		System.out.println(Parentwindow);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		//it will store the all the opened window after clicking on button
		Set<String> childwindow = driver.getWindowHandles();
		Iterator<String> i = childwindow.iterator();
		while(i.hasNext())
		{
			String childwindow1 = i.next();
			System.out.println(childwindow1);
			
			if(!Parentwindow.equalsIgnoreCase(childwindow1))
			{
			driver.switchTo().window(childwindow1);
			WebElement download = driver.findElement(By.linkText("Downloads"));
			download.click();
			driver.close();
		}
		}
		
driver.switchTo().window(Parentwindow);
}

}
