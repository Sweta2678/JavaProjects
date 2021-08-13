package com.code.springmvcdemo.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.springframework.lang.NonNull;

public class Student {
	
	private String firstName;
	
	private String lastName;
	private String country;
	private LinkedHashMap<String,String> countryOptions;
	private String favouriteLanguage;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private String[] operatingSystem;
	
	public Student() {
		//populate country options : used ISO country code
		
		  countryOptions = new LinkedHashMap<>();
		  
		  countryOptions.put("IN", "India"); countryOptions.put("US",
		  "United States of America"); countryOptions.put("UK", "United Kingdom");
		  countryOptions.put("UAE", "United Aram Emirates"); countryOptions.put("AU",
		  "Australia"); countryOptions.put("NZ", "NewZeland");
		 
		  favoriteLanguageOptions = new LinkedHashMap<>();
		  favoriteLanguageOptions.put("Java", "Java");
		  favoriteLanguageOptions.put("C#","C#");
		  favoriteLanguageOptions.put("PHP","PHP");
		  favoriteLanguageOptions.put("Ruby","Ruby");
		  favoriteLanguageOptions.put("Python","Python");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
}
