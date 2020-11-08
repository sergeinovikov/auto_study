package main.lesson10.task2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHelper extends Config {

    public Boolean write(List<String> content) throws IOException {
        File file = new File(OUTPUT_FILE);
        BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE));
        for (String currentString : content) {
            writer.write(currentString + System.lineSeparator()); //  Windows: \r\n    *nix:  \n
        }
        writer.flush();
        writer.close();
        return OUTPUT_FILE.length() != 0;
    }

}
