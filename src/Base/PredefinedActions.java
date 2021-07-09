package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedActions {
	
	public static WebDriver start(String Url) {
		System.out.println("Launch web browser");
		System.setProperty("webdriver.chrome.driver",".\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Open given URL: "+ Url);
		driver.get(Url);
		driver.manage().window().maximize();
		return driver;
	
	}
	
	public static WebDriver start() {
		return start("http://automationbykrishna.com/");
			
	}

}
