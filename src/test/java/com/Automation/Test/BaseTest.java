package com.Automation.Test;

import com.Automation.GenericUtils.DriverUtils;

public class BaseTest {
	public void Precondition()
	{
		{
			DriverUtils.createDriver();
		}
		
	}
}
