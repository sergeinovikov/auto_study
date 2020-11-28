package main.lesson12.task2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Helper {

    public static String getJsonArrayFromXls(String path, String sheetName) {
        List<Map<String, String>> objectsFromExcel = extractObjectsFromExcel(path, sheetName);
        return new Gson().toJson(objectsFromExcel);
    }

    public static String getXmlFromXls(String path, String sheetName) throws JsonProcessingException {
        List<Map<String, String>> objectsFromExcel = extractObjectsFromExcel(path, sheetName);
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.writeValueAsString(objectsFromExcel);
    }

    private static List<Map<String, String>> extractObjectsFromExcel(String path, String sheetName) {
        List<Map<String, String>> objectsFromExcel = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(new File(path));
            Workbook workbook = new XSSFWorkbook(file);
            try {
                Sheet sheet = workbook.getSheet(sheetName);
                int index = 0;
                List<String> types = new ArrayList<>();
                DataFormatter dataFormatter = new DataFormatter(); //для форматирования полученного значения в String вне зависимости от заданного типа данных в таблице Excel

                for (Row currentRow : sheet) {
                    Map<String, String> sheetFields = new HashMap<>();
                    if (index == 0) {
                        for (int i = 0; i < currentRow.getLastCellNum(); i++) {
                            types.add(dataFormatter.formatCellValue(currentRow.getCell(i)));
                        }
                        index++;
                    } else {
                        for (int i = 0; i < currentRow.getLastCellNum(); i++) {
                            sheetFields.put(types.get(i), dataFormatter.formatCellValue(currentRow.getCell(i)));
                        }
                        objectsFromExcel.add(sheetFields);
                    }
                }
            } catch (Exception exception) {
                System.out.println("Указанный лист не найден");
                exception.printStackTrace();
                return null;
            }
        } catch (IOException exception) {
            System.out.println("Файл не найден");
            exception.printStackTrace();
            return null;
        }
        return objectsFromExcel;
    }
}
