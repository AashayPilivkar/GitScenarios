import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromerdriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String pageTitle = driver.getTitle();
		System.out.println("Page tile: "+pageTitle+" and its lenght is: "+pageTitle.length());
		String pageUrl = driver.getCurrentUrl();
		if(pageUrl.equals("https://www.google.com/")) {
			System.out.println("Current URL is correct "+pageUrl);
		}else
			System.out.println("Current URL is incorrect");
		String pageSource = driver.getPageSource();
	//	System.out.println("PageSource: "+pageSource+"PageSource lenght is:"+ pageSource.length());
		driver.close();
		
		
		
	}

}
