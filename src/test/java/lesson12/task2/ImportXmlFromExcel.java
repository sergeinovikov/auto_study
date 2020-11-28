package lesson12.task2;

import com.fasterxml.jackson.core.JsonProcessingException;
import main.lesson12.task2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImportXmlFromExcel {
    private final String path = "1/src/main/lesson12/task2/data.xlsx";
    private String sheetName;

    @Test
    public void importXml_firstSheet() throws JsonProcessingException {
        sheetName = "users";
        String xmlObject = Helper.getXmlFromXls(path, sheetName);
        String originalXml = "<ArrayList><item><updated_on>2020-09-26 23:07:34</updated_on><user_id>6</user_id><created_on>2020-09-26 23:07:34</created_on><action>api</action><id>10</id><value>6218bbecc4dec9fce01dd1b7f26cef55e9c4dfb4</value></item><item><updated_on>2020-09-26 23:08:23</updated_on><user_id>6</user_id><created_on>2020-09-26 23:08:23</created_on><action>feeds</action><id>12</id><value>b6cfe70e7a4ee8e8cef07c9df60b6228639bb553</value></item><item><updated_on>2020-09-26 22:49:29</updated_on><user_id>1</user_id><created_on>2020-09-26 22:48:56</created_on><action>session</action><id>2</id><value>751e032dcc4b5b219efb7f72b608b9063a595509</value></item><item><updated_on>2020-09-26 22:50:30</updated_on><user_id>1</user_id><created_on>2020-09-26 22:50:30</created_on><action>session</action><id>4</id><value>1a0e210e0a8e1f63a96ea2d4326a48346a6dff74</value></item></ArrayList>";
        Assertions.assertEquals(originalXml, xmlObject);
    }

    @Test
    public void importXml_secondSheet() throws JsonProcessingException {
        sheetName = "projects";
        String xmlObject = Helper.getXmlFromXls(path, sheetName);
        String originalXml = "<ArrayList><item><name>Тестовый проект</name><is_public>true</is_public><description>дескрипшен</description><id>1</id><homepage>нет</homepage></item><item><name>Тестовый проект 2</name><is_public>false</is_public><description>дескрипшен 2</description><id>2</id><homepage>нет</homepage></item><item><name>Тестовый проект public</name><is_public>true</is_public><description>public</description><id>4</id><homepage>нет</homepage></item><item><name>Тестовый проект private</name><is_public>false</is_public><description>private</description><id>5</id><homepage>нет</homepage></item></ArrayList>";
        Assertions.assertEquals(originalXml, xmlObject);
    }

    @Test
    public void importXml_thirdSheet() throws JsonProcessingException {
        sheetName = "roles";
        String xmlObject = Helper.getXmlFromXls(path, sheetName);
        String originalXml = "<ArrayList><item><is_assignable>true</is_assignable><builtin>1</builtin><name>Non member</name><id>1</id><position>0</position></item><item><is_assignable>true</is_assignable><builtin>2</builtin><name>Anonymous</name><id>2</id><position>0</position></item><item><is_assignable>true</is_assignable><builtin>0</builtin><name>new_role</name><id>3</id><position>1</position></item></ArrayList>";
        Assertions.assertEquals(originalXml, xmlObject);
    }

}
