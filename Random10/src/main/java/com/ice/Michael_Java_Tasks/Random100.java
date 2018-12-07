package com.ice.Michael_Java_Tasks;

import java.util.Arrays;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.Random;

public class Random100{
	
	  private static final Logger logger = LogManager.getLogger(Random100.class);

	public static void main(String[] args) {
		int[] randomNum = new int[110];
		
		Random ran = new Random();
    	int q = 0;
    	int j =0;
        BasicConfigurator.configure();

		for(int i = 0; i <= 100; i++) {
    		int answer = ran.nextInt(100) + 1;
					randomNum[i] = answer;
					int element = randomNum[q];
					q++;
			         logger.info(j +" = "+ element);
			         j++;
		}
		
	    }
	}

