package com.Automation.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.AddPage;


public class AddTest extends BaseTest {
	public void AddPage() throws InterruptedException
	{
			DriverUtils.getDriver().get("https://www.makemytrip.com/");
			AddPage lp=new AddPage();
		lp.travel();	
	}	
}
