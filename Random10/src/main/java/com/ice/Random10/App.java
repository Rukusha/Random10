package com.ice.Random10;

import java.util.Random;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App {

	  private static final Logger logger = LogManager.getLogger(App.class);

		public static void main(String[] args) {
			
			int[] randomNum = new int[12];
			Random ran = new Random();
			int i = 0;
	         BasicConfigurator.configure();

			while(i < 10) {
				i++;
	    		int answer = ran.nextInt(10) + 1;
						randomNum[i] = answer;
						int element = randomNum[i];
				         logger.info(element);
					    }
			}
}
