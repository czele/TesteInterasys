package petstore;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pet {
    String uri : "virtserver.swaggerhub.com/camilazele/pet/1.0.0";

    public String lerJson(String caminhoJson){
        return new String(Files.readAllBytes(Paths.get(caminhoJson)));
    }
}
