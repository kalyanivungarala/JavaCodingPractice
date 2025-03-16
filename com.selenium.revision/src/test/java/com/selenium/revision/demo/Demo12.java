package com.selenium.revision.demo;

import java.util.HashMap;
import java.util.Map;

public class Demo12 {
	
	public static void main(String[] args) {
		String description = "Kalyani is 16 Years exp. Kalyani is Senior QA";
		String[] split = description.split(" ");
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		for (String word : split) {
			//keeping the word Vs Count in Map
			wordCount.put(word, 1);
			//IF word is same increment count
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
				System.out.println("Incrementing the count by 1");
			}
			
		}
		
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println("Printing the map");
			System.out.println("Word Vs Count :" + key + " : "+val);
		}
		
		
	}

}
