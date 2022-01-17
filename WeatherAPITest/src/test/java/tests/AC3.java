package tests;

import org.testng.annotations.Test;

import dataProvider.DataProviders;
import utilities.commonFunctions;

public class AC3 {
	commonFunctions commFunc = new commonFunctions();
	String postalCode = "28546";
	String cityName = "Onslow";
	String CountryCode = "US";
	String StateCode = "NC";
	
	String incorrectPostalCode = "x";
	String missingPostalCode = "";
	
	@Test(	dataProvider = "AC3_CorrectData",
			dataProviderClass = DataProviders.class
		 )
	void test_01_correctPostalCode(int statusCode, String postalCode,  String cityName, String CountryCode, String StateCode) {
		commFunc.getAirQualityStatusCheckResponse(statusCode, postalCode, cityName, CountryCode, StateCode);
	}
	
	@Test(	dataProvider = "AC3_IncorrectData",
			dataProviderClass = DataProviders.class
		 )
	void test_02_invalidPostalCode(int statusCode, String incorrectPostalCode) {
		commFunc.getAirQualityStatusCode(incorrectPostalCode, statusCode);
	}
}
