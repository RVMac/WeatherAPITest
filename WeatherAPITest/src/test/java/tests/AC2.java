package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataProvider.DataProviders;
import utilities.commonFunctions;


public class AC2 extends BaseClass{
	@Test(	dataProvider = "AC2_CorrectData",
			dataProviderClass = DataProviders.class
		 )
	
	void test_01_correctCity(String cityID, String countryCode, String stateCode, String cityName) {
		int statusCode = 200;
		commFunc.getCurrentWeatherCity(statusCode, cityID, countryCode, stateCode, cityName);
	}
	
	@Test(	dataProvider = "AC2_IncorrectData",
			dataProviderClass = DataProviders.class
		 )
	void test_02_incorrectCity(String incorrectCityID) {
		int statusCode = 204;
		commFunc.getCurrentWeatherStatusCode(incorrectCityID, statusCode);
	}
}
