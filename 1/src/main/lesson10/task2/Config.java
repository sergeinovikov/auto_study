package main.lesson10.task2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Config {
    private static final Properties PROPERTIES;

    public static final String OUTPUT_FILE;
    public static final Integer LINES_AMOUNT;
    public static final Integer LINES_MAX_LENGHT;
    public static final Integer LINES_MIN_LENGHT;
    public static final String LINES_PATTERN;
    public static final String LINES_MESSAGE;


    static {
        PROPERTIES = new Properties();
        loadProperties();
        OUTPUT_FILE = getProperty("output.file");
        LINES_AMOUNT = getIntegerProperty("lines.amount");
        LINES_MAX_LENGHT = getIntegerProperty("lines.max.length");
        LINES_MIN_LENGHT = getIntegerProperty("lines.min.length");
        LINES_PATTERN = getProperty("lines.pattern");
        LINES_MESSAGE = getProperty("lines.message");
    }

    private static void loadProperties() {
        try {
            Config.PROPERTIES.load(new FileReader("1/src/main/lesson10/task2/application.properties"));
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

}
