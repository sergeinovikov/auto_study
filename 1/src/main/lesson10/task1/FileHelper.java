package main.lesson10.task1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    public List<String> readFile(File file) throws IOException {
        return Files.readAllLines(Paths.get(file.getPath()));
    }

    public Boolean saveFile(File file, List<String> inputList) throws IOException {
        List<String> outputJson = new ArrayList<>();
        outputJson.add("{");
        for (int i = 0; i < inputList.size(); i++) {
            String[] values = inputList.get(i).split("=");
            StringBuilder jsonString = new StringBuilder(" " + "\"" + values[0] + "\"" + ":");
            if (values.length == 1) {
                jsonString.append("[]");
            } else {
                if (Boolean.parseBoolean(values[1])) {
                    jsonString.append(values[1]);
                } else {
                    try {
                        Double.parseDouble(values[1]);
                        jsonString.append(values[1]);
                    } catch (IllegalArgumentException exception) {
                        try {
                            Integer.parseInt(values[0]);
                            jsonString.append(values[1]);
                        } catch (IllegalArgumentException exception2) {
                            if (values[1].equals("null")) {
                                jsonString.append(values[1]);
                            } else {
                                jsonString.append("\"").append(values[1]).append("\"");
                            }
                        }
                    }
                }
            }
            if (i < inputList.size() - 1) {
                jsonString.append(",");
            }
            outputJson.add(jsonString.toString());
        }
        outputJson.add("}");

        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        for (String currentString : outputJson) {
            writer.write(currentString + System.lineSeparator()); //  Windows: \r\n    *nix:  \n
        }
        writer.flush();
        writer.close();
        return file.length() != 0;
    }
}
