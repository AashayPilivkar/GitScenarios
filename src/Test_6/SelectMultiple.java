package Test_6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.PredefinedActions;
import okio.Timeout;

public class SelectMultiple {

	@Test
	private void multipleSelectionDropDown() {
		WebDriver driver = PredefinedActions.start();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Click on Basic Element tab");
		driver.findElement(By.id("basicelements")).click();
		System.out.println("Scroll down to the element multiple drop down");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,-250)");
		WebElement element = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select = new Select(element);
		System.out.println("Is multiple valies available for selection:" + select.isMultiple());
		System.out.println("Select Multiple values using selectByIndex method");
		select.selectByIndex(1);
		select.selectByIndex(3);

		List<WebElement> list = select.getAllSelectedOptions();
		for (WebElement e : list) {
			System.out.println("Selected options are:" + e.getText());
		}
		driver.close();
	}

}
