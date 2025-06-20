package com.SingletonPatternExample;

public class Logger {
private static Logger loggerInstance;
	
	private Logger() {
		// made the constructor private to prevent other classes from creating new objects using new 
	}
	
	public static Logger getInstance() {
		if(loggerInstance == null) {
			synchronized (Logger.class) {	// help to prevent multiple threads to access at the same time
				if(loggerInstance == null) {
					loggerInstance = new Logger();
				}
			}
		}
		return loggerInstance;
	}

	
}
