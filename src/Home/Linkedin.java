package Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Linkedin {
	WebDriver driver = new FirefoxDriver();
	@BeforeTest
	public void setUp() throws Exception { 
        
        String baseUrl = "http://www.linkedin.com/";    
        driver.get(baseUrl);
       
	}
     
	
	@Test
	public void login() throws InterruptedException
	{
		WebElement login = driver.findElement(By.id("login-email"));
		login.sendKeys("hanadefine1@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("login-password"));
		pwd.sendKeys("Definebyme1");
		
	
		WebElement in = driver.findElement(By.name("submit"));
		in.click();
		
		Thread.sleep(10000);
	}
	
	
	 @Test
	    public void profile() throws InterruptedException  {
	
       Actions action = new Actions(driver);
       WebElement profile = driver.findElement(By.linkText("Profile"));
     
      action.moveToElement(profile).build().perform();

		Thread.sleep(10000);
       
	}
	
	 @Test
	    public void message() throws InterruptedException  {
	
    Actions action1 = new Actions(driver);
    WebElement message = driver.findElement(By.xpath("//*[@id='mg-defer-id-1-12620']"));
  
    
  
   action1.moveToElement(message).build().perform();

		Thread.sleep(10000);
    
	}
 
}
  
