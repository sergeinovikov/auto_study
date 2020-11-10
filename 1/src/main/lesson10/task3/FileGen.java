package main.lesson10.task3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FileGen extends Property {
    private Integer amount;
    private List<Integer> sizes;
    private List<String> extensions;

    public FileGen() {
        initValues();
    }

    public FileGen(int amount) {
        this.amount = amount;
        initValues();
    }

    public FileGen(int amount, List<Integer> sizes) {
        this.amount = amount;
        this.sizes = sizes;
        initValues();
    }

    public FileGen(int amount, List<Integer> sizes, List<String> extensions) {
        this.amount = amount;
        this.sizes = sizes;
        this.extensions = extensions;
        initValues();
    }

    private void initValues() {
        if (amount == null)
            amount = FILEGEN_AMOUNT;
        if (sizes == null || sizes.isEmpty()) {
            sizes = new ArrayList<>(0);
            sizes.add(FILEGEN_MINSIZE);
            sizes.add(FILEGEN_MAXSIZE);
        }
        if (extensions == null || extensions.isEmpty()) {
            extensions = new ArrayList<>(0);
            String[] extensionsArray = FILEGEN_EXTENSIONS.split(",");
            extensions.addAll(Arrays.asList(extensionsArray));
        }

    }

    public List<File> generate() throws IOException {
        List<File> files = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            int randomSize = new Random().nextInt(sizes.get(1) - sizes.get(0) + 1) + sizes.get(0);
            String randomExtension = extensions.get(new Random().nextInt(extensions.size()));
            int randomName = new Random().nextInt(999999 - 100000 + 1) + 100000;
            StringBuilder path = new StringBuilder(FILEGEN_OUTPUTFOLDER).append("/").append("generatedFile").append(randomName).append(".").append(randomExtension);
            File file = new File(String.valueOf(path));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int j = 0; j < randomSize; j++) {
                writer.write("f"); //  Windows: \r\n    *nix:  \n
            }
            writer.flush();
            writer.close();
            files.add(file);
        }
        return files;
    }
}
