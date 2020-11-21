package lesson11.task4;

import main.lesson11.task4.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ImportPersonsTest {
    private final String path = "1/src/main/lesson11/task4/input/persons.xlsx";

    @Test
    public void importFirstSheetTest() {
        String firstSheetName = "Persons1";
        List<Person> result = FileHelper.getPersonsFromExcel(path, firstSheetName);
        assert result != null;
        Assertions.assertEquals(6, result.size());
    }

    @Test
    public void importSecondSheetTest() {
        String secondSheetName = "Persons2";
        List<Person> result = FileHelper.getPersonsFromExcel(path, secondSheetName);
        assert result != null;
        Assertions.assertEquals(5, result.size());
    }

    @Test
    public void importNonExistentSheetTest() {
        String nonExistenSheetName = "Persons3";
        List<Person> result = FileHelper.getPersonsFromExcel(path, nonExistenSheetName);
        Assertions.assertNull(result);
    }
}
