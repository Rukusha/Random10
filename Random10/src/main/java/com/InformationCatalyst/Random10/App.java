package com.InformationCatalyst.Random10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);

		public static void main(String[] args) {
			
			int[] randomNum = new int[12];
			Random ran = new Random();
			int i = 0;
			
			while(i < 10) {
				i++;
	    		int answer = ran.nextInt(10) + 1;
						randomNum[i] = answer;
						int element = randomNum[i];
						String numberAsString = String.valueOf(element);
				         logger.info(numberAsString);
					    }
			}
}
