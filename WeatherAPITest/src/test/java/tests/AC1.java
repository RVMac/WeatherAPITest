package tests;

import org.testng.annotations.Test;

import dataProvider.DataProviders;
public class AC1 extends BaseClass {
	
	@Test(	dataProvider = "AC1_CorrectData",
			dataProviderClass = DataProviders.class
		 )
	void test_01_correctLatLong(int resStatus, String Long, String Lat, String CountryCode, String stateCode, String cityName) {
		commFunc.getCurrentWeatherLatLongCheckLatLongResponse(resStatus, Long, Lat, CountryCode, stateCode, cityName);
	}
	
	@Test(	dataProvider = "AC1_IncorrectData",
			dataProviderClass = DataProviders.class
		 )
	void test_02_invalidLatLong(String Lat, String Long, int resStatus) {
		commFunc.getWeatherLatLongStatusCode(Lat, Long, resStatus);
	}
}
