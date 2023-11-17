package FileUtils;

import com.example.webshopbackend.domain.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONParser {
    public static List<Product> parseJsonFile(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Product> Products = objectMapper.readValue(new File(filePath), new TypeReference<>() {});

        return Products;
    }
}
