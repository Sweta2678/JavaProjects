package com.coder.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create array of strings 
			private String[] data = {
					"Beware" , 
					"Bad luck",
					"Good Luck"
			};
	
	//create a random number generator
	private Random myRandom = new Random();
			
	@Override
	public String getFortune() {
		//pick a random array  
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
