package lesson12.task1.Xml;

import main.lesson12.task1.helpers.XmlHelper;
import main.lesson12.task1.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class XmlSerializationTest {

    @Test
    public void houseToXmlTest() throws IOException {
        House originalHouse = new House().generate();
        String houseToXml = new XmlHelper().serialize(originalHouse);
        House houseFromXml = new XmlHelper().deserialize(houseToXml, House.class);
        Assertions.assertEquals(originalHouse, houseFromXml);
    }
}
