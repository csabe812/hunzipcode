package com.github.csabe812.dto;

/**
 * This class represents a ZipCodeDTO It has three attribute In Hungary ZIPCODE
 * stans for 4 digits, starting at 1, for example: 1222, 5500, 6724, etc.
 * It is a DTO so no words needed:
 * 1) ZIPCODE: is the 4 digits
 * 2) CITYNAME: is the name of the city
 * 3) SUBCITYNAME: a city may have a subcity with another ZIPCODE, for example:
 * 		ZIPCODE -- CITYNAME -- SUBCITYNAME
 * 		5500	-- Gyomaendrőd -- Endrőd
 * 		5502	-- Gyomaendrőd -- Gyoma
 * @author csabe812
 *
 */
public class ZipCodeDTO {

	private int zipCode;
	private String cityName;
	private String subCityName;

	public ZipCodeDTO() {
	}

	public ZipCodeDTO(int zipCode) {
		this.zipCode = zipCode;
	}

	public ZipCodeDTO(int zipCode, String cityName, String subCityName) {
		super();
		this.zipCode = zipCode;
		this.cityName = cityName;
		this.subCityName = subCityName;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getSubCityName() {
		return subCityName;
	}

	public void setSubCityName(String subCityName) {
		this.subCityName = subCityName;
	}

	@Override
	public String toString() {
		return zipCode + " " + cityName + ((subCityName == null) ? "" : " - " + subCityName);
	}

}
