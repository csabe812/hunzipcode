package com.github.csabe812.main;

import com.github.csabe812.service.ZipCodeService;

/**
 * Main class
 * 
 * @author csabe812
 *
 */
public class Main {

	/**
	 * Running main and testing it with some valid zipcodes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ZipCodeService s = new ZipCodeService();
		System.out.println(s.getAZipCodeWithCityByZipCode(6724));
		System.out.println(s.getAZipCodeWithCityByZipCode(5500));
		System.out.println(s.getAZipCodeWithCityByZipCode(5502));
		System.out.println(s.getAZipCodeWithCityByZipCode(5000));
		System.out.println(s.getAZipCodeWithCityByZipCode(5555));
		System.out.println(s.getAZipCodeWithCityByZipCode(5600));

	}

}
