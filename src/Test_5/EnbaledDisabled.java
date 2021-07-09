package Test_5;
/*
 * Task for today

1. validate visible button functionality click on button and validate button is displayed or not and vice versa
2. validate enable button functionality click on button and validate button is disable or not and vice versa

Note: 1 & 2 perform on HTML which is shared
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.PredefinedActions;

public class EnbaledDisabled {

	@Test
	private void visibleButton() {
		System.out.println("Open site URL KrishnaREquirement.HTML");
		WebDriver driver = PredefinedActions
				.start("D:\\Java Class\\Selenium\\Sessions\\Session 5\\Krishna Requirement.html");
		System.out.println("Verify if the DIV text is displayed on page load?");
		boolean isButtonDisplayed = driver.findElement(By.xpath("//div[@id='myDIV']")).isDisplayed();
		if (isButtonDisplayed)
			System.out.println("DIV text is displaye? " + isButtonDisplayed);
		else
			System.out.println("DIV text is displayed? " + isButtonDisplayed);

		System.out.println("Click on button to hide the DIV.");
		driver.findElement(By.id("visibleAndHidden")).click();
		boolean isButtonHidden = driver.findElement(By.xpath("//div[@id='myDIV']")).isDisplayed();
		System.out.println("Verify if the Button is hidden after click");
		if (!isButtonHidden)
			System.out.println("DIV text is displayed? " + isButtonHidden);
		else
			System.out.println("DIV text is displayed? " + isButtonHidden);
		driver.close();
	}

	@Test
	private void enableButton() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Open site URL KrishnaREquirement.HTML");
		WebDriver driver = PredefinedActions.start("D:\\Java Class\\Selenium\\Sessions\\Session 5\\Krishna Requirement.html");
		boolean isButtonEnabled = driver.findElement(By.id("myText")).isEnabled();
		System.out.println("Verify if button is enabled on page load");
		if (isButtonEnabled)
			System.out.println("Button is enabled:" + isButtonEnabled);
		else
			System.out.println("Button is disabled:" + isButtonEnabled);
		System.out.println("Now click on button and verify the if it is displayed");
		driver.findElement(By.id("enableAndDisable")).click();
		boolean isButtonDisabled = driver.findElement(By.id("myText")).isEnabled();
		System.out.println("Verify that button is disabled on clicking");
		if (isButtonDisabled)
			System.out.println("Button is enabled:" + isButtonDisabled);
		else
			System.out.println("Button is disabled:" + isButtonDisabled);
		driver.close();
	}

}
