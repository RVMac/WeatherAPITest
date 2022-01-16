package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import utilities.commonFunctions;

public class Test03_AC3 {
	commonFunctions commFunc = new commonFunctions();

	@Test
	void test_01_correctPostalCode() {
		String postalCode = "28546";
		int statusCode = 200;
		
		commFunc.getAirQualityStatusCode(postalCode, statusCode);
	}
	
	@Test
	void test_02_invalidPostalCode() {
		String postalCode = "x";
		int statusCode = 204;
		
		commFunc.getAirQualityStatusCode(postalCode, statusCode);
	}
	
	@Test
	void test_02_missingPostalCode() {
		String postalCode = "";
		int statusCode = 400;
		
		commFunc.getAirQualityStatusCode(postalCode, statusCode);
	}
}
