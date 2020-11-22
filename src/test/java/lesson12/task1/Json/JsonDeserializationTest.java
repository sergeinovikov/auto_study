package lesson12.task1.Json;

import main.lesson12.task1.helpers.JsonHelper;
import main.lesson12.task1.model.Flat;
import main.lesson12.task1.model.House;
import main.lesson12.task1.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonDeserializationTest {

    @Test
    public void roomFromJsonTest() throws IOException {
        String roomJsonFile = new String(Files.readAllBytes(Paths.get("1/src/main/lesson12/task1/inputFiles/room.json")), Charset.defaultCharset());
        Room roomFromJson = new JsonHelper().deserialize(roomJsonFile, Room.class);
        Assertions.assertTrue(roomFromJson.getWidth() == 6 && roomFromJson.getHeight() == 5);
    }

    @Test
    public void flatFromJsonTest() throws IOException {
        String flatJsonFile = new String(Files.readAllBytes(Paths.get("1/src/main/lesson12/task1/inputFiles/flat.json")), Charset.defaultCharset());
        Flat flatFromJson = new JsonHelper().deserialize(flatJsonFile, Flat.class);
        Assertions.assertTrue(flatFromJson.getRooms().size() == 3 && flatFromJson.getRooms()
                .stream()
                .allMatch(
                        room -> room.getWidth() >= 2 && room.getWidth() <= 6 &&
                                room.getHeight() >= 2 && room.getHeight() <= 5
                )
        );
    }

    @Test
    public void houseFromJsonTest() throws IOException {
        String houseJsonFile = new String(Files.readAllBytes(Paths.get("1/src/main/lesson12/task1/inputFiles/house.json")), Charset.defaultCharset());
        House houseFromJson = new JsonHelper().deserialize(houseJsonFile, House.class);
        Assertions.assertTrue(houseFromJson.getFlats().size() == 3 && houseFromJson.getFlats()
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
