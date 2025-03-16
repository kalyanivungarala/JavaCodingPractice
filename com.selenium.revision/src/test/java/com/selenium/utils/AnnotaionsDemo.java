package com.selenium.utils;

import org.testng.annotations.Test;

public class AnnotaionsDemo {
	
	@Test (invocationCount = 5, enabled = true, groups = {"smoke","sanity"}, dependsOnMethods = "belowMethod") //for running multiple times, for enabling/disabling
	
	public void test1() {
		
	}
	
	@Test(timeOut = 10000)
	public void test2() {
		
	}

}
