package utilities;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;

import org.testng.Assert;

import dataProvider.ConfigReader;

public class commonFunctions {
	
	public void getWeatherLatLongStatusCode(String Lat, String Long, int Status) {
		baseURI = ConfigReader.getInstance().getBaseUrl();
		String KEY = ConfigReader.getInstance().getAPIKey();
		
		Response response = given()
								.queryParam("lat", Lat)
								.queryParam("lon", Long)
								.queryParam("key", KEY)
								.get("/current");
		int StatusCode = response.getStatusCode();
		System.out.print(response.getBody().asPrettyString());
		Assert.assertEquals(Status, StatusCode);
	}
	
	public void getCurrentWeatherLatLongCheckLatLongResponse(int resStatus, String Long, String Lat, String CountryCode, String stateCode, String cityName) {
		baseURI = ConfigReader.getInstance().getBaseUrl();
		String KEY = ConfigReader.getInstance().getAPIKey();
		
		given()
			.queryParam("lat", Lat)
			.queryParam("lon", Long)
			.queryParam("key", KEY)
			.get("/current").
		then()
			.statusCode(resStatus)
			.body("data[0].country_code", equalTo(CountryCode))
			.body("data[0].state_code", equalTo(stateCode))
			.body("data[0].city_name", equalTo(cityName));
		
		Response response = given()
								.queryParam("lat", Lat)
								.queryParam("lon", Long)
								.queryParam("key", KEY)
								.get("/current");
		System.out.println(response.getBody().asPrettyString());
	}
	
	public void getCurrentWeatherCity(int resStatus, String cityID, String CountryCode, String stateCode, String CityName) {
		baseURI = ConfigReader.getInstance().getBaseUrl();
		String KEY = ConfigReader.getInstance().getAPIKey();
		given()
			.queryParam("city_id", cityID)
			.queryParam("key", KEY)
			.get("/current").
		then()
			.statusCode(resStatus)
			.body("data[0].country_code", equalTo(CountryCode))
			.body("data[0].state_code", equalTo(stateCode))
			.body("data[0].city_name", equalTo(CityName));
		
		Response response = given()
			.queryParam("city_id", cityID)
			.queryParam("key", KEY)
			.get("/current");
		
		System.out.println(response.getBody().asPrettyString());
	}
	
	public void getCurrentWeatherStatusCode(String cityID, int resStatus) {
		baseURI = ConfigReader.getInstance().getBaseUrl();
		String KEY = ConfigReader.getInstance().getAPIKey();
		
		given()
			.queryParam("city_id", cityID)
			.queryParam("key", KEY)
			.get("/current").
		then()
			.statusCode(resStatus);
		
		Response response = given()
				.queryParam("city_id", cityID)
				.queryParam("key", KEY)
				.get("/current");
			
		System.out.println(response.getBody().asPrettyString());
	}
	
	public void getAirQualityStatusCode(String postalCode, int Status) {
		baseURI = ConfigReader.getInstance().getBaseUrl();
		String KEY = ConfigReader.getInstance().getAPIKey();
		
		Response response = given()
								.queryParam("postal_code", postalCode)
								.queryParam("key", KEY)
								.get("/forecast/airquality");
		int StatusCode = response.getStatusCode();
		
		Assert.assertEquals(Status, StatusCode);
		System.out.println(response.getBody().asPrettyString());
	}
	
	public void getAirQualityStatusCheckResponse(int resStatus,String postalCode, String cityName, String CountryCode, String stateCode) {
		baseURI = ConfigReader.getInstance().getBaseUrl();
		String KEY = ConfigReader.getInstance().getAPIKey();
		
		given()
			.queryParam("postal_code", postalCode)
			.queryParam("key", KEY)
			.get("/forecast/airquality").
		then()
			.statusCode(resStatus)
			.body("city_name", equalTo(cityName))
			.body("country_code", equalTo(CountryCode))
			.body("state_code", equalTo(stateCode));
		
		Response response = given()
									.queryParam("postal_code", postalCode)
									.queryParam("key", KEY)
									.get("/forecast/airquality");
		System.out.println(response.getBody().asPrettyString());
	}

}
