package main.lesson10.task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Application {
    public static void main(String[] args) throws IOException {
        File deleteFiles = new File(String.valueOf(Paths.get(Property.FILEGEN_OUTPUTFOLDER)));
        for (File currentFile : Objects.requireNonNull(deleteFiles.listFiles())) {
            currentFile.delete();
        }

        List<File> filesDefault = new FileGen().generate();
        System.out.printf("Без параметров%n");
        for (File currentFile : filesDefault) {
            System.out.printf("%s : %d%n", currentFile.getName(), Files.size(Paths.get(currentFile.getPath())));
        }

        System.out.printf("%n%nС один параметром - количество 5%n");
        int amount = 5;
        List<File> filesOneParameter = new FileGen(amount).generate();
        for (File currentFile : filesOneParameter) {
            System.out.printf("%s : %d%n", currentFile.getName(), Files.size(Paths.get(currentFile.getPath())));
        }

        System.out.printf("%n%nС двумя параметрами - количество 8, размеры мин. 100 макс 1000%n");
        amount = 8;
        List<Integer> sizes = new ArrayList<>();
        sizes.add(100);
        sizes.add(1000);
        List<File> filesTwoParameters = new FileGen(amount, sizes).generate();
        for (File currentFile : filesTwoParameters) {
            System.out.printf("%s : %d%n", currentFile.getName(), Files.size(Paths.get(currentFile.getPath())));
        }

        System.out.printf("%n%nС тремя параметрами - количество 4, размеры мин. 1 макс 28, разрешения только DOC и TXT%n");
        amount = 4;
        List<Integer> newSizes = new ArrayList<>();
        newSizes.add(1);
        newSizes.add(28);
        List<String> extensions = new ArrayList<>();
        extensions.add("DOC");
        extensions.add("TXT");
        List<File> filesThreeParameters = new FileGen(amount, newSizes, extensions).generate();
        for (File currentFile : filesThreeParameters) {
            System.out.printf("%s : %d%n", currentFile.getName(), Files.size(Paths.get(currentFile.getPath())));
        }
    }
}
