package com.practice.salesforce;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	
	public static void main(String[] args) {
		String completeSentence= "Never give in. Never give in. Never, never, never, never-in nothing, great or small, large or petty-never give in, except to convictions of honor and good sense";
		String[] words = completeSentence.split("\\W+");
		Map<String, Integer> wordVsCount = new HashMap<String, Integer>();
		for (String eachWord : words) {
			System.out.println(eachWord);
//			if (wordVsCount.containsKey(eachWord)) {
				wordVsCount.put(eachWord, wordVsCount.getOrDefault(eachWord, 0)+1);
//			}else wordVsCount.put(eachWord, 1);
			
		}
		
		System.out.println(wordVsCount);
		
	}

}
