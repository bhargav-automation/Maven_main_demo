package Main_Using_Maven.Maven_MainProject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testng1 
{
	
	@Test
	public void Login_To_nasco() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Jenkins_Workspace\\Maven_MainProject\\Drivers\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://nasco-255213.web.app/");
		 Thread.sleep(2000);
		 driver.close();
	}

}
