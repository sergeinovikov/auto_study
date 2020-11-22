package lesson12.task1.Xml;

import main.lesson12.task1.helpers.XmlHelper;
import main.lesson12.task1.model.Flat;
import main.lesson12.task1.model.House;
import main.lesson12.task1.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class XmlDeserializationTest {
    @Test
    public void roomFromXmlTest() throws IOException {
        String roomXmlFile = new String(Files.readAllBytes(Paths.get("1/src/main/lesson12/task1/inputFiles/room.xml")), Charset.defaultCharset());
        Room roomFromXml = new XmlHelper().deserialize(roomXmlFile, Room.class);
        Assertions.assertTrue(roomFromXml.getWidth() == 6 && roomFromXml.getHeight() == 5);
    }

    @Test
    public void flatFromXmlTest() throws IOException {
        String flatXmlFile = new String(Files.readAllBytes(Paths.get("1/src/main/lesson12/task1/inputFiles/flat.xml")), Charset.defaultCharset());
        Flat flatFromXml = new XmlHelper().deserialize(flatXmlFile, Flat.class);
        Assertions.assertTrue(flatFromXml.getRooms().size() == 3 && flatFromXml.getRooms()
                .stream()
                .allMatch(
                        room -> room.getWidth() >= 2 && room.getWidth() <= 6 &&
                                room.getHeight() >= 2 && room.getHeight() <= 5
                )
        );
    }

    @Test
    public void houseFromXmlTest() throws IOException {
        String houseXmlFile = new String(Files.readAllBytes(Paths.get("1/src/main/lesson12/task1/inputFiles/house.xml")), Charset.defaultCharset());
        House houseFromXml = new XmlHelper().deserialize(houseXmlFile, House.class);
        Assertions.assertTrue(houseFromXml.getFlats().size() == 3 && houseFromXml.getFlats()
                .stream()
                .allMatch(
                        flat -> flat.getRooms().size() >= 1 && flat.getRooms().size() <= 3 &&
                                flat.getRooms()
                                        .stream()
                                        .allMatch(
                                                room -> room.getWidth() >= 2 && room.getWidth() <= 5 &&
                                                        room.getHeight() >= 3 && room.getHeight() <= 8
                                        )
                )
        );
    }
}
