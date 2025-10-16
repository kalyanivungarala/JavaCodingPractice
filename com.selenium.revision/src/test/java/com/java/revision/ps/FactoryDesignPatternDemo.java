package com.java.revision.ps;

public class FactoryDesignPatternDemo {
	private static FactoryDesignPatternDemo instance;
	
	private FactoryDesignPatternDemo() {
		
	}
	
	public static FactoryDesignPatternDemo getInstance() {
		if (instance == null) {
			instance = new FactoryDesignPatternDemo();
		}
		return instance;
	}

}
