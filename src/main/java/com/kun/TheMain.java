package com.kun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheMain {
	private static Logger logger = LoggerFactory.getLogger(TheMain.class);
	private static Logger runningLogger = LoggerFactory.getLogger("runningLog");
	private static Logger failLogger = LoggerFactory.getLogger("failLog");
	private static Logger reqLogger = LoggerFactory.getLogger("RequestLog");
	private static Logger respLogger = LoggerFactory.getLogger("ResponseLog");

	public static void main(String[] args) {
		logger.info("The executable jar is running...");
	}
}
