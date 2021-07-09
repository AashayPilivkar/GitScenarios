package Test_6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.PredefinedActions;

/*
 * 
 */

public class MissingLink {
	@Test
	private void checkMissingLink() {
		WebDriver driver = PredefinedActions.start("D:\\Java Class\\Selenium\\Sessions\\Session 5\\MissingLink.html");
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		for(WebElement e : list) {
			String att = e.getAttribute("href");
			if(att == null) {
				System.out.println("HREF is missing");
			}else if(att != null) {
				if(att.length()!=0)
					System.out.println("Link is present:"+e.getText());
				else
					System.out.println("Link is missing"+ e.getText());
			}
					
		}
		driver.close();
	}

}
