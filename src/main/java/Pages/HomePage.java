package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseActions.CommonActions;
import BaseClass.BaseClass;

public class HomePage extends BaseClass{

	
	public static WebElement FromInputField=driver.findElement(By.xpath("//*[@id=\"origin\"]/span/input"));
	
	public static WebElement ToInputField=driver.findElement(By.xpath("//*[@id='destination']/span/input"));
	
	public static void ClickOnFromInputField() {
		CommonActions.OnClick(FromInputField);
	}
	public static void ClickOnToInputField() {
		CommonActions.OnClick(ToInputField);
	}
}
