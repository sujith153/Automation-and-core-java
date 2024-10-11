package restAssuredFiles;

import static io.restassured.RestAssured.get;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class AppleSupportRest {

	@Test// TestNg annotation 
	public void testResponse() {
		Response res = get("https://support.apple.com");
		int code = res.getStatusCode();
		System.out.println("Status Code is: " + code);
		Assert.assertEquals(code, 200);
	}

	@Test
	public void testBody() {
		Response res = get("https://support.apple.com");
		String data = res.contentType().toString();
		System.out.println(data + "  Time taken: " + res.getTime());
	}

	@Test
	public void testAuthenticaton() {
		baseURI= "https://practicetestautomation.com/practice-test-login";
		int code = given().auth().preemptive().basic("student", "Password123").when()
				.get("https://practicetestautomation.com/logged-in-successfully/").getStatusCode();
		System.out.println(code);
//		JSONObject jas  = new JSONObject();
	}

	@Test
	public void authentication() {
		 // Set the base URI for the RESTful web service
        baseURI = "https://practicetestautomation.com";

        // Perform a GET request with Basic Authentication
        Response response = given()
                .auth().preemptive().basic("student", "Password123")
                .when()
                .get("/practice-test-login");

        // Print the status code of the response
        int statusCode = response.getStatusCode();
        System.out.println("Status Code: " + statusCode);

        // Print the response body for debugging
        System.out.println("Response Body: " + response.getBody().asString());

        // Perform a subsequent GET request to the success page if login is successful
        if (statusCode == 200) {
            Response successResponse = given()
                    .auth().preemptive().basic("student", "Password123")
                    .when()
                    .get("/logged-in-successfully/");

            // Print the status code of the success page response
            int successStatusCode = successResponse.getStatusCode();
            System.out.println("Success Page Status Code: " + successStatusCode);

            // Print the response body for the success page
            System.out.println("Success Page Response Body: " + successResponse.getBody().asString());
        } else {
            System.out.println("Authentication failed. Status code: " + statusCode);
        }
	}
}
