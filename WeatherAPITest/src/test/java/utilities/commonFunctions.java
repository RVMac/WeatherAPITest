package utilities;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import dataProvider.ConfigReader;

public class commonFunctions {
	
	public void getWeatherLatLongStatusCode(String Lat, String Long, int Status) {
		baseURI = ConfigReader.getInstance().getBaseUrl();
		String KEY = ConfigReader.getInstance().getAPIKey();
		
		Response response = given().get("/current?lat=" + Lat + "&lon=" + Long + "&key="+KEY+"");
		int StatusCode = response.getStatusCode();
		Assert.assertEquals(Status, StatusCode);
		
	}
	
	public void getAirQualityStatusCode(String postalCode, int Status) {
		baseURI = ConfigReader.getInstance().getBaseUrl();
		String KEY = ConfigReader.getInstance().getAPIKey();
		
		Response response = given().get("/forecast/airquality?postal_code="+postalCode+"&key="+KEY);
		int StatusCode = response.getStatusCode();
		
		Assert.assertEquals(Status, StatusCode);
	}

}
