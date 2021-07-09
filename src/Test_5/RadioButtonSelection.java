package Test_5;
import java.util.concurrent.TimeUnit;

/*
 * 3. validate isSelected on automationbykrishna's registration page if male radio button is selected then click on female
 */
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.PredefinedActions;

public class RadioButtonSelection {
	@Test
	private void radioButtonSelection() throws Exception {
		System.out.println("Verify the radio buttons are selection");
		WebDriver driver = PredefinedActions.start();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("registration2")).click();
		JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
		scrollDown.executeScript("scroll(0,200)");
		System.out.println("Check if the Male radio button is selected on pageload?");
		boolean isReadioButtonSelected = driver.findElement(By.id("radio-01")).isSelected();
		if (isReadioButtonSelected)
			System.out.println("Male radio button is bydefault selected on page load");
		else
			System.out.println("Male radio button is bydefault not selected on page load");
		System.out.println("Click on Female radio button");
		driver.findElement(By.id("radio-02")).click();
		System.out.println("Now verify that Female radio button is selected & Male radio button is not selected");
		isReadioButtonSelected = driver.findElement(By.id("radio-01")).isSelected();
		boolean femaleRadioBtn = driver.findElement(By.id("radio-02")).isSelected();
		if (isReadioButtonSelected && femaleRadioBtn)
			System.out.println("Female radio button is selected & Male radio button is not selected");
		else
			System.out.println("Female radio button is selected & Male radio button is not selected");

		driver.close();
	}

}
