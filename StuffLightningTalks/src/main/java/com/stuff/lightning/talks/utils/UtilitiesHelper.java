package com.stuff.lightning.talks.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UtilitiesHelper {
	
	private final static Logger LOG = LoggerFactory.getLogger(UtilitiesHelper.class);
	
	public static String getLocalDateTime() {
		//Get current date time
        LocalDateTime now = LocalDateTime.now();

        LOG.info("Before : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatDateTime = now.format(formatter);

        LOG.info("After : " + formatDateTime);
      
        return formatDateTime;
	}
	
	public static Date upcomingLightingDate(Date dt) {
		int month = 0;
		int newMonth = 0;
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Current Month ::: " + now.getMonthValue());
		int evenOrOdd = now.getMonthValue() % 2;
		if (evenOrOdd == 0) {
			System.out.println("Even Month ::: " + now.getMonthValue());
			month = now.getMonthValue();
			Calendar cal2 = new GregorianCalendar(now.getYear(), month, 1); // allocate with the specified date
			System.out.println(cal2.get(Calendar.DAY_OF_WEEK));
			int firstWeekDays = 0;
			if (cal2.get(Calendar.DAY_OF_WEEK) == 1) {
				firstWeekDays = 3;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 2) {
				firstWeekDays = 2;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 3) {
				firstWeekDays = 1;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 4) {
				firstWeekDays = 7;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 5) {
				firstWeekDays = 6;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 6) {
				firstWeekDays = 5;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 7) {
				firstWeekDays = 4;
			}
			Calendar cal1 = new GregorianCalendar(now.getYear(),month,firstWeekDays); // allocate an instance and upcast to Calendar
			System.out.println(cal1.getTime());
			dt = cal1.getTime();
			
		} else {
			System.out.println("Odd Month ::: " + now.getMonthValue());
			month = now.getMonthValue();
			System.out.println("Odd Month ::: " + now.getDayOfWeek());
			Calendar ca1 = Calendar.getInstance();
			ca1.set(now.getYear(), now.getMonthValue() - 1, 1);
			ca1.setMinimalDaysInFirstWeek(1);
			int wk = ca1.get(Calendar.WEEK_OF_MONTH);
			System.out.println("Week of Month :" + wk);
			System.out.println("Week of Month :" + ca1.getTime());
			Date d = ca1.getTime();
			LocalDateTime t = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
			System.out.println(t.getDayOfWeek());
			System.out.println(now.getDayOfMonth());
			Calendar cal2 = new GregorianCalendar(now.getYear(), month, 1); // allocate with the specified date
			System.out.println(cal2.get(Calendar.DAY_OF_WEEK));
			int firstWeekDays = 0;
			if (cal2.get(Calendar.DAY_OF_WEEK) == 1) {
				firstWeekDays = 3;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 2) {
				firstWeekDays = 2;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 3) {
				firstWeekDays = 1;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 4) {
				firstWeekDays = 7;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 5) {
				firstWeekDays = 6;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 6) {
				firstWeekDays = 5;
			} else if (cal2.get(Calendar.DAY_OF_WEEK) == 7) {
				firstWeekDays = 4;
			}
			Calendar cal1 = new GregorianCalendar(now.getYear(),month,firstWeekDays); // allocate an instance and upcast to Calendar
			System.out.println(cal1.getTime());
			dt = cal1.getTime();
		}
		return dt;
	}

}
