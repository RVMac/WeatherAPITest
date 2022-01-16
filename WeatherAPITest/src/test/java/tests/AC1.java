package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.commonFunctions;
public class AC1 extends BaseClass {
	
	String Long = "-78.543";
	String Lat = "38.123";
	String CountryCode = "US";
	String stateCode = "VA";
	String cityName = "Free Union";
	
	String incorrectLat = "x";
	String incorrectLong = "x";
	
	String missingLat = "";
	String missingLong = "";
	
	
	@Test
	void test_01_correctLatLong() {
		int resStatus = 200;
		commFunc.getCurrentWeatherLatLongCheckLatLongResponse(resStatus, Long, Lat, CountryCode, stateCode, cityName);
	}
	
	@Test
	void test_02_invalidLatLong() {
		int resStatus = 400;
		commFunc.getWeatherLatLongStatusCode(incorrectLat, incorrectLong, resStatus);
	}
	
	@Test
	void test_03_invalidLong() {
		int resStatus = 400;
		commFunc.getWeatherLatLongStatusCode(Lat, incorrectLong, resStatus);
	}
	
	@Test
	void test_04_invalidLat() {
		int resStatus = 400;
		commFunc.getWeatherLatLongStatusCode(incorrectLat, Long, resStatus);
	}
	
	@Test
	void test_05_LatOnly() {
		int resStatus = 400;
		commFunc.getWeatherLatLongStatusCode(Lat, missingLong, resStatus);
	}
	
	@Test
	void test_05_LongOnly() {
		int resStatus = 400;
		commFunc.getWeatherLatLongStatusCode(missingLat, Long, resStatus);
	}
	
	@Test
	void test_06_NoLatLong() {
		int resStatus = 400;
		commFunc.getWeatherLatLongStatusCode(missingLat, missingLong, resStatus);
	}
}
