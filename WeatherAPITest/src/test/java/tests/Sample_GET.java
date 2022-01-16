package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Sample_GET {
	
	@Test
	void test_01() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.print(response.asPrettyString());
		System.out.print(response.getBody().asPrettyString());
		System.out.print(response.getStatusCode());
		System.out.print(response.getStatusLine());
		System.out.print(response.getHeader("content-type"));
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	void test_02() {
		
		baseURI="https://reqres.in/api";
		given()
			.get("/users?page=2")
		.then()
			.statusCode(200)
			.body("data[0].id", equalTo(7));
	}
}
