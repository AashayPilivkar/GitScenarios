package Test_7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.PredefinedActions;

/*
 * Problem Statements :
1. How many total entries are there in table?
2. On Dynamic table - check age of Employee "Vaesar Vance" - write Dynamic Xpath - Print Age
3. Print Employee First Name of all employees working from London Office.
4. Find all Employees who hold Position as Software Engineer.
5. COunt number of Employee with age More than 25, on first page.
6. Print Employee Start date whose age is 66.
7. Print employee Age whose salary is minimum. 
8. How many rows in Table on first page.
9. Print all text in table
 */
public class TableDataHandling {
	
	@Test
	private void tableDetailsHandling() {
		System.out.println("Open Chrome Browser & AutomationByKrishna website  ");
		WebDriver driver = PredefinedActions.start();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Navigate to Demo Table Menu");
		driver.findElement(By.id("demotable")).click();
		System.out.println("How many total entries are there in table Employee Manager?");
		System.out.println("Get a list of Employees in List");
		List<WebElement> listOfName = driver.findElements(By.xpath("//div[@id='empmanager']//tbody/tr/td[2]"));
		System.out.println("Totla number of employees are:"+listOfName.size()+"and list is as follows");
		for(WebElement e : listOfName) {
			System.out.println(e.getText());
		}
		
		
		driver.close();
		
		
		
	}

}
