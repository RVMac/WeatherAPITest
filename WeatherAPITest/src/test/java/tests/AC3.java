package tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import utilities.commonFunctions;

public class AC3 {
	commonFunctions commFunc = new commonFunctions();
	String postalCode = "28546";
	String incorrectPostalCode = "x";
	String missingPostalCode = "";
	
	@Test
	void test_01_correctPostalCode() {
		int statusCode = 200;
		commFunc.getAirQualityStatusCode(postalCode, statusCode);
	}
	
	@Test
	void test_02_invalidPostalCode() {
		int statusCode = 204;
		commFunc.getAirQualityStatusCode(incorrectPostalCode, statusCode);
	}
	
	@Test
	void test_02_missingPostalCode() {
		int statusCode = 400;
		commFunc.getAirQualityStatusCode(missingPostalCode, statusCode);
	}
}