package com.github.csabe812.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.github.csabe812.dto.ZipCodeDTO;

/**
 * This class represents the service layer for the ZipCodeDTO
 * 
 * @author csabe812
 *
 */
public class ZipCodeService {

	private List<ZipCodeDTO> zipCodeWithCities;

	/**
	 * Default constructor for initializing the ArrayList<ZipCodeDTO>
	 */
	public ZipCodeService() {
		this.zipCodeWithCities = new ArrayList<ZipCodeDTO>();
		readAllZipCodeWithCities();
	}

	/**
	 * Constructor with a List<ZipCodeDTO> parameter
	 * 
	 * @param zipCodeWithCities
	 */
	public ZipCodeService(List<ZipCodeDTO> zipCodeWithCities) {
		this.zipCodeWithCities = zipCodeWithCities;
	}

	/**
	 * Reading and storing the data into the zipCodeWithCities object
	 */
	public void readAllZipCodeWithCities() {
		try {
			String FILE_NAME = "src\\main\\resources\\Iranyitoszam-Internet_uj.xlsx";

			FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet datatypeSheet = workbook.getSheetAt(0);
			Iterator<Row> iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();

				if (currentRow.getCell(0) != null && currentRow.getCell(0).getCellType() == CellType.NUMERIC) {
					ZipCodeDTO zipCodeDTO = new ZipCodeDTO((int) currentRow.getCell(0).getNumericCellValue());
					if (currentRow.getCell(1).getCellType() == CellType.STRING) {
						zipCodeDTO.setCityName(currentRow.getCell(1).getStringCellValue());
					}
					if (currentRow.getCell(2) != null && currentRow.getCell(2).getCellType() == CellType.STRING) {
						zipCodeDTO.setSubCityName(currentRow.getCell(2).getStringCellValue());
					}
					zipCodeWithCities.add(zipCodeDTO);
				}
			}
			datatypeSheet = workbook.getSheetAt(2);
			iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				if (currentRow.getCell(0) != null && currentRow.getCell(0).getCellType() == CellType.NUMERIC) {
					ZipCodeDTO zipCodeDTO = new ZipCodeDTO((int) currentRow.getCell(0).getNumericCellValue());
					zipCodeDTO.setCityName("Budapest");
					zipCodeWithCities.add(zipCodeDTO);
				}
			}
			datatypeSheet = workbook.getSheetAt(3);
			iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				if (currentRow.getCell(0) != null && currentRow.getCell(0).getCellType() == CellType.NUMERIC) {
					ZipCodeDTO zipCodeDTO = new ZipCodeDTO((int) currentRow.getCell(0).getNumericCellValue());
					zipCodeDTO.setCityName("Miskolc");
					zipCodeWithCities.add(zipCodeDTO);
				}
			}
			datatypeSheet = workbook.getSheetAt(4);
			iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				if (currentRow.getCell(0) != null && currentRow.getCell(0).getCellType() == CellType.NUMERIC) {
					ZipCodeDTO zipCodeDTO = new ZipCodeDTO((int) currentRow.getCell(0).getNumericCellValue());
					zipCodeDTO.setCityName("Debrecen");
					zipCodeWithCities.add(zipCodeDTO);
				}
			}
			datatypeSheet = workbook.getSheetAt(5);
			iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				if (currentRow.getCell(0) != null && currentRow.getCell(0).getCellType() == CellType.NUMERIC) {
					ZipCodeDTO zipCodeDTO = new ZipCodeDTO((int) currentRow.getCell(0).getNumericCellValue());
					zipCodeDTO.setCityName("Szeged");
					zipCodeWithCities.add(zipCodeDTO);
				}
			}
			datatypeSheet = workbook.getSheetAt(5);
			iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				if (currentRow.getCell(0) != null && currentRow.getCell(0).getCellType() == CellType.NUMERIC) {
					ZipCodeDTO zipCodeDTO = new ZipCodeDTO((int) currentRow.getCell(0).getNumericCellValue());
					zipCodeDTO.setCityName("Pécs");
					zipCodeWithCities.add(zipCodeDTO);
				}
			}
			datatypeSheet = workbook.getSheetAt(5);
			iterator = datatypeSheet.iterator();
			while (iterator.hasNext()) {
				Row currentRow = iterator.next();
				if (currentRow.getCell(0) != null && currentRow.getCell(0).getCellType() == CellType.NUMERIC) {
					ZipCodeDTO zipCodeDTO = new ZipCodeDTO((int) currentRow.getCell(0).getNumericCellValue());
					zipCodeDTO.setCityName("Győr");
					zipCodeWithCities.add(zipCodeDTO);
				}
			}
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Printing all the Zipcode-City-Subcity trio
	 */
	public void printAllZipCodeWithCitites() {
		for (ZipCodeDTO zipCodeDTO : zipCodeWithCities) {
			zipCodeDTO.toString();
		}
	}

	/**
	 * Getting a ZipCodeDTO object by zipcode
	 * 
	 * @param zipcode given zipcode
	 * @return a ZipCodeDTO which was found by zipcode (null if nothing was found)
	 */
	public ZipCodeDTO getAZipCodeWithCityByZipCode(int zipcode) {
		for (ZipCodeDTO zipCodeDTO : zipCodeWithCities) {
			if (zipCodeDTO.getZipCode() == zipcode) {
				return zipCodeDTO;
			}
		}
		return null;
	}

}
