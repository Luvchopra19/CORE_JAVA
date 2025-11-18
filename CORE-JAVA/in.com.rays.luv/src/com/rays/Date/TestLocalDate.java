package com.rays.Date;

import java.time.LocalDate;

public class TestLocalDate {
public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	System.out.println("Today = " + now);
	System.out.println("Day of Week = " + now.getDayOfWeek());
	System.out.println("Day of Month = " + now.getDayOfMonth());
	System.out.println("Day of Year= " + now.getDayOfYear());
	System.out.println("Month = " + now.getMonthValue());
	System.out.println("Year = " + now.getYear());
	
	System.out.println("--------------------");
	
	LocalDate dob = LocalDate.of(2005, 10, 19);
	
	System.out.println("dob = " + dob);
	System.out.println("Dob Day of Week = " + dob.getDayOfWeek());
	System.out.println("Dob day of Month = " + dob.getDayOfMonth());
	System.out.println("Dob day of Year= " + dob.getDayOfYear());
	System.out.println("Dob Month = " + dob.getMonthValue());
	System.out.println("Dob Year = " + dob.getYear());
	
	System.out.println("------------------");
	System.out.println("age = " + (now.getYear() - dob.getYear()));
}
}
