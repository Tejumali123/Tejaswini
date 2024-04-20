
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatecommands {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        
        //1. to open the Url we can use navigate command.
        driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
        
        //2. to refresh Url.
        driver.navigate().refresh();
        
        //3. to redirect one step back.
        WebElement flight = driver.findElement(By.linkText("Flights"));
        flight.click();
        Thread.sleep(1000);
        driver.navigate().back();
        
        //4.to redirect forward.
        driver.navigate().forward();
	}

}