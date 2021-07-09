package Test_2;
/*
 * Test - 2

1. Launch a chrome
2. Open Google.com
3. Get page title name and verify with expected title
4. navigate to automationbykrishna.com
5. Get page title name and verify with expected title
6. navigate back in history
7. Get page title name and verify with expected title [google]
8. navigate forward in the history
9. Get page title name and verify with expected title [automationbykrishna]
10. refresh the page and verify the expected title [automationbykrishna]
11. Close the browser.

 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String getTitle = driver.getTitle();
		if(getTitle.equals("Google"))
			System.out.println("Title of first link:"+ getTitle);
		else
			System.out.println("Incorrect title displayed:"+ getTitle);	
		
		driver.get("http://automationbykrishna.com/");
		Thread.sleep(1000);
		String getTitle2 = driver.getTitle();
		if(getTitle2.equals("Login Signup Demo"))
			System.out.println("Title of first link:"+ getTitle2);
		else
			System.out.println("Incorrect title displayed:"+ getTitle2);
		
		driver.navigate().back();
		if(getTitle.equals(getTitle))
			System.out.println("Reverified Title of first link:"+ getTitle);
		else
			System.out.println("Reverified title of the first link and Incorrect title displayed:"+ getTitle);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		if(getTitle2.equals("Login Signup Demo"))
			System.out.println("Title of first link:"+ getTitle2);
		else
			System.out.println("Incorrect title displayed:"+ getTitle2);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		if(getTitle2.equals("Login Signup Demo"))
			System.out.println("Title of first link:"+ getTitle2);
		else
			System.out.println("Incorrect title displayed:"+ getTitle2);
		
		driver.close();
		
	}

}
