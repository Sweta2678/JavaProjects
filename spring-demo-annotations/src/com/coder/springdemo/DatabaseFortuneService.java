package com.coder.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	private String fileName = "C:/Users/sweta.khatsuriya/eclipse-workspace-2020/spring-demo-annotations/src/com/coder/springdemo/fortune.txt";
	private List<String> theFortunes;
	
	//random array 
	private Random randomFortune = new Random();
	
	public DatabaseFortuneService() {
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize array list
		theFortunes = new ArrayList<String>();
		
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String getFortune() {
		//pick up from the random array
		int index = randomFortune.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}
}
