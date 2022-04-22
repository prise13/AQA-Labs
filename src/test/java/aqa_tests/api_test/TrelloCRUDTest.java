package aqa_tests.api_test;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;

public class TrelloCRUDTest {
    private final String API_KEY = "5f48e7f3a95e47829652a5faeccb0c6e";
    private final String API_TOKEN = "98ac009d3cb51670c6fd84fbfda5fed6ac342ddfe33b54a7043e0335787e355c";
    private String boardName;
    private final String ORGANIZATION_ID = "6262eef88834e05ca232a516";
    private String boardID;

    @BeforeTest
    void init() {
        boardName = UUID.randomUUID().toString();
    }


    // Create board
    @Test(priority = 1)
    void createTest() {
        Response response = given()
                .when()
                .contentType("application/json")
                .body(String.format("{\"idOrganization\":\"%s\"}", ORGANIZATION_ID))
                .post(String.format("https://api.trello.com/1/boards/?name=%s&key=%s&token=%s", boardName, API_KEY, API_TOKEN));

        response
                .then()
                .assertThat()
                .statusCode(200);

        boardID = response.getBody().jsonPath().get("id");
    }

    // Get board
    @Test(priority = 2)
    void getBoard() {
        if (boardID == null) {
            Assert.fail("Board id is null, make sure you ran first test");
        }

        given()
                .when()
                .pathParam("id", boardID)
                .get(String.format("https://api.trello.com/1/boards/{id}?key=%s&token=%s", API_KEY, API_TOKEN))
                .then()
                .assertThat()
                .statusCode(200);

    }

    // Update board
    @Test(priority = 3)
    void updateBoard() {
        if (boardID == null) {
            Assert.fail("Board id is null, make sure you ran first test");
        }

        given()
                .when()
                .queryParam("name", "Changed Board Name")
                .pathParam("id", boardID)
                .put(String.format("https://api.trello.com/1/boards/{id}?key=%s&token=%s", API_KEY, API_TOKEN))
                .then()
                .assertThat()
                .statusCode(200);

    }

    // Delete board
    @Test(priority = 4)
    void deleteBoard() {
        if (boardID == null) {
            Assert.fail("Board id is null, make sure you ran first test");
        }

        given()
                .when()
                .pathParam("id", boardID)
                .delete(String.format("https://api.trello.com/1/boards/{id}?key=%s&token=%s", API_KEY, API_TOKEN))
                .then()
                .assertThat()
                .statusCode(200);
    }
}
