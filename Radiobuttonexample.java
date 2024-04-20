import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonexample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement radiobutton1 = driver.findElement(By.xpath("//*[@value='male']"));
		radiobutton1.click();
		
		//if(radiobutton1.isSelected())
		{
	//		System.out.println("radio button is alredy selected");
		}
	//	else
		{
	//		radiobutton1.click();
			
		}
		List<WebElement> allradio=driver.findElements(By.xpath("//*[@type='radio']"));
		for(int i=0;i<allradio.size();i++)
		{
			String value = allradio.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("male"));
			
		}
		
	}

}
