package lesson12.task2;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import main.lesson12.task2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImportJsonFromExcel {
    private final String path = "1/src/main/lesson12/task2/data.xlsx";
    private String sheetName;

    @Test
    public void importJson_firstSheet() {
        sheetName = "users";
        String jsonObject = Helper.getJsonArrayFromXls(path, sheetName);
        JsonElement element = JsonParser.parseString(jsonObject); //пришлось подглядеть, сложновто было в сравнении Assertions
        JsonArray array = (JsonArray) element;

        Assertions.assertEquals(4, array.size());

        for (int i = 0; i < array.size(); i++) { //в работе кода разобрался
            JsonObject object = array.get(i).getAsJsonObject();
            switch (object.get("id").getAsString()) {
                case "10":
                    Assertions.assertEquals("api", object.get("action").getAsString());
                    Assertions.assertEquals("2020-09-26 23:07:34", object.get("created_on").getAsString());
                    Assertions.assertEquals("2020-09-26 23:07:34", object.get("updated_on").getAsString());
                    Assertions.assertEquals("6", object.get("user_id").getAsString());
                    Assertions.assertEquals("6218bbecc4dec9fce01dd1b7f26cef55e9c4dfb4", object.get("value").getAsString());
                    break;
                case "12":
                    Assertions.assertEquals("feeds", object.get("action").getAsString());
                    Assertions.assertEquals("2020-09-26 23:08:23", object.get("created_on").getAsString());
                    Assertions.assertEquals("2020-09-26 23:08:23", object.get("updated_on").getAsString());
                    Assertions.assertEquals("6", object.get("user_id").getAsString());
                    Assertions.assertEquals("b6cfe70e7a4ee8e8cef07c9df60b6228639bb553", object.get("value").getAsString());
                    break;
                case "2":
                    Assertions.assertEquals("session", object.get("action").getAsString());
                    Assertions.assertEquals("2020-09-26 22:48:56", object.get("created_on").getAsString());
                    Assertions.assertEquals("2020-09-26 22:49:29", object.get("updated_on").getAsString());
                    Assertions.assertEquals("1", object.get("user_id").getAsString());
                    Assertions.assertEquals("751e032dcc4b5b219efb7f72b608b9063a595509", object.get("value").getAsString());
                    break;
                case "4":
                    Assertions.assertEquals("session", object.get("action").getAsString());
                    Assertions.assertEquals("2020-09-26 22:50:30", object.get("created_on").getAsString());
                    Assertions.assertEquals("2020-09-26 22:50:30", object.get("updated_on").getAsString());
                    Assertions.assertEquals("1", object.get("user_id").getAsString());
                    Assertions.assertEquals("1a0e210e0a8e1f63a96ea2d4326a48346a6dff74", object.get("value").getAsString());
                    break;
                default:
                    Assertions.fail("Такого id не было в примере в Excel-документе");
            }
        }
    }

    @Test
    public void importJson_secondSheet() {
        sheetName = "projects";
        String jsonObject = Helper.getJsonArrayFromXls(path, sheetName);
        JsonElement element = JsonParser.parseString(jsonObject);
        JsonArray array = (JsonArray) element;

        Assertions.assertEquals(4, array.size());

        for (int i = 0; i < array.size(); i++) {
            JsonObject object = array.get(i).getAsJsonObject();
            switch (object.get("id").getAsString()) {
                case "1":
                    Assertions.assertEquals("Тестовый проект", object.get("name").getAsString());
                    Assertions.assertEquals("дескрипшен", object.get("description").getAsString());
                    Assertions.assertEquals("нет", object.get("homepage").getAsString());
                    Assertions.assertEquals("true", object.get("is_public").getAsString());
                    break;
                case "2":
                    Assertions.assertEquals("Тестовый проект 2", object.get("name").getAsString());
                    Assertions.assertEquals("дескрипшен 2", object.get("description").getAsString());
                    Assertions.assertEquals("нет", object.get("homepage").getAsString());
                    Assertions.assertEquals("false", object.get("is_public").getAsString());
                    break;
                case "4":
                    Assertions.assertEquals("Тестовый проект public", object.get("name").getAsString());
                    Assertions.assertEquals("public", object.get("description").getAsString());
                    Assertions.assertEquals("нет", object.get("homepage").getAsString());
                    Assertions.assertEquals("true", object.get("is_public").getAsString());
                    break;
                case "5":
                    Assertions.assertEquals("Тестовый проект private", object.get("name").getAsString());
                    Assertions.assertEquals("private", object.get("description").getAsString());
                    Assertions.assertEquals("нет", object.get("homepage").getAsString());
                    Assertions.assertEquals("false", object.get("is_public").getAsString());
                    break;
                default:
                    Assertions.fail("Такого id не было в примере в Excel-документе");
            }
        }
    }

    @Test
    public void importJson_thirdSheet() {
        sheetName = "roles";
        String jsonObject = Helper.getJsonArrayFromXls(path, sheetName);
        JsonElement element = JsonParser.parseString(jsonObject);
        JsonArray array = (JsonArray) element;

        Assertions.assertEquals(3, array.size());

        for (int i = 0; i < array.size(); i++) {
            JsonObject object = array.get(i).getAsJsonObject();
            switch (object.get("id").getAsString()) {
                case "1":
                    Assertions.assertEquals("Non member", object.get("name").getAsString());
                    Assertions.assertEquals("0", object.get("position").getAsString());
                    Assertions.assertEquals("true", object.get("is_assignable").getAsString());
                    Assertions.assertEquals("1", object.get("builtin").getAsString());
                    break;
                case "2":
                    Assertions.assertEquals("Anonymous", object.get("name").getAsString());
                    Assertions.assertEquals("0", object.get("position").getAsString());
                    Assertions.assertEquals("true", object.get("is_assignable").getAsString());
                    Assertions.assertEquals("2", object.get("builtin").getAsString());
                    break;
                case "3":
                    Assertions.assertEquals("new_role", object.get("name").getAsString());
                    Assertions.assertEquals("1", object.get("position").getAsString());
                    Assertions.assertEquals("true", object.get("is_assignable").getAsString());
                    Assertions.assertEquals("0", object.get("builtin").getAsString());
                    break;
                default:
                    Assertions.fail("Такого id не было в примере в Excel-документе");
            }
        }
    }
}
