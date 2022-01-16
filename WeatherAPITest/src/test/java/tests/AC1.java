package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import dataProvider.ConfigReader;
import utilities.commonFunctions;
public class AC1 {
	commonFunctions commFunc = new commonFunctions();
	String Lat = "38.123";
	String Long = "-78.543";
	
	String incorrectLat = "x";
	String incorrectLong = "x";
	
	String missingLat = "";
	String missingLong = "";
	
	
	@Test
	void test_01_correctLatLong() {
		int resStatus = 200;
		commFunc.getWeatherLatLongStatusCode(Lat, Long, resStatus);
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
