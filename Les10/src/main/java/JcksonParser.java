import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class JcksonParser {
    public static void main(String[] args) {
        File jsonFile = new File("src/main/java/example.json");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
        JsonNode rootNode = objectMapper.readTree(jsonFile);
        //Чтение простых значений
        String name = rootNode.get("name").asText();
        //Чтение значений из массива
        ArrayNode phoneNumbers = (ArrayNode) rootNode.get("phoneNumbers");
        String phone1 = phoneNumbers.get(0).asText();
        //Чтение значений из объекта
        JsonNode address = rootNode.get("address");
        String street = address.get("street").asText();

        //Изменение объекта
        ((ObjectNode) address).put("city", "LA");

        //Удаление объекта
        ((ObjectNode) address).remove("email");

        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone1);
        System.out.println("Street: " + street);
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
