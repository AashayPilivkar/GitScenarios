package Test_3_4;

import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import Base.PredefinedActions;

public class AlertJavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = PredefinedActions.start("http://automationbykrishna.com/#");
		String input = "Aashay and Pilivkar and Bitwise";

		System.out.println("TC#1 Enter First-Last Name & Company details and verify that you get alert. Verify the same");
		driver.findElement(By.id("basicelements")).click();
		Thread.sleep(2000);
		System.out.println("First Box: Enter Fname, Lname and Company name. ");
		driver.findElement(By.id("UserFirstName")).sendKeys("Aashay");
		;
		driver.findElement(By.id("UserLastName")).sendKeys("Pilivkar");
		driver.findElement(By.id("UserCompanyName")).sendKeys("Bitwise");
		driver.findElement(By.xpath("//button[@class='btn btn-primary'][@onclick='myFunctionPopUp()']")).click();
		System.out.println("Click on First Submit button & handle Alert");
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println(alertText);
		System.out.println("Validating Alert Text");
		if (alertText.equals(input))
			System.out.println("Test case 1 is passed");
		else
			System.out.println("Test case 1 is failed, details are inocrrect: " + alertText);
		alert.accept();
		System.out.println("--------------------------------------------------------------------");
		System.out.println("---------------TC2------------");

		String alertOutput = "You successfully clicked on it";
		System.out.println("Enter EmailID");
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("aashay.pilivkar@gmail.com");
		System.out.println("Enter PWD");
		driver.findElement(By.id("pwd")).sendKeys("12345");
		System.out.println("Click on Submit");
		driver.findElement(By.id("submitb2")).click();
		System.out.println("Handle alert & validate alert text");
		String alertForm2 = alert.getText();
		alert.accept();
		if (alertOutput.equals(alertForm2))
			System.out.println("Test case 2 is passed");
		else
			System.out.println("Test case 2 is failed, details are inocrrect: " + alertForm2);

		System.out.println("--------------------------------------------------------------------");
		System.out.println("---------------TC3------------");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("scroll(0,300)");
		String alertMessageTC3 = "You must be TechnoCredits student!!";
		System.out.println("Step: click on Alert button");
		driver.findElement(By.id("javascriptAlert")).click();
		System.out.println("Validate alert message");
		String alertText3 = alert.getText();
		if (alertText3.equals(alertMessageTC3))
			System.out.println("Test case 3 is passed");
		else
			System.out.println("Test case 3 is failed, details are inocrrect: " + alertText3);
		alert.accept();

		System.out.println("--------------------------------------------------------------------");
		System.out.println("---------------TC4------------");
		String alertMessageTC4 = "Are you are doing your homework regularly, Press Okay else Cancel!!";
		System.out.println("Click on JavaScript Confirmation button");
		driver.findElement(By.id("javascriptConfirmBox")).click();
		String alertOutputTC4 = alert.getText();
		System.out.println("Verify Alert message");
		if (alertOutputTC4.equals(alertMessageTC4))
			System.out.println("Alert message is correct");
		else
			System.out.println("Alert message is incorrect");
		alert.accept();
		System.out.println("Click on OK buton on ALert");
		String outputMessageOk = driver.findElement(By.id("pgraphdemo")).getText();
		System.out.println("Click on OK button on Alert, message displayed is:" + outputMessageOk);

		System.out.println("Click on JavaScript Confirmation button to check Cancel button");
		driver.findElement(By.id("javascriptConfirmBox")).click();
		System.out.println("Click on Cancel buton on ALert");
		alert.dismiss();
		String outputMessageCancel = driver.findElement(By.id("pgraphdemo")).getText();
		System.out.println("Click on Cancel button on Alert, message displayed is:" + outputMessageCancel);

		if (outputMessageOk.equals("You pressed OK!") && outputMessageCancel.equals("You pressed Cancel!"))
			System.out.println("Test case 4 is passed");
		else
			System.out.println("Test case 4 is failed");

		System.out.println("--------------------------------------------------------------------");
		System.out.println("---------------TC5------------");
		driver.findElement(By.id("javascriptPromp")).click();
		System.out.println("Send given name - Aashay");
		alert.sendKeys("Aashay");
		alert.accept();
		String OutputMessageTC5 = driver.findElement(By.id("pgraphdemo")).getText();
		System.out.println("Given message with name is: "+OutputMessageTC5);
		if(OutputMessageTC5.contains("Aashay"))
			System.out.println("Test case 5 is PASS: given name is present in the message");
		else
			System.out.println("Test case 5 is FAIL:");

		driver.close();

	}

}
