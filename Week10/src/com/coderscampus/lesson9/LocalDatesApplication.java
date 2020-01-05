package com.coderscampus.lesson9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDatesApplication {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		ZonedDateTime zonedDatetime = ZonedDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		System.out.println(zonedDatetime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z")));
		
	}
}
