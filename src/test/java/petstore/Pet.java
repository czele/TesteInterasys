package petstore;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class Pet {
    String uri : "virtserver.swaggerhub.com/camilazele/pet/1.0.0";

    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));

        given()
                .contentType("apllication/json")
                .log().all()
                .body(jsonBody)
        .when()
    }
}
