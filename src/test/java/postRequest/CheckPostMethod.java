package postRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CheckPostMethod {

	Response response = null;
	@Test
	public void test1() {
		RestAssured.baseURI = "https://70ssu4a992.execute-api.us-west-2.amazonaws.com";
		JSONObject request = new JSONObject();

		request.put("id", "125");
		request.put("name", "abc");



		response = RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(request.toJSONString()).when()
				.post("/items");
		System.out.println(response.getBody().asString());
		int statusCode = response.getStatusCode();
		System.out.println(response.getStatusCode());

	}

	@Test
	public void test2() {
		RestAssured.baseURI = "https://9im32ep0x3.execute-api.us-east-2.amazonaws.com/test/execute";
		JSONObject request = new JSONObject();

		request.put("number", "125");

		response = RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(request.toJSONString()).when().post();
		System.out.println(response.getBody().asString());
		int statusCode = response.getStatusCode();
		System.out.println(response.getStatusCode());

	}
}
