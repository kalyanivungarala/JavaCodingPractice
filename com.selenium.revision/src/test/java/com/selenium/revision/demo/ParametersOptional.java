package com.selenium.revision.demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersOptional {
	
	@Test
	@Parameters({"Name"})
	public void test1(@Optional("Kalyani") String name) {
		System.out.println("Name is "+name);
	}

}
