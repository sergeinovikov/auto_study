package lesson12.task1.Json;

import main.lesson12.task1.helpers.JsonHelper;
import main.lesson12.task1.helpers.XmlHelper;
import main.lesson12.task1.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JsonSerializationTest {
    @Test
    public void houseToJsonTest() {
        House originalHouse = new House().generate();
        String houseToJson = new JsonHelper().serialize(originalHouse);
        House houseFromJson = new JsonHelper().deserialize(houseToJson, House.class);
        Assertions.assertEquals(originalHouse, houseFromJson);
    }
}
