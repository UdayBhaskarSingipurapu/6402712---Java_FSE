package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
	private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);
	
	public static void main(String args[]) {
		logger.info("App Started");

        String user = "Uday";
        logger.debug("User {} logged in", user);

        try {
            int a = 10 / 0;
        } 
        catch (Exception e) {
            logger.error("Exception occurred: ", e);
        }

        logger.warn("This is just a warning");
	}
}
