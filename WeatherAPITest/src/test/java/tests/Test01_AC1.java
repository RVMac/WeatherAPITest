package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import dataProvider.ConfigReader;
import utilities.commonFunctions;
public class Test01_AC1 {
	commonFunctions commFunc = new commonFunctions();
	
	@Test
	void test_01_correctLatLong() {
		String Lat = "38.123";
		String Long = "-78.543";
		int resStatus = 200;
		
		commFunc.getWeatherLatLongStatusCode(Lat, Long, resStatus);
	}
	
	@Test
	void test_02_invalidLatLong() {
		String incorrectLat = "x";
		String incorrectLong = "x";
		int resStatus = 400;
		
		commFunc.getWeatherLatLongStatusCode(incorrectLat, incorrectLong, resStatus);
	}
	
	@Test
	void test_03_invalidLong() {
		String Lat = "38.123";
		String incorrectLong = "x";
		int resStatus = 400;
		
		commFunc.getWeatherLatLongStatusCode(Lat, incorrectLong, resStatus);
	}
	
	@Test
	void test_04_invalidLat() {
		String incorrectLat = "x";
		String Long = "-78.543";
		int resStatus = 400;
		
		commFunc.getWeatherLatLongStatusCode(incorrectLat, Long, resStatus);
	}
	
	@Test
	void test_05_LatOnly() {
		String Lat = "38.123";
		String Long = "";
		int resStatus = 400;
		
		commFunc.getWeatherLatLongStatusCode(Lat, Long, resStatus);
	}
	
	@Test
	void test_05_LongOnly() {
		String Lat = "";
		String Long = "-78.543";
		int resStatus = 400;
		
		commFunc.getWeatherLatLongStatusCode(Lat, Long, resStatus);
	}
	
	@Test
	void test_06_NoLatLong() {
		String Lat = "";
		String Long = "";
		int resStatus = 400;
		
		commFunc.getWeatherLatLongStatusCode(Lat, Long, resStatus);
	}
}
