package com.ice.Michael_Java_Tasks;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class TwoFunctions {
	
	private static final Logger logger = LogManager.getLogger(TwoFunctions.class);
	  
	public static void main(String[] args) {

	hello();

	}

	private static String hello() {

        BasicConfigurator.configure();
    	logger.info("Hello");
    	
    	world();
		return null;
	}

	private static String world() {

    	logger.info("World");
		return null;

	}
}
