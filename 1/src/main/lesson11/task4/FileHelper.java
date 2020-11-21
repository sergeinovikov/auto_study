package main.lesson11.task4;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileHelper {
    public static List<Person> getPersonsFromExcel(String path, String sheetName) {
        List<Person> personsFromExcel = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(new File(path));
            Workbook workbook = new XSSFWorkbook(file);
            try {
                Sheet sheet = workbook.getSheet(sheetName);
                for (Row currentRow : sheet) {
                    try {
                        DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                        Date birthDate = format.parse(currentRow.getCell(3).getStringCellValue());
                        String firstName = currentRow.getCell(0).getStringCellValue();
                        String lastName = currentRow.getCell(1).getStringCellValue();
                        String patronymicName = currentRow.getCell(2).getStringCellValue();
                        String series = currentRow.getCell(4).getStringCellValue();
                        String number = currentRow.getCell(5).getStringCellValue();

                        Person person = new Person()
                                .setFirstName(firstName)
                                .setLastName(lastName)
                                .setPatronymicName(patronymicName)
                                .setBirthDate(birthDate)
                                .setPassport(new Passport()
                                        .setSeries(series)
                                        .setNumber(number));
                        personsFromExcel.add(person);
                    } catch (ParseException exception) {
                        System.out.println("Формат даты не верен, либо дата отсутствует");
                    }
                }
            } catch (Exception exception) {
                System.out.println("Указанный лист не найден");
                return null;
            }
        } catch (IOException exception) {
            System.out.println("Файл не найден");
            return null;
        }
        return personsFromExcel;
    }
}
