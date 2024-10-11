package restAssuredFiles;

import static io.restassured.RestAssured.*;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestUtility {

    public static Response getRequest(String endpoint) {
        return 	given()
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response getRequestWithParams(String endpoint, Map<String, String> params) {
        return 	given()
                .params(params)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response getRequestWithHeaders(String endpoint, Map<String, String> headers) {
        return 	given()
                .headers(headers)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response postRequest(String endpoint, Map<String, String> headers, Object body) {
        return 	given()
                .headers(headers)
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response putRequest(String endpoint, Map<String, String> headers, Object body) {
        return RestAssured.given()
        		.headers(headers)
                .body(body)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response deleteRequest(String endpoint) {
        return 	given()
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response authenticatedRequest(String endpoint, String token) {
        return 	given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

}
