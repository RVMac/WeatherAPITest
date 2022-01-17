package tests;

import org.testng.annotations.Test;

import dataProvider.DataProviders;


public class AC2 extends BaseClass{
	
	@Test(	dataProvider = "AC2_CorrectData",
			dataProviderClass = DataProviders.class
		 )
	
	void test_01_correctCity(int statusCode, String cityID, String countryCode, String stateCode, String cityName) {
		commFunc.getCurrentWeatherCity(statusCode, cityID, countryCode, stateCode, cityName);
	}
	
	@Test(	dataProvider = "AC2_IncorrectData",
			dataProviderClass = DataProviders.class
		 )
	void test_02_incorrectCity(int statusCode, String incorrectCityID) {
		commFunc.getCurrentWeatherStatusCode(incorrectCityID, statusCode);
	}
}
