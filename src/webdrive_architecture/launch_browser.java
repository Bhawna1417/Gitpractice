package webdrive_architecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_browser {
	static WebDriver driver;
	
	public void getcommands()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhawna.gupta\\Downloads\\cc\\Admin_Navvis (2)\\Admin\\chromedriver.exe");
		//To run in headless mode
		///ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		//options.addArguments("--Headless");
		//WebDriver driver=new ChromeDriver(options);
		 driver=new ChromeDriver();
		driver.get("https://google.com"); //get url 
		System.out.println(driver.getTitle());  //get title of the page
		System.out.println(driver.getCurrentUrl());  //get currenturl of the page
		String str=driver.findElement(By.id("name")).getText(); //The visible text of this element not hidden
		
	}
	 public void navigationcommand()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhawna.gupta\\Downloads\\cc\\Admin_Navvis (2)\\Admin\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://google.com"); 
			driver.navigate().to("https://gmail.com");  
			driver.navigate().back();  ////coming back from site2 to site 1
			driver.navigate().forward();   //fwd again from site1 to site 2
/*  
 * step 1= driver.get("site1 url") -to access url 
 * Step 2=driver.navigate().to("site2 url");  //from site1 to site 2
 * Step 3=driver.navigate().back("site1 url");  //coming back from site2 to site 1
 * Step 2=driver.navigate().forward("site2 url");  //fwd again from site1 to site 2
 * 
 * 
 * 
 */
	 }
	 
	 public void conditionalcommand()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\bhawna.gupta\\Downloads\\cc\\Admin_Navvis (2)\\Admin\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
	
			driver.get("https://facebook.com"); 
			WebElement username=driver.findElement(By.id("username"));
			WebElement Pass=driver.findElement(By.id("password"));
			WebElement submit=driver.findElement(By.id("submit"));
			submit.isSelected(); // return True if the element is currently selected or checked, false otherwise.
			if (username.isDisplayed() && Pass.isEnabled()) //Is this element displayed or not? and return True if the element is enabled, false otherwise
			{
				username.sendKeys("bhawna");
			}
	 }
	
	public static void main(String[] args) {

		launch_browser lb=new launch_browser();
		lb.getcommands();
		


	}

}
