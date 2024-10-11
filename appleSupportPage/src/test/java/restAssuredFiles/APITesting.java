package restAssuredFiles;

import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class APITesting extends RestUtility {

	@Test
	public void testResponse() {
		baseURI = "https://reqres.in/api";
		Response res = getRequest("/users?page=2");
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
		System.out.println(res.asPrettyString());
		System.out.println(res.getStatusLine());
		System.out.println(res.getHeader("Content-Type"));
	}

	@Test
	public void testData() {
		baseURI = "https://reqres.in/api";
		Response res = getRequest("/users?page=2");
		res.then().statusCode(200).body("data.id", hasItems(8,7));
		System.out.println(res.asPrettyString());
		
	}

}
