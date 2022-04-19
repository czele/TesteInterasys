package petstore;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class Pet {
    String uri = "https://petstore.swagger.io";

    public String lerJson(String caminhoJson) throws IOException {
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }

        @Test
        public void IncluirPet(){
            String jsonBody = lerJson("db/pet1.json");
        }

    }
}
