package Test_15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.PredefinedActions;

public class SignInDataProvider {

	@DataProvider(name = "loginDetailProvider")
	public Object[][] loginDetailProvider() {
		Object[][] data = new Object[4][3];
		data[0][0] = "Aashay";
		data[0][1] = "123456789";
		data[0][2] = "Success!";

		data[1][0] = "Shaurya";
		data[1][1] = "123456789";
		data[1][2] = "Success!";

		data[2][0] = "Sneha";
		data[2][1] = "123456789";
		data[2][2] = "Success!";

		data[3][0] = "Neha";
		data[3][1] = "1011";
		data[3][2] = "Failed! please enter strong password";

		return data;
	}

	@Test(dataProvider = "loginDetailProvider")
	public void signInPage(String userName, String password, String exectedResult) {
		WebDriver driver = PredefinedActions.start();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("Click on Registration button");
		driver.findElement(By.id("registration2")).click();
		System.out.println("Enter UserName");
		driver.findElement(By.id("unameSignin")).sendKeys(userName);
		System.out.println("Enter Password");
		driver.findElement(By.id("pwdSignin")).sendKeys(password);
		System.out.println("Click on SignIN buttin");
		driver.findElement(By.id("btnsubmitdetails")).click();
		System.out.println("Verify alert message");
		Alert alert = driver.switchTo().alert();
		String actualAlertMessage = alert.getText();
		Assert.assertEquals(actualAlertMessage, exectedResult);
		alert.accept();
		driver.close();

	}

}
