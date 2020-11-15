package main.lesson10.task4.entities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {
    private static final Properties PROPERTIES;

    public static final Integer EMPLOYEE_LASTNAME_LENGHT;
    public static final Integer EMPLOYEE_FIRSTNAME_LENGHT;
    public static final String EMPLOYEE_NAME_PATTERN;
    public static final Double EMPLOYEE_SALARY_MIN;
    public static final Double EMPLOYEE_SALARY_MAX;
    public static final Integer PASSPORT_SERIES_DIGITS;
    public static final Integer PASSPORT_NUMBER_DIGITS;
    public static final String SALARY_DATE_FORMAT;
    public static final Integer SALARY_EMPLOYEE_COUNT;
    public static final String SALARY_OUTPUT_FILE;
    public static final String CASH_OUTPUT_FILE;
    public static final String CASH_NOMINALS;


    static {
        PROPERTIES = new Properties();
        loadProperties();
        EMPLOYEE_LASTNAME_LENGHT = getIntegerProperty("employee.lastname.length");
        EMPLOYEE_FIRSTNAME_LENGHT = getIntegerProperty("employee.firstname.length");
        EMPLOYEE_NAME_PATTERN = getProperty("employee.name.pattern");
        EMPLOYEE_SALARY_MIN = getDoubleProperty("employee.salary.min");
        EMPLOYEE_SALARY_MAX = getDoubleProperty("employee.salary.max");
        PASSPORT_SERIES_DIGITS = getIntegerProperty("passport.series.digits");
        PASSPORT_NUMBER_DIGITS = getIntegerProperty("passport.number.digits");
        SALARY_DATE_FORMAT = getProperty("salary.date.format");
        SALARY_EMPLOYEE_COUNT = getIntegerProperty("salary.employee.count");
        SALARY_OUTPUT_FILE = getProperty("salary.output.file");
        CASH_OUTPUT_FILE = getProperty("cash.output.file");
        CASH_NOMINALS = getProperty("cash.nominals");
    }

    private static void loadProperties() {
        try {
            Property.PROPERTIES.load(new FileReader("1/src/main/lesson10/task4/application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }

    private static Integer getIntegerProperty(String key) {
        return Integer.parseInt(getProperty(key));
    }

    private static Double getDoubleProperty(String key) {
        return Double.parseDouble(getProperty(key));
    }

}
