package com.java.interview;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
		String format = sdf.format(date);
		System.out.println(format );
	}

}
