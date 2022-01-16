package tests;

import org.testng.annotations.Test;

import utilities.commonFunctions;

public class AC2 extends BaseClass{
	String cityID = "4487042";
	String countryCode = "US";
	String stateCode = "NC";
	String cityName = "Raleigh";
	
	String incorrectCityID = "9999999";
	@Test
	void test_01_correctCity() {
		int statusCode = 200;
		commFunc.getCurrentWeatherCity(statusCode, cityID, countryCode, stateCode, cityName);
	}
	
	@Test
	void test_02_incorrectCity() {
		int statusCode = 204;
		commFunc.getCurrentWeatherStatusCode(incorrectCityID, statusCode);
	}
}
