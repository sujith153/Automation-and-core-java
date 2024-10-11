package com.selenium.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass {
	private Properties prop = new Properties();
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	private static UtilityClass util; // Singletomn Design

	private Map<String, String> testDataMapa = new HashMap<String, String>();

	private UtilityClass() {
		this.loadProperties();
		this.loadGlobalVariables();
		this.loadDrivers();
		this.loadTestDataMap();
	}

	public static UtilityClass getInstance() {
		if (util == null) {
			synchronized (UtilityClass.class) {
				if (util == null)
					util = new UtilityClass();
			}
		}
		return util;
	}

	private void loadProperties() {
		try {
			prop.load(new FileReader("src/test/resources/properties/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getProperty(String key) {
		return prop.getProperty(key);
	}

	public void loadGlobalVariables() {
		GlobalVariables.browserName = getProperty("browserName");
		GlobalVariables.timeout = Integer.parseInt(getProperty("timeout"));
		GlobalVariables.url = getProperty("url");
	}

	private void loadDrivers() {
		if ("firefox".equals(GlobalVariables.browserName)) {
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\dirvers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\dirvers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVariables.timeout));
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	public String getTestData(String key) {
		return testDataMapa.get(key);
	}

	public String getCellData(Cell cell) {
		String data = null;
		if (cell.getCellType() == CellType.NUMERIC)
			data = Double.toString(cell.getNumericCellValue());
		else
			data = cell.getStringCellValue();

		return data;
	}

	private void loadTestDataMap() {
		try {
//			FileInputStream file = new FileInputStream(new File("src\\test\\resources\\testData\\TestData.xlsx"));
			Workbook workbook = new XSSFWorkbook(
					new FileInputStream(new File("src\\test\\resources\\testData\\TestData.xlsx")));
			Sheet sheet = workbook.getSheet("Sheet1");
			Iterator<Row> iterator = sheet.iterator();

			while (iterator.hasNext()) {
				Row row = (Row) iterator.next();
				if (row.getRowNum() == 0)
					continue;
				testDataMapa.put(getCellData(row.getCell(0)), getCellData(row.getCell(1)));
			}
			workbook.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void takeScreenshot(String screenshotName) {
		try {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File file = screenshot.getScreenshotAs(OutputType.FILE);
			screenshotName = screenshotName + "_" + LocalDateTime.now().toString().replace(":", "-");
			FileUtils.copyFile(file, new File("src\\test\\resources\\screenshots\\" + screenshotName + ".png"));
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
