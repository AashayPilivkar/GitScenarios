package Test_6;


import java.util.List;

/*
 * 
Test Case 5 :
String url= https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html';
1.open url on browser
2.Select any day from dropdown
3. select multiple values from multilist Demo 
4. deselect all the selected options and select remaining option
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base.PredefinedActions;

public class MultipleSelection {
	
	@Test
	private void selectMultiple() {
		System.out.println("Open web URL :");
		WebDriver driver = PredefinedActions.start("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		System.out.println("Find drop down box to select an date");
		WebElement element = driver.findElement(By.id("select-demo"));
		System.out.println("Store element in Select & select any one of them using selectIndex");
		Select select = new Select(element);
		select.selectByIndex(3);
		System.out.println("search & select multiple values from multilist Demo ");
		WebElement webList = driver.findElement(By.id("multi-select"));
		Select selectList = new Select(webList);
		selectList.selectByIndex(2);
		selectList.selectByValue("New York");
		selectList.selectByVisibleText("Texas");
		System.out.println("Verify the selected values by isSelected");
		List<WebElement> selectedElement = selectList.getAllSelectedOptions();
		System.out.println("Selecte value count is"+selectedElement.size());
		for(WebElement e:selectedElement) {
			if(e.isSelected()) {
				System.out.println("Selected value:"+e.getText());
			}
		}
		System.out.println("Deselect selected options and select non selected option");
		List<WebElement> listSize = selectList.getOptions();
		int list = listSize.size();
		int cnt=0;
		for(WebElement e : selectList.getOptions() ) {
			if(cnt <= list)
			{
				if(e.isSelected()) {
					selectList.deselectByIndex(cnt);
					System.out.println("Deselected option is:"+e.getText());
				}else {
					selectList.selectByIndex(cnt);
					System.out.println("Selected option is:"+e.getText());
				}
			}
			cnt++;
		}		
		driver.close();
	}

}
