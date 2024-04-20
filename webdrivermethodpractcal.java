import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdrivermethodpractcal
{
 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//this method will help you to set the browser path which we need to use to run the automation script
		
    System.setProperty("webdriver.chrome.driver", "E:\\automation practical\\software\\chrome\\chromedriver.exe");
    
	// to create chromedriver object we need to create webdriver interface reference a d need to create object for browser
    
    WebDriver driver = new ChromeDriver(); 
    
    //1. get()-> this method will help you to open the anu URL.
    driver.get("https://www.amazon.in/");

    //3 to get the title of current opened url we can use get title method
    String title = driver.getTitle();
    System.out.println(title);
    
    //4 to get the current opened url we can get current url method
    String url= driver.getCurrentUrl();
    System.out.println(url);
    
    //5 to get the source code of opened url we can use this method get page source
    String source = driver.getPageSource();
    System.out.println(source);
    
    //2 to close the current opened url we need to ude close method
    driver.close();
    }
	

}
