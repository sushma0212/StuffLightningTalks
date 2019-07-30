package com.stuff.lightning.talks.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

}
