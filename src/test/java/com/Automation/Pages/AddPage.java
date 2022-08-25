package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddPage extends BasePage {
	@FindBy(xpath="//li[@class=\"selected\"]")
	private WebElement roundtrip;
	
//	@FindBy(xpath="//span[text()='Round-trip']")
//	private WebElement roundtrip;
	
	@FindBy(xpath="//input[@id='fromCity']")
	WebElement ClickFrom_city;
	
	@FindBy(xpath = "//p[text()='Bengaluru, India']") 
	WebElement selectFrom_city;
	
	
	public void travel() throws InterruptedException {
		ClickFrom_city.click();
		selectFrom_city.click();
	
	}
	
}
