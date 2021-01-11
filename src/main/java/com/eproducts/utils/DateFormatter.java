package com.eproducts.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static String dateFormatter3(String inputDate, String pattern) {
		System.out.println("inputDate -> " + inputDate);
		System.out.println("pattern -> " + pattern);
		LocalDateTime dateTime = LocalDateTime.parse(inputDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		String formatedDate = dateTime.format(formatter);
		System.out.println(formatedDate);
		return formatedDate;
	}

}
