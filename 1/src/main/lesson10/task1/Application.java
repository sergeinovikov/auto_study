package main.lesson10.task1;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("1/src/main/lesson10/task1/files/input.txt");
        List<String> inputStrings = new FileHelper().readFile(inputFile);

        File outputFile = new File("1/src/main/lesson10/task1/files/output.txt");
        Boolean success = new FileHelper().saveFile(outputFile, inputStrings);

        if (success)
            System.out.println("Оперция преобразования данных в форма JSon выполнена успешно!");
        else
            System.out.println("Что-то пошло не так :(");
    }
}
