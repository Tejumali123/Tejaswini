import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfileexample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
    driver.manage().window().maximize();
    
    WebElement upload = driver.findElement(By.id("uploadfile_0"));
    upload.sendKeys("C:\\Users\\admin\\Desktop\\mannual testing//Microsoft PowerPoint Presentation .pptx");
    WebElement submit = driver.findElement(By.id("submitbutton"));
    submit.click();
	}

}
