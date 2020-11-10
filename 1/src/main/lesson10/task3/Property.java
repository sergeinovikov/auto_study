package main.lesson10.task3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {
    private static final Properties PROPERTIES;

    public static final Integer FILEGEN_AMOUNT;
    public static final Integer FILEGEN_MINSIZE;
    public static final Integer FILEGEN_MAXSIZE;
    public static final String FILEGEN_EXTENSIONS;
    public static final String FILEGEN_OUTPUTFOLDER;


    static {
        PROPERTIES = new Properties();
        loadProperties();
        FILEGEN_AMOUNT = getIntegerProperty("filegen.amount");
        FILEGEN_MINSIZE = getIntegerProperty("filegen.minsize");
        FILEGEN_MAXSIZE = getIntegerProperty("filegen.maxsize");
        FILEGEN_EXTENSIONS = getProperty("filegen.extensions");
        FILEGEN_OUTPUTFOLDER = getProperty("filegen.outputfolder");
    }

    private static void loadProperties() {
        try {
            Property.PROPERTIES.load(new FileReader("1/src/main/lesson10/task3/application.properties"));
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
