package deleteMethod;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CheckDeleteMethod {
	@Test
	public void test1() {
		RestAssured.baseURI = "https://70ssu4a992.execute-api.us-west-2.amazonaws.com";

		Response response = null;
		response = RestAssured.given().when().delete("/items/125");

		System.out.println("Response is :\n" + response.getBody().asString());
		System.out.println(response.getHeader("content-type"));
		int statusCode = response.getStatusCode();
		System.out.println(response.getStatusCode());
	}
}
