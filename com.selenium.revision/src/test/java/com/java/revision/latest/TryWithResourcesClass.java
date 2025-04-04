package com.java.revision.latest;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourcesClass {

	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("SampleFile.txt"))) {
			if (reader.readLine() != null) {
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
