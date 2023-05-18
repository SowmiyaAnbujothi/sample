package Tests;

import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.HomePage;

public class TC1 extends BaseClass {
	
	@Test
	public void TC1()
	{
		HomePage.ClickOnFromInputField();
		
	}
	@Test
	public void TC2()
	{
		HomePage.ClickOnToInputField();
	}
}
